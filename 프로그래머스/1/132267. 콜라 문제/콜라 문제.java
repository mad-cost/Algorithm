public class Solution {
    public int solution(int a, int b, int n) {
        int result = 0;

        while (true){
            // n = 20
            int cola = n / a; // 6
            cola = cola * b;
            result += cola; // 6
            n = cola + (n%a); // 8
            if (n < a){ 
                break;
            }

        }
        return result;
    }
}