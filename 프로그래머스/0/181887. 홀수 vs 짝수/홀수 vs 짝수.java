class Solution {
    public int solution(int[] num_list) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 1; i < num_list.length+1; i++){
            if(i%2==1){
                sum1 += num_list[i-1];
            }else{
                sum2 += num_list[i-1];
            }
        }
        return sum1>sum2 ? sum1 : sum2;
    }
}