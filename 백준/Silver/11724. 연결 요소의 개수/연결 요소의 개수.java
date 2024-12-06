import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 11724 DFS 재귀로 구현
public class Main {
  static ArrayList<Integer>[] A;
  static boolean visited[];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()); // 6
    int N = Integer.parseInt(st.nextToken()); // 6
    int M = Integer.parseInt(st.nextToken()); // 5
    // 초기화
    A = new ArrayList[N+1];
    visited = new boolean[N+1];
    int count = 0; // 연결 요소 개수 체크

    for (int i = 1; i < N+1; i++) {
      A[i] = new ArrayList<Integer>();
    }
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine()); // 1 2
      int s = Integer.parseInt(st.nextToken()); // 1
      int e = Integer.parseInt(st.nextToken()); // 2
      // 양방향
      A[s].add(e);
      A[e].add(s);
    }
    for (int i = 1; i < N+1; i++) { // 데이터 확인
      if (!visited[i]){ // 방문하지 않은 노드라면 if문 실행
        count ++;
        DFS(i);
      }
    }
    System.out.println(count);
  }
  static void DFS(int v){
    if (visited[v]){ // 재귀 호출 시 방문 했던 노드라면 return으로 빠져나오기
      return;
    }
    // 방문하지 않은 노드일 경우 실행
    visited[v] = true; // 노드 방문 표시
    for (int i : A[v]){
      if (visited[i] == false){ // 방문하지 않은 노드라면 재귀 호출을 통해 방문해주기
        DFS(i);
      }
    }
  }
}