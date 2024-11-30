import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        int N = st.countTokens();
        String[] result = new String[N];
        
        for (int i = 0; i < N; i++){
            result[i] = st.nextToken();
        }
        return result;
    }
}