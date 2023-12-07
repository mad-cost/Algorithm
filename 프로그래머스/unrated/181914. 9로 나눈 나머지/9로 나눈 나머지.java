public class Solution {
    public int solution(String number) {
        String[] target = number.split("");
        int sum = 0;
        for (int i = 0; i < target.length; i++) {
            sum += Integer.parseInt(target[i]);
        }
        int result = sum % 9;
        return result;
    }   
}
