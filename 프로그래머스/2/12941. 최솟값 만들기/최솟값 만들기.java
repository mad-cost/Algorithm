import java.util.*;
// 우선 순위 큐로 해결하기
class Solution
{
    public int solution(int []A, int []B)
    {
        PriorityQueue<Integer> minA = new PriorityQueue<>();
        for (int num : A){
            minA.add(num);
        }
        
        PriorityQueue<Integer> maxB = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : B){
            maxB.add(num);
        }
        
        int answer = 0;
        
        while(!minA.isEmpty() && !maxB.isEmpty()){
            answer += minA.poll() * maxB.poll();
        }
        
        return answer;
    }
}