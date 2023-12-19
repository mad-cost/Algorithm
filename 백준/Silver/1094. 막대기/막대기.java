import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int targetNum = Integer.parseInt(br.readLine()); // 23

        int stick = 64;
        int count = 0;
        int sum = 0;
        int targetCopy = targetNum;

        while (true) {
//            타겟이 64일 경우
            if (targetNum ==64){
                count++;
                break;
            }

            stick /= 2;
            if (stick <= targetCopy){
                sum += stick;
                count ++;
//                sum과 targetNum이 같으면 종료
                if (sum == targetNum){
                    break;
                }
                targetCopy -= stick;
            }
        }
        System.out.println(count);
    }
}
