import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 314288
public class Main {
  static String[] A;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken()); // 5
    int count = 0;

    A = new String[N];
    st = new StringTokenizer(br.readLine()); // I A I S S
    for (int i = 0; i < N; i++) {
      A[i] = st.nextToken();
    }
    String myMajor = br.readLine(); // S

    for (int i = 0; i < N; i++) {
      if (A[i].equals(myMajor)){
        count ++;
      }
    }
    System.out.println(count);
  }
}
/*
 Cloud 트랙은 'C', SW 엔지니어 트랙은 'S', IOT 트랙은 'I', AI 트랙은 'A'로 주어진다.
>>
5
I A I S S
S
<<
2
 */