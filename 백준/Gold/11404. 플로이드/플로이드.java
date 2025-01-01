import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 11404 / 플로이드 워셜
public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine()); // 도시의 개수
    int M = Integer.parseInt(br.readLine()); // 버스의 개수

    // 인접 행렬 초기화
    int[][] distance = new int[N + 1][N + 1];
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= N; j++) {
        if (i == j) {
          distance[i][j] = 0; // 자기 자신으로 가는 비용은 0
        } else {
          distance[i][j] = Integer.MAX_VALUE; // 초기값 무한대
        }
      }
    }

    // 간선 입력
    for (int i = 0; i < M; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int s = Integer.parseInt(st.nextToken());
      int e = Integer.parseInt(st.nextToken());
      int v = Integer.parseInt(st.nextToken());
      distance[s][e] = Math.min(distance[s][e], v); // 더 작은 값만 저장
    }

    // 플로이드-워셜 알고리즘
    for (int k = 1; k <= N; k++) { // 경유지
      for (int i = 1; i <= N; i++) { // 출발지
        for (int j = 1; j <= N; j++) { // 도착지
          if (distance[i][k] != Integer.MAX_VALUE && distance[k][j] != Integer.MAX_VALUE) {
            distance[i][j] = Math.min(distance[i][j], distance[i][k] + distance[k][j]);
          }
        }
      }
    }

    // 결과 출력
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= N; j++) {
        if (distance[i][j] == Integer.MAX_VALUE) {
          System.out.print("0 ");
        } else {
          System.out.print(distance[i][j] + " ");
        }
      }
      System.out.println();
    }
  }
}
