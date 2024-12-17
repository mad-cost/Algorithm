import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
         return stack.isEmpty(); // 괄호의 수가 맞아서 비어있을 경우 true 반환 
    }    
}