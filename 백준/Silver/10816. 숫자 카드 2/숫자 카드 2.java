import java.io.*;
import java.util.*;

// 이분탐색 LowerBound, UpperBound 사용
class Main {
  static StringTokenizer st;
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int N  = Integer.parseInt(br.readLine());
    int[] nArr = new int[N];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      nArr[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(nArr);

    int M = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());

    for (int i = 0; i < M; i++) {
      int target = Integer.parseInt(st.nextToken());
      int result = upperBound(nArr,target) - lowerBound(nArr, target);
      sb.append(result + " ");
    }
    System.out.print(sb.toString().trim());
  }
  private static int lowerBound(int[] nArr, int target){
    int left = 0;
    int right = nArr.length;
    while (left < right){
      int mid = (left + right) / 2;
      if (nArr[mid] < target){
        left = mid + 1;
      }else {
        right = mid;
      }
    }
    return  left;
  }

  private static int upperBound(int[] nArr, int target){
    int left = 0;
    int right = nArr.length;
    while (left < right){
      int mid = (left + right) / 2;
      if (nArr[mid] <= target){
        left = mid + 1;
      }else {
        right = mid;
      }
    }
    return  left;
  }
}