import java.util.*;
// 큐로 해결하기
public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> queue = new LinkedList<>();
        int checkNum = -1; // 음수가 없을 경우만 가능
        
        for(int num : arr){
            if(checkNum != num){
                queue.add(num);
                checkNum = num;
            }
        }
        
        int[] answer = new int[queue.size()];
        
        int index = 0;
        while(!queue.isEmpty()){
            answer[index++] = queue.poll();
        }
        
        return answer;
    }
}