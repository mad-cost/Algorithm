import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1717 / 유니온 파인드
public class Main {
  static int[] parent; // 대표 노드를 담을 배열

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken()); // 7
    int M = Integer.parseInt(st.nextToken()); // 8

    parent = new int[N + 1]; // 0 ~ 7
    // 대표노드 자기자신 초기화
    for (int i = 0; i <= N; i++) {
      parent[i] = i;
    }

    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int question = Integer.parseInt(st.nextToken());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      if (question == 0) {
        union(a, b);
      } else { // question == 1
        if (checkSame(a, b)) {
          System.out.println("YES");
        } else {
          System.out.println("NO");
        }
      }
    }
  }

  public static void union(int a, int b) {
    a = find(a);
    b = find(b);
    if (a != b) { // 두 값이 다르면 대표노드의 값을 자식 노드에 넣어준다
      parent[b] = a;
    }
  }

  public static int find(int a) {
    if (a == parent[a]) {
      return a;
    } else {
      return parent[a] = find(parent[a]);
    }
  }

  public static boolean checkSame(int a, int b) {
    a = find(a);
    b = find(b);
    if (a == b) {
      return true;
    } else {
      return false;
    }
  }
}
