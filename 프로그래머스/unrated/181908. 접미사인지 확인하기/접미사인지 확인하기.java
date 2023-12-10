public class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        if (my_string.length() < is_suffix.length()) return answer;
        for (int i = 0; i < is_suffix.length(); i++) {
            if (my_string.charAt(my_string.length()-1-i) == is_suffix.charAt(is_suffix.length()-1-i)){
                answer = 1;
            }else{
                answer = 0;
                break;
            }
            
        }
        return answer;
    }

}