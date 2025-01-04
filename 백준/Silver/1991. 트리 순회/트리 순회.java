import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 11752 / 트리
public class Main {
  static int[][] tree;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine()); // 7
    tree = new int[26][2]; // [알파벳 개수][왼쪽자식, 오른쪽 자식]

    for (int i = 0; i < N; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      int node = st.nextToken().charAt(0)-'A';
      char left = st.nextToken().charAt(0);
      char right = st.nextToken().charAt(0);

      if (left == '.'){
        tree[node][0] = -1;
      }else {
        tree[node][0] = left - 'A';
      }
      if (right == '.'){
        tree[node][1] = -1;
      }else {
        tree[node][1] = right - 'A';
      }
    }
    preOrder(0);
    System.out.println();
    inOrder(0);
    System.out.println();
    postOrder(0);
    System.out.println();
  }
  public static void preOrder(int now){
    if (now == -1){
      return;
    }
    System.out.print((char) (now + 'A')); // 루트
    preOrder(tree[now][0]); // 왼쪽 자식
    preOrder(tree[now][1]);
  }

  public static void inOrder(int now){
    if (now == -1){
      return;
    }
    inOrder(tree[now][0]); // 왼쪽 자식
    System.out.print((char) (now + 'A'));
    inOrder(tree[now][1]);
  }

  public static void postOrder(int now){
   if (now == -1){
     return;
   }
   postOrder(tree[now][0]);
   postOrder(tree[now][1]);
    System.out.print((char) (now + 'A'));
  }
}