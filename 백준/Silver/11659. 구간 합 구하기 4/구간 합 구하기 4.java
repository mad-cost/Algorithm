import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()); // 5 3
    int value = Integer.parseInt(st.nextToken()); // 5
    int count = Integer.parseInt(st.nextToken()); // 3

    st = new StringTokenizer(br.readLine()); // 5 4 3 2 1
    int[] S = new int[value + 1]; // 구간 합 공식

    for (int i = 1; i <= value; i++) { // 1, 2, 3, 4, 5
      S[i] += S[i - 1] + Integer.parseInt(st.nextToken());
    }

    for (int z = 0; z < count; z++) {
      st = new StringTokenizer(br.readLine()); // 2, 4
      int i = Integer.parseInt(st.nextToken());
      int j = Integer.parseInt(st.nextToken());
      System.out.println(S[j] - S[i - 1]);
    }
  }
}  