import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 4158 재귀 함수 사용
class Main {
  static StringTokenizer st;
  static int[] arr;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());

      if (N == 0 && M == 0) {
        break;
      }

      arr = new int[N];
      for (int i = 0; i < N; i++) {
        arr[i] = Integer.parseInt(br.readLine());
      }

      Arrays.sort(arr);
      int count = 0;

      for (int i = 0; i < M; i++) {
        int target = Integer.parseInt(br.readLine());
        boolean checked = Recursion(0, arr.length-1, target);
        if (checked) {
          count++;
        }
      }
      System.out.println(count);
    }
  }

  public static boolean Recursion(int startIndex, int endIndex, int findNumber) {
    // 종료 조건
    if (startIndex > endIndex) {
      return false;
    }

    int midIndex = (startIndex + endIndex) / 2;

    if (findNumber < arr[midIndex]) {
      return Recursion(startIndex, midIndex - 1, findNumber);
    } else if (arr[midIndex] < findNumber) {
      return Recursion(midIndex + 1, endIndex, findNumber);
    } else {
      return true;
    }
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