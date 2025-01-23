import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
  static StringTokenizer st;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int[] bucket = new int[N + 1];
    for (int i = 1; i <= N; i++) {
      bucket[i] = i;
    }

    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int startIndex = Integer.parseInt(st.nextToken());
      int endIndex = Integer.parseInt(st.nextToken());

      for (int j = startIndex; j <= endIndex; j++) {
        stack.push(bucket[j]);
      }

      for (int j = startIndex; j <= endIndex; j++) {
        bucket[j] = stack.pop();
      }
    }

    for (int i = 1; i <= N; i++) {
      System.out.print(bucket[i] + " ");
    }
  }
}