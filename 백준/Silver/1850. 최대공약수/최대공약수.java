import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1850 "유클리드 호제법(최대 공약수)을 사용하여 최소 공배수 개수 만큼 1 출력하기
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()); // 3 6
    long N = Long.parseLong(st.nextToken());
    long M = Long.parseLong(st.nextToken());
    long result = gcd(N, M);

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < result; i++) {
      sb.append("1");
    }
    System.out.println(sb.toString());

  }

  public static long gcd(long N, long M){
    if (M == 0){
      return N;
    }else {
      return gcd(M, N%M);
    }
  }
}


/*
>>
3 6
<<
111
 */