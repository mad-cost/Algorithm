import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 10986 / 합 배열, 조합
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken()); // 5
    int M = Integer.parseInt(st.nextToken()); // 3

    long[] S = new long[N];
    long[] C = new long[M];

    st = new StringTokenizer(br.readLine()); // 1 2 3 1 2

    // 누적 합 S
    S[0] = Integer.parseInt(st.nextToken());
    for (int i= 1; i < N; i++){
      S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
    }

    long result = 0;
    for (int i = 0; i < N; i++) {
      int remainder = (int)(S[i] % M); // 누적 합 %3

      if (remainder == 0){
        result ++;
      }

      C[remainder] ++; // 조합에서 사용 할 0과 1의 갯수
    }

    for (int i = 0; i < M; i++) {
      if (C[i] > 1) { // 2장을 뽑기 때문
        result += (C[i] * (C[i] - 1)) / 2; // ex) 3C2 -> 3P2 / 2! -> (3*2) / 2
      }
    }

    System.out.println(result);
  }
}
/*
>>
5 3
1 2 3 1 2
<<
7
 */