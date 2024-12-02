class Solution {
    public int[] solution(int start_num, int end_num) {
        int N = start_num - end_num +1;
        int[] result = new int[N];
        int index = 0;
        for(int i=start_num; i>=end_num; i--){
            result[index++] = i;
        }    
        return result;
    }
}