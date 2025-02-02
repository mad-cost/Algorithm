import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken()); // 주전자 개수
    int K = Integer.parseInt(st.nextToken()); // 사람 수

    int[] nArr = new int[N];
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < N; i++) {
      nArr[i] = Integer.parseInt(br.readLine());
      max = Math.max(max, nArr[i]);
    }

    long low = 1; // 한 사람에게 줄 수 있는 막걸리의 "최소" 양
    long high = max; // 한 사람에게 줄 수 있는 막걸리의 "최대" 양

    while (low<=high){
      long mid = (low + high) / 2; // 한 번에 모든 사람에게 나눠줄 수 있는 막걸리의 양 (기준값)
      int count = 0; // 막걸리를 받을 수 있는 사람의 수 카운트

      for (int i = 0; i < N; i++) {
        count += nArr[i] / mid; // 막걸리를 현재의 mid(기준값) 만큼 나눠줬을 때, 막걸리를 받을 수 있는 사람의 수
      }

      if (K <= count){ // 막걸리를 더 나눠줘도 된다
        low = mid + 1;
      }else { // count가 K보다 작기 때문에 막걸리를 너무 많이 나눠줬다고 볼 수 있다.
        high = mid - 1;
      }
    }
    System.out.println(high);
  }
}
/*
>>
2 3
702
429
<<
351
 */