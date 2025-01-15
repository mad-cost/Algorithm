import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static StringTokenizer st ;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken()); // 10
    int X = Integer.parseInt(st.nextToken()); // 5

    st = new StringTokenizer(br.readLine()); // 값 10개 입력
    String result  = "";
    for (int i = 0; i < N; i++) {
      int num = Integer.parseInt(st.nextToken());
      if (num < X){
        result += num + " ";
      }
    }

    System.out.println(result.trim());
  }
}