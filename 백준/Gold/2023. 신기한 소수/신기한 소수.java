import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2023
public class Main {
  static int N;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine()); // 자리수 입력

    // 1일자리가 소수인 값으로 시작
    DFS(2, 1);
    DFS(3, 1);
    DFS(5, 1);
    DFS(7, 1);
  }

  static void DFS(int number, int jarisu) {
    if (jarisu == N) { // 자리수가 N이면
      if (isPrime(number)) {
        System.out.println(number); // 출력
      }
      return;
    }

    for (int i = 1; i < 10; i++) { // 1~9 중 홀수만 처리
      if (i % 2 == 0) continue; // 짝수 제외
      int nextNumber = number * 10 + i; // 자리수 확장
      if (isPrime(nextNumber)) { // 확장된 숫자가 소수라면 탐색
        DFS(nextNumber, jarisu + 1);
      }
    }
  }

  static boolean isPrime(int num) {
    if (num < 2) return false; // 0과 1은 소수가 아님
    for (int i = 2; i <= Math.sqrt(num); i++) { // \(\sqrt{num}\)까지만 확인
      if (num % i == 0) {
        return false; // 나누어 떨어지면 소수가 아님
      }
    }
    return true; // 반복문이 끝나면 소수
  }
}
