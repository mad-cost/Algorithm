import java.util.*;

// Math 함수 사용해서 문제 해결
class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[] {-1};
        }

        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            min = Math.min(min, i);
        }

        int[] answer = new int[arr.length - 1];
        int index = 0;
        for (int i : arr) {
            if (i != min) {
                answer[index++] = i;
            }
        }

        return answer;
    }
}
