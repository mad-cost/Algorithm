import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 11752 / 트리
public class Main {
  static boolean[] visited;
  static ArrayList<Integer>[] tree;
  static int[] answer;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine()); // 7

    tree = new ArrayList[N + 1];// 인접 리스트
    visited = new boolean[N + 1]; // 0 ~ 7
    answer = new int[N + 1]; // 0~7

    // 각 노드에 대해 인접리스트 초기화
    for (int i = 0; i <= N; i++) {
      tree[i] = new ArrayList<>();
    }

    // 인접 리스트 입력값 대입
    for (int i = 0; i < N - 1; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n1 = Integer.parseInt(st.nextToken());
      int n2 = Integer.parseInt(st.nextToken());
      tree[n1].add(n2);
      tree[n2].add(n1);
    }

    DFS(1);
    for (int i = 2; i <= N; i++) {
      System.out.println(answer[i]);
    }
  }

  static public void DFS(int number) {
    visited[number] = true;
    for (int i : tree[number]) {
      if (!visited[i]) { // 방문 하지 않은 노드 라면
        answer[i] = number;
        DFS(i);
      }
    }
  }
}