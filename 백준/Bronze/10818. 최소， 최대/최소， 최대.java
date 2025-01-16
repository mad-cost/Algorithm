import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static StringTokenizer st ;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine()); // 5
    StringTokenizer st = new StringTokenizer(br.readLine());

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < N; i++) {
      int num = Integer.parseInt(st.nextToken());
      if (min > num){
        min = num;
      }
      if (max < num){
        max = num;
      }
    }

    System.out.println(min+" "+max);
  }
}