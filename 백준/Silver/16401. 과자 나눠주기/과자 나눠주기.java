import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 16401 이분 탐색
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int low = 1;
        int high = arr[N-1];
        int result = 0;

        while (low <= high){
            int mid = (low + high) / 2;

            int cnt = 0;
            for (int i = 0; i < N; i++) {
                cnt += arr[i] / mid;
            }

            if (M <= cnt){
                low = mid + 1;
                result = mid;
            }else {
                high = mid - 1;
            }
        }
        System.out.println(high);
    }
}
/*
>>
3 10
1 2 3 4 5 6 7 8 9 10
<<
8
 */

