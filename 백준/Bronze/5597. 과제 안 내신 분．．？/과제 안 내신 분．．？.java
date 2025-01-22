import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

// HashSet으로 풀기
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    HashSet<Integer> set = new HashSet<>();

    for (int i = 0; i < 28; i++) {
      set.add(Integer.parseInt(br.readLine()));
    }

    for (int i = 1; i <= 30; i++) {
      if (!set.contains(i)) {
        System.out.println(i);
      }
    }
  }
}
