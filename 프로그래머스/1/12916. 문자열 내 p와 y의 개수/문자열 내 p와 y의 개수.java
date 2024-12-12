import java.util.*;

class Solution {
    static int count;
    boolean solution(String s) {
    //[연습] BFS로 문제 풀어보기
    s = s.toUpperCase();
    Queue<String> queue = new LinkedList<>();
    count = 0;
    
    for(int i = 0; i < s.length(); i++){
        queue.add(String.valueOf(s.charAt(i)));
    }
    while(!queue.isEmpty()){
        String target = queue.poll();
        if(target.equals("P")){
            count ++;
        }
        if(target.equals("Y")){
            count --;
        }
    }
        return count == 0 ? true : false;    
    }
}
