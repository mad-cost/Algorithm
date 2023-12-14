import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine(); //baekjoon

        int[] num = new int[26];
        Arrays.fill(num, -1);

        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (num[index] == -1){
                num[index] = i;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            sb.append(num[i]).append(" ");
        }
        System.out.println(sb);
        
    }
}
