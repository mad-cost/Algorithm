import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1456 "에라토스테네스 의 체" 소수 구하기
public class Main {
  static int[] A;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()); // 3 16
    int N = Integer.parseInt(st.nextToken()); // 3
    int M = Integer.parseInt(st.nextToken()); // 16

    // A 배열 초기화
    A = new int[M + 1];
    for (int i = 2; i < M+1; i++) { // 1은 소수가 아니다
      A[i] = i;
    }

    for (int i = 2; i <= Math.sqrt(M); i++) { // Math.sqrt(N) = 16의 제곱근 / 루트 16 == 4
      if (A[i] == 0){
        continue;
      }
      for (int j = 2 * i; j <= M ; j = j + i) { // j = j + i -> x2 숫자부터 i 만큼 씩 확인
        A[j] = 0;
      }
    }

    for (int i = N; i <= M ; i++) {
      if (A[i] != 0){
        System.out.println(A[i]);
      }
    }
  }
}