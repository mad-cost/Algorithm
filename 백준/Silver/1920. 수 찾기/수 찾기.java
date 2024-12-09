import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 1920 이진 탐색
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine()); // 5
    int[] A = new int[N];

    // A배열 초기화
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(st.nextToken()); // 4 1 5 2 3
    }
    Arrays.sort(A); // A = [1, 2, 3, 4, 5]

    int M = Integer.parseInt(br.readLine()); // 5
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < M; i++) {
      boolean find = false;
      int target = Integer.parseInt(st.nextToken());
      int startIndex = 0;
      int endIndex = A.length - 1;
      // startIndex가 endIndex보다 작거나 같을 때 까지만 진행
      while (startIndex <= endIndex){
        int midIndex = (startIndex + endIndex) / 2; // 배열의 중앙 인덱스
        int midValue = A[midIndex]; // 중앙 값
        // 값 비교
        if (target < midValue){
          endIndex = midIndex - 1;
        }else if (midValue < target){
          startIndex = midIndex + 1;
        }else { // 둘 다 아니면 midValue == target
          find = true;
          break; // while문을 빠져 나온다
        }
      }
      if (find){ // find == true
        System.out.println(1);
      }else {
        System.out.println(0);
      }
    }
  }
}
