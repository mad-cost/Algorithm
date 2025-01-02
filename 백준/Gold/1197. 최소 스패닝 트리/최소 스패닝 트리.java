import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 1197 / 최소 신장 트리 MST
public class Main {
  static int[] parent;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken()); // 3 노드 수
    int M = Integer.parseInt(st.nextToken()); // 3 엣지 수

    // 우선 순위 큐 (가중치 오름차순)
    PriorityQueue<Edge> queue = new PriorityQueue<>();

    // 유니온 파인드 배열
    parent = new int[N + 1];
    // 자기 자신으로 초기화
    for (int i = 0; i <= N; i++) {
      parent[i] = i;
    }

    // 우선 순위 큐 입력값 넣어주기
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int s = Integer.parseInt(st.nextToken());
      int e = Integer.parseInt(st.nextToken());
      int v = Integer.parseInt(st.nextToken());
      queue.add(new Edge(s, e, v));
    }

    int useEdge = 0; // 사용하는 간선 수 count
    int result = 0; // 가중치들의 합

    // 최소 신장 트리 시작
    while (useEdge < N - 1) { // useEdge가 `N-1`의 경우 모든 노드 연결 완료
      Edge now = queue.poll(); // 가중치가 낮은 순으로 값 꺼내기
      if (find(now.s) != find(now.e)) { // 대표노드가 다를 경우 사이클이 존재하지 않는다 / 반대로 대표노드가 같을 경우 사이클 존재
        union(now.s, now.e);
        result += now.v; // 가중치 합 update
        useEdge++; // 사용하는 간선 수 증가
      }
    }
    System.out.println(result);
  }

  // union 연산
  public static void union(int a, int b) {
    a = find(a);
    b = find(b);
    if (a != b) {
      parent[b] = a;
    }
  }

  // find 연산
  public static int find(int a) {
    if (parent[a] == a) {
      return a;
    } else {
      return parent[a] = find(parent[a]);
    }
  }
}

// 우선 순위 큐
class Edge implements Comparable<Edge> {
  int s, e, v;

  Edge(int s, int e, int v) {
    this.s = s;
    this.e = e;
    this.v = v;
  }

  // 우선 순위 : 가중치 기준 오름차순 정렬
  @Override
  public int compareTo(Edge e) {
    return this.v - e.v;
  }
}
