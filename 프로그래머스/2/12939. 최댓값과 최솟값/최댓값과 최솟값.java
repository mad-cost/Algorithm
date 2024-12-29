// 방법 1 - sort 메서드 사용
import java.util.*;
class Solution {
    public String solution(String s) {
        String[] strArr = s.split(" ");
        
        int[] intArr = new int[strArr.length];
        int index = 0;
        for(String i : strArr){
            intArr[index++] = Integer.parseInt(i);
        }
        
        Arrays.sort(intArr);
        
        String answer = intArr[0] + " " + intArr[intArr.length - 1];
        return answer;
    }
}