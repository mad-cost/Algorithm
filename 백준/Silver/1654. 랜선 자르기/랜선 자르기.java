import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1654 이분 탐색
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[K];

        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = 0;
        for (int num : arr) {
            max = Math.max(max, num);
        }

        long low = 1; // 최소 1cm 는 짤라야 한다
        long high = max;
        long result = 0;

        while (low <= high){
            long mid = (low + high) / 2;

            long count = 0;

            for (int i = 0; i < K; i++) {
                count += arr[i] / mid;
            }

            if (N <= count){
                result = mid;
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        System.out.println(result);
    }
}
/*
>>
4 11
802
743
457
539
<<
200
 */

