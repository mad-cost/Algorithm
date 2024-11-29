import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine()); // 6
    int M = Integer.parseInt(br.readLine()); // 9
    int[] A = new int[N];

    StringTokenizer st = new StringTokenizer(br.readLine()); // 2 7 4 1 5 3
    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(A); // A = [1, 2, 3, 4, 5, 7]

    int count = 0;
    int i = 0; // headIndex
    int j = N - 1;  // tailIndex

    while (i < j) {
      if (A[i] + A[j] == M) {
        count++;
        i++;
        j--;
      } else if (A[i] + A[j] < M) {
        i++;
      } else {
        j--;
      }
    }
    System.out.print(count);
    br.close();
  }
}