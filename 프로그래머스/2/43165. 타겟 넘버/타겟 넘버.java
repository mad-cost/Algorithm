import java.util.LinkedList;
import java.util.Queue;

class Solution {
   public int solution(int[] numbers, int target) {
        int result = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {0, 0}); // sum = 0, index = 0

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int sum = current[0]; 
            int index = current[1];

    
            if (index == numbers.length) {
                if (sum == target) {
                    result++; 
                }
            }
            if(index < numbers.length){
            queue.offer(new int[] {sum + numbers[index], index + 1});
            queue.offer(new int[] {sum - numbers[index], index + 1});
            }       
        }
        return result;
    }
}