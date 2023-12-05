import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine(); //level
        String putNum = input;
        int result = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == putNum.charAt(input.length()-1-i)){
                result = 1;
            }else {
                result = 0;
                break;
            }
        }
        System.out.println(result);

    }
}