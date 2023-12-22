import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine()); //
        int mul = 1;

        for (int i = 0; i < test; i++) {
            String[] input = (br.readLine().split(" "));
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            for (int j = 0; j < b; j++) {
                mul = (mul * a) % 10;
            }
            if (mul == 0){
                mul = 10;
            }
            System.out.println(mul);
            mul = 1;
        }
    }
}
