public class Solution {
    public int solution(int a, int b) {
        String ab = Integer.toString(a) + Integer.toString(b);
        int intAB = Integer.parseInt(ab);
        int mul = 2 * a * b;
        
        return intAB >= mul ? intAB : mul;
        

    }
}