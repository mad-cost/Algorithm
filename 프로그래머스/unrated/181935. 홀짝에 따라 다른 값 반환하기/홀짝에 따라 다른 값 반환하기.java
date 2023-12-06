public class Solution {
    public int solution(int n) {
        int sum = 0;
        int mul = 0;
        if (n % 2 == 1){
            for (int i = 1; i <= n; i=i+2) {
                sum += i;
            }
            return sum;
        }else {
            for (int i = 0; i <= n ; i=i+2) {
                mul = mul + (i*i);
            }
            return mul;
        }

    }
}
