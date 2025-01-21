import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
  static StringTokenizer st;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine()); // 1
    StringBuilder sb = new StringBuilder();


    for (int i = 0; i < T; i++){
      HashSet<Integer> set = new HashSet<>(); // T가 1이 아닌 경우가 있을 수 있기 때문에 HashSet 초기화 필요
      
      int N = Integer.parseInt(br.readLine()); // 5
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < N; j++){
        set.add(Integer.parseInt(st.nextToken()));
      }

      int M = Integer.parseInt(br.readLine()); // 5
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < M; j++) {
        if (set.contains(Integer.parseInt(st.nextToken()))){
          sb.append("1").append("\n");
        }else {
          sb.append("0").append("\n");
        }
      }
    }
    System.out.println(sb);
  }
}
