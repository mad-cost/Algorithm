import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 7795 이분 탐색 (lowerBound) 
class Main {
  static StringTokenizer st;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {
      st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());

      st = new StringTokenizer(br.readLine());
      int[] nArr = new int[N];
      for (int j = 0; j < N; j++) {
        nArr[j] = Integer.parseInt(st.nextToken());
      }

      st = new StringTokenizer(br.readLine());
      int[] mArr = new int[M];
      for (int j = 0; j < M; j++) {
        mArr[j] = Integer.parseInt(st.nextToken());
      }

      Arrays.sort(nArr);
      Arrays.sort(mArr);

      int result = 0;
      for (int target : nArr){
        result += upperBound(mArr, target);
      }
      System.out.println(result);
    }
  }

  public static int upperBound(int[] mArr, int target){
    int left = 0;
    int right = mArr.length;
    while (left < right){
      int mid = (left + right) / 2;
      if (mArr[mid] < target){
        left = mid + 1;
      }else {
        right = mid;
      }
    }
    return left;
  }
}
/*
>>
2
5 3
8 1 7 3 1
3 6 1
3 4
2 13 7
103 11 290 215
<<
7
1
 */