public class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int indexStart = queries[i][0];
            int indexEnd = queries[i][1];
            for (int j = indexStart; j <indexEnd+1 ; j++) {
                arr[j] ++;
            }
        }
        return arr;
    }
}