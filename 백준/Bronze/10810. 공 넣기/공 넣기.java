import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static StringTokenizer st;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int[] arr = new int[N + 1];
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int startIndex = Integer.parseInt(st.nextToken());
      int endIndex = Integer.parseInt(st.nextToken());
      int value = Integer.parseInt(st.nextToken());
      for (int j = startIndex; j <= endIndex; j++) {
        arr[j] = value;
      }
    }
    for (int i = 1; i <= N ; i++) {
      System.out.print(arr[i] + " ");
    }

  }
}