import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int[] arr = new int[N + 1];

    for (int i = 0; i < N + 1; i++) {
      arr[i] = i;
    }

    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int selectOne = Integer.parseInt(st.nextToken());
      int selectTwo = Integer.parseInt(st.nextToken());
      Temp(selectOne, selectTwo, arr);
    }
    for (int i = 1; i < N+1; i++) {
      System.out.print(arr[i] + " ");
    }
  }
  public static void Temp(int selectOne, int selectTwo, int[] arr) {
    int temp = arr[selectOne];
    arr[selectOne] = arr[selectTwo];
    arr[selectTwo] = temp;
  }
}
