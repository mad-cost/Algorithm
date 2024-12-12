import java.awt.print.Pageable;
import java.io.*;
import java.util.StringTokenizer;

// 10989 기수 정렬 이론
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()); // 10 4200
    int N = Integer.parseInt(st.nextToken()); // 10
    int M = Integer.parseInt(st.nextToken()); // 4200

    int[] A = new int[N];
    int count = 0;

    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(br.readLine());
    }

    for (int i = N; i > 0 ; i--) {
      if (M / A[i-1] != 0){ // 4200 / 50000
        count += M / A[i-1];
        M = M % A[i-1];
      }
      if (M == 0){
        break;
      }
    }

    System.out.println(count);
  }
}
/*
>>
10 4200
1
5
10
50
100
500
1000
5000
10000
50000
<<
6
 */