import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
  public int[] solution(int[] arr, int divisor) {
    List<Integer> nums = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % divisor == 0) {
        nums.add(arr[i]);
      }
    }
    
      int[] answer = new int[nums.size()];
      if (!nums.isEmpty()) {
        Collections.sort(nums);
        for (int j = 0; j < nums.size(); j++) {
          answer[j] = nums.get(j);
        }
        return answer;
      } else {
        return new int[]{-1};
      }
  }
}  