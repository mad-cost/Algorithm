import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    HashSet<Integer> set = new HashSet<>(); // HashSet은 중복을 허용하지 않음
    for (int i = 0; i < 10; i++) { // 10 번 입력
      set.add(Integer.parseInt(br.readLine()) % 42);
    }
    System.out.println(set.size());
  }
}
