public class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        if (my_string.length() < is_prefix.length()) return answer;
        for (int i = 0; i < is_prefix.length(); i++) {
            
            if (my_string.charAt(i) == is_prefix.charAt(i)){
                answer = 1;
            }else{
                answer = 0;
                break;
            }
        }
        return answer;
    }

}