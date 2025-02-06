import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 17087
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 동생 수
        int S = Integer.parseInt(st.nextToken()); // 내 위치

        int[] distance = new int[N]; // 나와 동생의 거리 차이를 담을 배열

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(st.nextToken()); // 동생 위치
            distance[i] = Math.abs(A - S); // Math.abs = 절대 값
        }

        int result = distance[0]; // 첫 번째 거리
        
        for (int i = 1; i < N; i++) {
            result = GCD(result, distance[i]);
        }
        System.out.println(result);
    }

    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
}
/*
>>
3 3
1 7 11
<<
2
 */

