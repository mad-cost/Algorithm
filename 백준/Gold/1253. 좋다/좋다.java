import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int count = 0;
    long[] A = new long[N];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(A);

    for (int k = 0; k < N; k++) {
      long find = A[k];
      int i = 0; // head_index
      int j = N - 1; // tail_index

      while (i < j) {
        if (A[i] + A[j] == find) { // i + j = target
           if (i == k) {
            i++;
          } else if (j == k) {
            j--;
          } else if(i != j) { // 2 + 2  != 4
            count++;
            break;
          }
        } else if (A[i] + A[j] < find) { // ex) i+j -> 3 < 5
          i++;
        } else {
          j--;
        }
      }

    }
    System.out.println(count);
  }
}