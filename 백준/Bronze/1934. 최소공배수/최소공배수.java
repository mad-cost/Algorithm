import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1934 "유클리드 호제법(최대 공약수)을 사용하여 최소 공배수 구하기
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()); // 3
    int A = Integer.parseInt(st.nextToken());

    int bigN = 0;
    int smallN = 0;

    for (int i = 0; i < A; i++) {
      st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());

      if (N > M) {
        bigN = N;
        smallN = M;
      } else {
        bigN = M;
        smallN = N;
      }
      // 최소 공배수 = N * M / 최대 공약수
      System.out.println(N * M / gcd(bigN, smallN));
    }
  }

  public static int gcd(int N, int M) {
    if (M == 0) {
      return N;
    }
    return gcd(M, N % M);
  }
}


/*
>>
6 10
<<
30
 */