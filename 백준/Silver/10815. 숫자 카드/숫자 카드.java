import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
//    5
//    6 3 2 10 -10
//    8
//    10 9 -5 2 3 4 5 -10
//    1. Set(Collection Frameworks) & contains 이용
//    2. 이진탐색(Bindary Search) 이용
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //5
        String[] myCardString = br.readLine().split(" "); //6, 3, 2, 10, -10

//        1. Hash Set & contains
        Set<Integer> myCards = new HashSet<>();
        for (int i = 0; i < N; i++) {
//            myCards에 myCardString을 형변환 후 넣어주기
//            6, 3, 2, 10, -10
            myCards.add(Integer.parseInt(myCardString[i]));
        }
        int M = Integer.parseInt(br.readLine()); // 8
//        10 9 -5 2 3 4 5 -10
        String[] inCard = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
//            contains = HashSet내의 객체가 존재하는지 true, false 반환
//            ? 1 : 0; / true 일경우 1 반환 false 일경우 0반환
            int result = myCards.contains(Integer.parseInt(inCard[i]))
                    ? 1 : 0;
            sb.append(result).append(" ");
        }
        System.out.println(sb);

    }

    public static void main(String[] args) throws IOException{
        Main sol = new Main();
        sol.solution();
    }
}
