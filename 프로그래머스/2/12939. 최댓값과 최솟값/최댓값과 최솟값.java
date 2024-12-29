// 우선순위 큐 사용해서 풀어보기
import java.util.*;
class Solution {
    public String solution(String s) {
        String[] strArr = s.split(" ");
        
        PriorityQueue<Number> pq = new PriorityQueue<>();
        
        for(String str : strArr){
            pq.add(new Number(Integer.parseInt(str)));
        }
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        while(!pq.isEmpty()){
            Number n = pq.poll();
            int current = n.value;
        
            min = Math.min(min, current);
            max = Math.max(max, current);   
        }
        
        String answer = min + " " + max;
        return answer;
    }
    
    // 우선 순위 큐 사용해서 문제 풀기
    static class Number implements Comparable<Number>{
        int value;
        
        Number(int value){
            this.value = value;
        }
        
        @Override
        public int compareTo(Number e){
            if(this.value > e.value){
                return 1;
            } else{
                return -1;
            }
        }
        
    }
    
    
}