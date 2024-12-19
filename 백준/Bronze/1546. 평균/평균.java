import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 1546 배열 사용하기
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine()); // 3
    StringTokenizer st = new StringTokenizer(br.readLine()); // 40 80 60

    int[] A = new int[N];

    int max = 0;
    // A 배열 초기화
    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(st.nextToken());
      max = Math.max(max, A[i]); // 최댓값 구하기
    }

    double sum = 0;
    for (int i = 0; i < N; i++) {
      sum += (double) A[i] / max * 100; // 문제 요구사항
    }

    System.out.println(sum / N);
  }
}


/*
>>
3
40 80 60
<<
75.0
 */