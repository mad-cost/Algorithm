import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<Integer> rankTrue = new ArrayList<>();

        for (int i = 0; i < attendance.length; i++) {
//            만약 attendance가 true라면
//            rank의 값을 rankTrue에 넣어준다
            if (attendance[i] == true){
                rankTrue.add(rank[i]);
            }
        }
//        rank값 정렬 (1등, 2등, 3등 찾기)
        Collections.sort(rankTrue);

        int result = 0;
        for (int i = 0; i < rank.length; i++) {
//            1등 처리
            if (rank[i] == rankTrue.get(0)){
                result += 10000 * i;
//            2등 처리
            } else if (rank[i] == rankTrue.get(1)) {
                result += 100 * i;
//            3등 처리
            } else if (rank[i] == rankTrue.get(2)) {
                result += i;
            }
        }
        return result;
    }
}