import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 11752 / 세그먼트 트리
public class Main {
  static long[] tree;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken()); // 수의 개수
    int M = Integer.parseInt(st.nextToken()); // 변경이 일어나는 횟수
    int K = Integer.parseInt(st.nextToken()); // 구간 합을 구하는 횟수

    int treeHeight = 0; // 트리의 높이
    int length = N;
    while (length != 0) {
      length = length / 2; // 5, 2, 1
      treeHeight++; // treeHeight = 3
    }

    int treeSize = (int) Math.pow(2, treeHeight + 1); // 16 / 트리의 전체 크기 2^3 * 2 -> 2^4
    int leftNodeStartIndex = treeSize / 2 - 1; // 7 / 리프 노드가 시작하기 직전 위치를 계산.
    tree = new long[treeSize + 1];

    for (int i = leftNodeStartIndex + 1; i <= leftNodeStartIndex + N; i++) { // 8~12 번 노드 초기화
      tree[i] = Long.parseLong(br.readLine());
    }

    setTree(treeSize - 1); // 전체 트리 값 업데이트

    for (int i = 0; i < M+K; i++) {
      st = new StringTokenizer(br.readLine());
      long a = Integer.parseInt(st.nextToken());
      int s = Integer.parseInt(st.nextToken());
      long e = Long.parseLong(st.nextToken());
      if (a == 1){
        changeVal(leftNodeStartIndex + s, e); // 리프 노드의 s의 값을 e로 교체
      }
      else if (a == 2){
        s = s + leftNodeStartIndex;
        e = e + leftNodeStartIndex;
        System.out.println(getSum(s, (int)e)); // 리프 노드 s부터 e 까지의 합 출력
      }else {
        return;
      }
    }
  }

  private static long getSum(int s, int e){ // 9, 12
    long partSum = 0;
    while (s <= e){
      if (s % 2 == 1){ // 이 경우 값 선택
        partSum = partSum + tree[s];
        s++;
      }
      if (e % 2 == 0){ // 이 경우 값 선택
        partSum = partSum + tree[e];
        e--;
      }
      s = s / 2;
      e = e / 2;
    }
    return partSum;
  }

  private static void changeVal(int index, long val){ // 10 6
    long diff = val - tree[index]; // 6 - 3 = 3 / 부모 노드 수정을 위해 차이 구하기
    while (index > 0){ // 바뀌는 값으로 트리 전체 값 업데이트
      tree[index] = tree[index] + diff;
      index = index /2;
    }
  }
  // 전체 트리 값 업데이트
  private static void setTree(int i) { // 16 - 1 = 15 / 리프 노드의 마지막 인덱스 부터 시작
    while (i != 1) {
      tree[i / 2] = tree[i / 2] + tree[i]; // 부모노드에 자식노드의 값 더해주기
      i--;
    }
  }
}

/*
>>
5 2 2
1
2
3
4
5
1 3 6
2 2 5
1 5 2
2 3 5
<<
17
12
 */