import java.util.*;
// 스택으로 해결하기
public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for(int num : arr){
            if(stack.isEmpty() || stack.peek() != num){
                stack.push(num);
            }
        }
        
        int[] answer = new int[stack.size()];
        int index = stack.size() - 1;
        
        while(!stack.isEmpty()){
            answer[index--] = stack.pop();
        }
        return answer;
    }
}