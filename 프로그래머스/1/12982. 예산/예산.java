import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int result = 0;
        Arrays.sort(d);
    
        for(int i = 0; i < d.length; i++){
            if(0 <= budget - d[i]){
                budget -= d[i];
                result ++;
            }
        }
        return result;
    }
}