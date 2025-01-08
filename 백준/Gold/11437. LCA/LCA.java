import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 11437 / 최소 공통 조상 구하기 (트리)
public class Main {
  static ArrayList<Integer>[] tree;
  static int[] depth;
  static int[] parent;
  static boolean[] visited;
  static StringTokenizer st;
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine()); // 15
    tree = new ArrayList[N + 1]; // 0 ~ 15
    // tree 인접리스트에 각 ArrayList 초기화
    for (int i = 1; i <= N ; i++) {
      tree[i] = new ArrayList<>();
    }
    // 인접리스트에 문제에서 입력된 노드 연결
    for (int i = 0; i < N - 1; i++) {
      st = new StringTokenizer(br.readLine());
      int s = Integer.parseInt(st.nextToken());
      int e = Integer.parseInt(st.nextToken());
      tree[s].add(e);
      tree[e].add(s);
    }

    depth = new int[N + 1];
    parent = new int[N + 1];
    visited = new boolean[N + 1]; // 초기값 false

    BFS(1);

    int M = Integer.parseInt(br.readLine()); // 6 / 질의의 수
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int LCA = excuteLCA(a, b);
      System.out.println(LCA);
    }
  }

  // a, b의 최소 공통 조상 구하기
  static int excuteLCA(int a, int b){
    if (depth[a] < depth[b]){ // 깊이 비교
      int temp = a;
      a = b;
      b = temp;
    }
    while (depth[a] != depth[b]){ // 두 노드의 depth 맞추기
      a = parent[a];
    }
    while (a != b){ // 두 노드를 한 칸씩 올리며 최소 공통 조상 찾기
      a = parent[a];
      b = parent[b];
    }// 최소 공통 조상을 찾았을 경우 종료
    return a; // 최소 공토 조상 반환
  }

  // BFS를 사용하여 데이터 채워주기
  private static void BFS(int node){
    Queue<Integer> queue = new LinkedList<Integer>();
    queue.add(node);
    visited[node] = true; // 1번 노드 방문 처리
    int level = 1; // 트리의 깊이
    int now_size = 1;
    int count = 0;

    while (!queue.isEmpty()){
      int now_node = queue.poll();

      for (int next : tree[now_node]){
        if (!visited[next]){ // 아직 방문하지 않았다면
          visited[next] = true; // 방문 처리
          queue.add(next);
          parent[next] = now_node;
          depth[next] = level;
        }
      }
      count ++; // 큐에 들어있는 개수를 체크해 주기 위해

      if (count == now_size){ // 큐에 들어있던 개수와 count가 같아지면
        count = 0;
        now_size = queue.size();
        level++;
      }
    }
  }

}