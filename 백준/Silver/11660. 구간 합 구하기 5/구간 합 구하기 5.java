import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 11659 누적합 공식 사용 복습
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()); // 4 3
    int N = Integer.parseInt(st.nextToken()); // 4
    int M = Integer.parseInt(st.nextToken()); // 3

    int[][] A = new int[N+1][N+1];
    for (int i = 1; i <= N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 1; j <= N; j++) {
        A[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    // 누적 합 생성
    int[][] S = new int[N+1][N+1];
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= N; j++) {
        S[i][j] = S[i][j-1] + S[i-1][j] - S[i-1][j-1] + A[i][j]; // 내 왼쪽 + 내 위쪽 - 대각선 + 내자신
      }
    }

    for (int i = 0; i < M; i++) {
      int result = 0;
      st = new StringTokenizer(br.readLine());
      int x1 = Integer.parseInt(st.nextToken());
      int y1 = Integer.parseInt(st.nextToken());
      int x2 = Integer.parseInt(st.nextToken());
      int y2 = Integer.parseInt(st.nextToken());

      result = S[x2][y2] - S[x1-1][y2] - S[x2][y1-1] + S[x1-1][y1-1];
      System.out.println(result);
    }
  }
}
/*
>>
4 3
1 2 3 4
2 3 4 5
3 4 5 6
4 5 6 7
2 2 3 4
3 4 3 4
1 1 4 4
<<
27
6
64
 */