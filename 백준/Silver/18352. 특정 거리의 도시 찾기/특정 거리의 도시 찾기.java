import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 18352 BFS (가중치 없는 그래프 인접 리스트)
public class Main {
  static ArrayList<Integer>[] A; // 인접 리스트
  static int[] visited;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()); /// 4 4 2 1
    int N = Integer.parseInt(st.nextToken()); // 4
    int M = Integer.parseInt(st.nextToken()); // 4
    int K = Integer.parseInt(st.nextToken()); // 2
    int X = Integer.parseInt(st.nextToken()); // 1

    A = new ArrayList[N + 1];
    List<Integer> answer = new ArrayList<>(); // 결과 값을 담을 배열

    for (int i = 1; i <= N; i++) {
      A[i] = new ArrayList<>(); // ?
    }

    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int S = Integer.parseInt(st.nextToken());
      int E = Integer.parseInt(st.nextToken());
      A[S].add(E); // 단방향 설정
    }

    visited = new int[N + 1];
    for (int i = 0; i <= N; i++) {
      visited[i] = -1;
    }
    BFS(X);
    for (int i = 0; i <= N; i++) {
      if (visited[i] == K)
      {
        answer.add(i);
      }
    }

    if (answer.isEmpty()) {
      System.out.println("-1");
    } else {
      Collections.sort(answer);
      for (int i : answer) {
        System.out.println(i);
      }
    }
  }

  public static void BFS(int Node) {
    Queue<Integer> queue = new LinkedList<Integer>();
    queue.add(Node);
    visited[Node]++; //시작 노드 -1 -> 0
    while (!queue.isEmpty()) {
      int nowNode = queue.poll();
      for (int i : A[nowNode]) {
        if (visited[i] == -1) {
          visited[i] = visited[nowNode] + 1;
          queue.add(i);
        }
      }
    }
  }
}


/*
>>
4 4 2 1
1 2
1 3
2 3
2 4
<<
4
 */