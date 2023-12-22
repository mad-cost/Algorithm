import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String aeiou = "aeiou";
        int count = 0;

        while (true){
            String input = br.readLine().toLowerCase();
            if (input.equals("#")){
                break;
            }
            for (int i = 0; i < input.length(); i++) {
                for (int j = 0; j < aeiou.length(); j++) {
                    if (input.charAt(i) == aeiou.charAt(j)){
                        count++;
                    }
                }
            }
            System.out.println(count);
            count = 0;
        }
    }
}
