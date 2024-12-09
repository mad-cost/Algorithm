import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 1260 DFS / BFS 코드 기초
public class Main {
  // 아래 오른쪽, 위, 왼쪽
  static int[] dx = {0, 1, 0, -1};
  static int[] dy = {1, 0, -1, 0};
  static int[][] A ;
  static boolean[][] visited;
  static int N, M;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()); // 4 6
    N = Integer.parseInt(st.nextToken()); // 4
    M = Integer.parseInt(st.nextToken()); // 6

    // 초기화
    A = new int[N][M]; // 높이 4 / 가로 6
    visited = new boolean[N][M];
    // A 배열 값 대입
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      String line = st.nextToken(); // 101111
      for (int j = 0; j < M; j++) {
        A[i][j] = Integer.parseInt(line.substring(j, j+1));
      }

    }
    BFS(0,0); // 배열의 시작점 0,0 부터 시작
    System.out.println(A[N-1][M-1]); // 배열이 0부터 시작하기 때문에 -1
  }

  public static void BFS(int i, int j){
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[] {i, j});
    visited[i][j] = true;

    while (!queue.isEmpty()){ // 큐가 비어있지 않다면
      int now[] = queue.poll();
      // 상하좌우 탐색
      for (int k = 0; k < 4; k++) {
        int x = now[0] + dx[k];
        int y = now[1] + dy[k];
        if (x >= 0 && y >= 0 && x < N && y < M){ // 좌표가 범위 안에 존재 하는지
          if (A[x][y] != 0 && !visited[x][y]){ // 현재 위치가 0이 아니고, 방문하지 않았는지
            visited[x][y] = true;
            // k에 의해 새로 이동한 A[x][y] 배열에 k에 의해 이동하기 전 값인 A[now[0]][now[1]]의 배열의 값 + 1 해주기
            A[x][y] = A[now[0]][now[1]] + 1;
            // 큐에 k에 의해 이동한 값 넣어주기
            queue.add(new int[] {x,y});
          }
        }
      }
    }
  }
}
/*
입력
4 6
101111
101010
101011
111011
출력
15
 */