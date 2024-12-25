import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 2252 / 위상 정렬
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()); // 4 2
    int N = Integer.parseInt(st.nextToken()); // 4
    int M = Integer.parseInt(st.nextToken()); // 2

    // 인접리스트 A 생성
    ArrayList<ArrayList<Integer>> A = new ArrayList<>();
    for (int i = 0; i <= N; i++) {
      A.add(new ArrayList<>());
    }

    int[] inDegree = new int[N + 1]; // 진입 차수 배열 생성

    // 데이터 초기화
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine()); // 4 2 / 3 1
      int S = Integer.parseInt(st.nextToken());
      int E = Integer.parseInt(st.nextToken());
      A.get(S).add(E); // 인접리스트 값 초기화
      inDegree[E]++; // 진입 차수 배열 값 초기화
    }

    Queue<Integer> queue = new LinkedList<>();

    for (int i = 1; i <= N; i++) {
      if (inDegree[i] == 0){ // 진입차수가 `0`이라면 queue에 대입
        queue.offer(i); // add
      }
    }

    while (!queue.isEmpty()){
      int now = queue.poll();
      System.out.println(now + " ");
      for (int next : A.get(now)){
        inDegree[next] --;
        if (inDegree[next] == 0){
          queue.offer(next);
        }
      }
    }

  }
}
/*
>>
4 2
4 2
3 1
<<
3412
 */
