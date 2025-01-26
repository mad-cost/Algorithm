import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// HashSet 사용
public class Main {
  static StringTokenizer st;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    HashSet<Integer> set = new HashSet<>();
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      set.add(Integer.parseInt(st.nextToken())); // 4 1 5 2 3
    }

    int M = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine()); // 1 3 7 9 5
    for (int i = 0; i < M; i++) {
      if (set.contains(Integer.parseInt(st.nextToken()))){
        System.out.println("1");
      }else {
        System.out.println("0");
      }
    }
  }
}