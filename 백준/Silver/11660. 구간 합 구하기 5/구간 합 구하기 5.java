import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()); // 4 3
    int N = Integer.parseInt(st.nextToken()); // 4
    int M = Integer.parseInt(st.nextToken()); // 3

    int[][] A = new int[N + 1][N + 1];

    for (int i = 1; i <= N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 1; j <= N; j++) {
        A[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    int[][] DP = new int[N+1][N+1];
    // 전체 표의 최종 누적합
    for (int i = 1; i <= N; i++){
      for (int j = 1; j <= N; j++){
        DP[i][j] = DP[i][j-1] + DP[i-1][j] - DP[i-1][j-1] + A[i][j];
        // DP[i][j] 의 누적 합은 = 내 왼쪽까지의 누적 합 + 내 위쪽까지의 누적 합 - 중복된 누적 합 + 내 위치에 해당하는 자신의 값
      }
    }

    for (int i = 0; i < M; i++){
      st = new StringTokenizer(br.readLine()); // 2 2 3 4
      int x1 = Integer.parseInt(st.nextToken()); // 2
      int y1 = Integer.parseInt(st.nextToken()); // 2
      int x2 = Integer.parseInt(st.nextToken()); // 3
      int y2 = Integer.parseInt(st.nextToken()); // 4
      int result = DP[x2][y2] - DP[x1-1][y2] - DP[x2][y1-1] + DP[x1-1][y1-1];
      System.out.println(result);
    }
  }
}