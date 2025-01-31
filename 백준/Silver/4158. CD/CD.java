import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

// 4158 HashSet 사용
class Main {
  static StringTokenizer st;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true){
      st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());

      int count = 0;
      HashSet<Integer> set = new HashSet<>();

      if (N == 0 && M == 0){
        break;
      }
      for (int i = 0; i < N; i++) {
        set.add(Integer.parseInt(br.readLine()));
      }
      for (int i = 0; i < M; i++) {
        if (set.contains(Integer.parseInt(br.readLine()))){
          count ++;
        }
      }
      System.out.println(count);
    }
  }
}
/*
>>
3 3
1
2
3
1
2
4
0 0
<<
2
 */