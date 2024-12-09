import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 1260 DFS / BFS 코드 기초
public class Main {
   static ArrayList<Integer>[] A;
   static boolean[] visited;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken()); // 4 - 노드 개수
    int M = Integer.parseInt(st.nextToken()); // 5 - 엣지 개수
    int Start = Integer.parseInt(st.nextToken()); // 1 - 시작점

     A = new ArrayList[N+1];  // 인접 리스트 초기화

    for (int i = 1; i < N+1; i++) {
       A[i] = new ArrayList<Integer>();
    }
    // 인접리스트에 값 대입
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int S = Integer.parseInt(st.nextToken());
      int E = Integer.parseInt(st.nextToken());
      A[S].add(E);
      A[E].add(S);
    }

    // 인접 리스트 정렬
    for (int i = 1; i <= N ; i++) {
      Collections.sort(A[i]);
    }

    visited = new boolean[N+1]; // 방문 배열 초기화
    DFS(Start);
    System.out.println();
    visited = new boolean[N+1]; // 방문 배열 초기화
    BFS(Start);
  }

  static void DFS(int Node){
    System.out.print(Node +" ");
    visited[Node] = true;
    for (int i : A[Node]){
      if (!visited[i]){
        DFS(i);
      }
    }
  }

  static void BFS(int Node){
    Queue<Integer> queue = new LinkedList<>();
    queue.add(Node);
    visited[Node] = true;

    while (!queue.isEmpty()){ // queue에 값이 들어 있다면
      int nowNode = queue.poll();
      System.out.print(nowNode + " ");
      for (int i : A[nowNode]){ // 2 3 4
        if (!visited[i]){
          visited[i] = true;
          queue.add(i);
        }
      }
    }
  }
}
