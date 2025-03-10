import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Math 클래스 사용해서 풀어보기
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine()); // 5
    StringTokenizer st = new StringTokenizer(br.readLine());

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < N; i++) {
      int num = Integer.parseInt(st.nextToken());
      max = Math.max(max, num);
      min = Math.min(min, num);
    }
    System.out.println(min + " " + max);
  }
}