class Solution {
    public int solution(int[] num_list) {
        if(num_list.length > 10){
          int result = 0;
            for(int n : num_list){
                result += n;
            }
            return result;
        }else{
          int result = 1;
            for(int n : num_list){
                result *= n;
            }
            return result;
        }
    
    }
}