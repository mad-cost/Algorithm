import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

// 4158 이분 탐색
class Main {
  static StringTokenizer st;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true){
      st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());

      if (N == 0 && M == 0){
        break;
      }

      int[] nArr = new int[N];

      for (int i = 0; i < N; i++) {
        nArr[i] = Integer.parseInt(br.readLine());
      }

      Arrays.sort(nArr); // 이분 탐색은 정렬이 필수
      int count = 0;

      for (int i = 0; i < M; i++) {
        int target = Integer.parseInt(br.readLine());
        boolean checked = BinarySearch(nArr, target);
        if (checked){
          count ++;
        }
      }
      System.out.println(count);
    }
  }

  public static boolean BinarySearch(int[] Arrays, int target){
    int startIndex = 0;
    int endIndex = Arrays.length - 1;
    boolean result = false;

    while (startIndex <= endIndex){
      int midIndex = (startIndex + endIndex) / 2;
      if (target == Arrays[midIndex]){
        result = true;
        break;
      } else if (target < Arrays[midIndex]) {
        endIndex = midIndex - 1;
      }else {
        startIndex = midIndex + 1;
      }
    }

    return result;
  }
}
/*
>>
3 3
1
2
3
1
2
4
0 0
<<
2
 */