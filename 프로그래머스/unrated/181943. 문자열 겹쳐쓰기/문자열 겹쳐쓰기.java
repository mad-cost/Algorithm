public class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++){
            if (i != s){
                sb.append(my_string.charAt(i));
            }
            else {
                for (int j = 0; j < overwrite_string.length(); j++) {
                    sb.append(overwrite_string.charAt(j));
                }
                // 인덱스의 갯수만큼 더해줘야 하기 때문에 -1
                i += overwrite_string.length()-1;
            }
        }
        return sb.toString();
    }
}