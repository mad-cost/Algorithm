import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = String.valueOf(br.readLine()); // 2143
    int[] A = new int[str.length()];
    for (int i = 0; i < str.length(); i++) {
      A[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
    }

    for (int i = 0; i < str.length(); i++) {
      int maxIndex = i;
      for (int j = i + 1; j < str.length(); j++) {
        if (A[maxIndex] < A[j]) {
          maxIndex = j;
        }
      }
      if (A[i] < A[maxIndex]) {
        int temp = A[i];
        A[i] = A[maxIndex];
        A[maxIndex] = temp;
      }
    }
    for (int i = 0; i < str.length(); i++) {
      System.out.print(A[i]);
    }
  }
}
