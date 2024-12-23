import java.util.*;

// ArrayList 사용해서 문제 해결
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            return new int[]{-1};
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int i : arr){
            list.add(i);
        }
        
        list.remove(Collections.min(list));
        
        int[] answear = new int[arr.length - 1];
        
        for(int i=0; i < list.size(); i++){
            answear[i] = list.get(i);
        }
        return answear;
    }
}
