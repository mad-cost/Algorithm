import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2747 피보나치수 / 탑다운
public class Main {
  static int[] D;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    D = new int[N + 1];
    for (int i = 0; i <= N; i++) {
      D[i] = -1;
    }
    // DP 테이블 초기화
    D[0] = 0;
    D[1] = 1;
    fibo(N);
    System.out.println(D[N]);
  }

  static int fibo(int n) {
    if (D[n] != -1) {
      return D[n];
    }
    return D[n] = fibo(n - 2) + fibo(n - 1); // 피보나치 수열 점화식
  }
}
