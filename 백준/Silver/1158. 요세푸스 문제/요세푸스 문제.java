import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");//7, 3

        int N = Integer.parseInt(input[0]); //N = 7
        int K = Integer.parseInt(input[1]); //K = 3

        List<Integer> result = new ArrayList<>();

        Queue<Integer> people = new LinkedList<>();

        for (int i = 1; i < N+1; i++) {
//          사람을 Queue에 넣기
//          Queue니까 offer사용
            people.offer(i);
        }
//      현재 몇 번째 사람인지 기록해주기
        int count = 1;
//        큐가 차있다면 while문 실행
        while(!people.isEmpty()){
//          일단 n번째 사람을 빼고,
//          if문을 통해서 true일 경우 result로
//          아닐경우 다시 큐로.
            int person = people.poll();
//            count가 3번째 사람이라면
            if (count == K){
//              맞으면 result로
                result.add(person);
//              맞으니까 count 초기화
                count = 1;
            }
            else {
//              아닐경우 다시 큐로
                people.offer(person);
//              아닐경우 count+1
                count++;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        for (int i = 0; i < result.size(); i++) {
            sb.append(result.get(i));
            if (i != result.size()-1){
//                result.size()-1까지만 , 를 찍어줌.
                sb.append(", ");
            }
        }
        sb.append('>');
        System.out.println(sb);
    }
}