import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    //    Set
//    binarySearch 이진탐색
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        String[] myCard = br.readLine().split(" ");

        Set<Integer> myCards = new HashSet<>();
        for (int i = 0; i < myCard.length; i++) {
            myCards.add(Integer.parseInt(myCard[i]));
            // myCards = 6 5 3 2 10 -10
        }
        int N = Integer.parseInt(br.readLine());
        String[] standard = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < standard.length; i++) {
            int result = myCards.contains(Integer.parseInt(standard[i])) ? 1 : 0;
            sb.append(result).append(" ");

        }
        System.out.println(sb.toString());
    }
}