public class Solution {
    public String solution(String[] seoul) {
        String search = "Kim";
        int result = 0;
        
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals(search)){
                result = i;
            }
        }
        return String.format("김서방은 %d에 있다", result);
    }
}