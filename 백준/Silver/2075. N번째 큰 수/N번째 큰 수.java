import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());

    for (int i = 0; i < n; i++) {
      String[] lineNums = br.readLine().split(" ");
      for (int j = 0; j < n; j++) {
        pQueue.offer(Integer.parseInt(lineNums[j]));
      }
    }
    // 1~4번째로 큰 숫자 우선 순위 큐에서 빼주기
    for (int i = 0; i < n-1; i++) {
      pQueue.poll();
    }
    // 5번째로 큰 숫자
    System.out.println(pQueue.peek());
  }
}