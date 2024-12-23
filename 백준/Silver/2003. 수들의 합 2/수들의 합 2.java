import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()); // 10 5
    int N = Integer.parseInt(st.nextToken()); // 10
    int M = Integer.parseInt(st.nextToken()); // 5

    st = new StringTokenizer(br.readLine());
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(st.nextToken());
    }

    int sum = A[0];
    int startIndex = 0;
    int endIndex = 0;
    int count = 0;

    while (endIndex < N) { // endIndex가 배열을 초과하지 않도록 제한
      if (sum < M) {
        endIndex++;
        if (endIndex < N) { // endIndex가 N 이상이 되는지 확인
          sum += A[endIndex];
        }
      } else if (sum > M) {
        sum -= A[startIndex];
        startIndex++;
        if (startIndex == N) { // startIndex가 배열 끝까지 도달하면 종료
          break;
        }
      } else { // sum == M인 경우
        count++;
        sum -= A[startIndex];
        startIndex++;
      }
    }

    System.out.println(count);
  }
}

/*
>>
10 5
<<
1 2 3 4 2 5 3 1 1 2
 */