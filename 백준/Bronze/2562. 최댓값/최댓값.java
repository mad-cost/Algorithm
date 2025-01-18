import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] arr = new int[10];
    for (int i = 1; i < 10; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int index = 0;
    int max = Integer.MIN_VALUE;
    for (int i = 1; i < 10; i++) {
      if (arr[i] > max){
        max = arr[i];
        index = i;
      }
    }

    System.out.println(max);
    System.out.println(index);
  }
}