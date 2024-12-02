import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> resultList = new ArrayList<>();
        for(int i=0; i<num_list.length; i += n){
            resultList.add(num_list[i]);
        }
        int[] result = new int[resultList.size()];
        for(int i=0; i<resultList.size(); i++){
            result[i] = resultList.get(i);
        }
        return result;
    }
}