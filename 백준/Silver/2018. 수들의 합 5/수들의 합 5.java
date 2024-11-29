import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()); // 15
    int target = Integer.parseInt(st.nextToken());

    int start_index = 1;
    int end_index = 1;
    int sum = 1;
    int count = 1;

    while (end_index != target) {
      if (sum == target) {
        count++;
        end_index++;
        sum += end_index;
      } else if (sum < target) {
        end_index++;
        sum += end_index;
      } else {
        sum -= start_index;
        start_index++;
      }
    }
    System.out.print(count);
  }
}