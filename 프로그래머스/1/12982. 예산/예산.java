import java.util.*;
// 버블 정렬 적용해보기
class Solution {
    public int solution(int[] d, int budget) {
        int result = 0;
        // Arrays.sort(d);
    
        for(int i = 0; i < d.length - 1; i++){
            for(int j = 0; j < d.length - 1 - i; j++){
                int temp = 0;
                if(d[j] > d[j+1]){
                    temp = d[j];
                    d[j] = d[j+1];
                    d[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < d.length; i++){
            if(0 <= budget - d[i]){
                budget -= d[i];
                result ++;
            }
        }
        return result;
    }
}