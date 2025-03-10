import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 11050 이항계수 (조합)
public class Main {
  static int N, K;
  static int[][] D;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken()); // 5
    int K = Integer.parseInt(st.nextToken()); // 2

    D = new int[N + 1][N + 1];
    // DP 배열 초기화
    for (int i = 0; i <= N; i++) {
      D[i][1] = i;
      D[i][0] = 1;
      D[i][i] = 1;
    }
    for (int i = 2; i <= N; i++) {
      for (int j = 1; j < i; j++) {
        // 조합 점화식
        D[i][j] = D[i - 1][j] + D[i - 1][j - 1];
      }
    }
    System.out.println(D[N][K]);
  }
}
/*
>>
5 2
<<
10
 */