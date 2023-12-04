import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws IOException {
//        킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] inputSplit = input.split(" ");

        int[] standard = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < standard.length; i++) {
            standard[i] = standard[i] - Integer.parseInt(inputSplit[i]);
            System.out.print(standard[i] + " ");
        }






    }

}
