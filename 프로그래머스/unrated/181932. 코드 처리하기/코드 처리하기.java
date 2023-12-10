public class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
             char word = code.charAt(i);

             if(word == '1'){
                 mode = 1-mode;
             }else if(mode == 0 && i % 2 == 0){
                 sb.append(word);
             } else if (mode == 1 && i%2 == 1) {
                 sb.append(word);
             }
        }
        String answer = sb.toString();
        return answer.isEmpty() ? "EMPTY" : answer;
    }
}