import java.io.*;
import java.util.*;

// HashMap 사용
class Main {
  static StringTokenizer st;
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    HashMap<Integer, Integer> map = new HashMap<>();

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      int num = Integer.parseInt(st.nextToken());
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    int M = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < M; i++) {
      int target = Integer.parseInt(st.nextToken());
      System.out.print(map.getOrDefault(target, 0) + " ");
    }

  }
}