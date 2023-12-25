import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        // 알파벳은 26개
        int[] arr = new int[26];

        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            char first = name.charAt(0); // 첫 글자 가져오기
            arr[first - 97]++;
        }

        for (int i = 0; i < arr.length; i++) { // 알파벳 개수(26)에 맞게 수정
            if (arr[i] >= 5) {
                sb.append((char) (i + 97));
            }
        }
        if (sb.length() == 0){
            sb.append("PREDAJA");
        }
        System.out.println(sb);
    }
}
