import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        for (int i = 0; i < 8; i++) {
            String input = br.readLine(); //.F.F...F
            for (int j = 0; j < 8; j++) {
                if (i % 2 ==0){ // 흰 검 흰 검 흰 검 흰 검
                    if (j % 2 ==0 && input.charAt(j)=='F'){
                        count++;
                    }
                }else { //검 흰 검 흰 검 흰 검 흰
                    if (j % 2 == 1 && input.charAt(j)=='F'){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
