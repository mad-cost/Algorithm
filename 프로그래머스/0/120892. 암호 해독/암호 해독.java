import java.util.*;

class Solution {
    public String solution(String cipher, int code) {
        StringBuilder br = new StringBuilder();
        for(int i = code-1; i < cipher.length(); i += code){
            br.append(cipher.charAt(i));
        }
        return br.toString();
    }
}