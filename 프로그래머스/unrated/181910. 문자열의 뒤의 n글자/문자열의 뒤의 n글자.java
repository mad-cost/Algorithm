public class Solution {
    public String solution(String my_string, int n) {
        int startIndex = my_string.length() -n;

        StringBuilder sb = new StringBuilder();
        for (int i = startIndex; i <my_string.length() ; i++) {
            sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }
}