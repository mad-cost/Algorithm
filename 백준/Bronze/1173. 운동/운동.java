import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        int count = 0;
        int sum = m;

        //첫 번째 계산
        if (m + T > M){
            System.out.println(-1);
        }else{
            while (N != 0){
                if (sum + T <= M){
                    sum += T;
                    count ++;
                    N--;
                }
                else {
                    sum -= R;
                    if (sum < m){
                        sum = m;
                    }
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
