import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int checkArr = arr[0];
        list.add(checkArr);
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != checkArr){
                list.add(arr[i]);
                checkArr = arr[i];
            }
        }
        
        int[] answer = new int[list.size()];
        int index = 0;
        for(int i : list){
            answer[index++] = i;    
        }
        return answer;
    }
}