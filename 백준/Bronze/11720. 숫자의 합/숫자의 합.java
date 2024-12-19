import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 11720 // 배열 사용하기
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine()); // 5
    String M = br.readLine(); // 54321

    int[] A = new int[N]; // 0 ~ 4
    int sum = 0;

    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(M.substring(i, i+1));
      sum += A[i];
    }

    System.out.println(sum);
  }
}


/*
>>
5
54321
<<
15
 */