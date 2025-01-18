class Solution {
    public int[] solution(int n, int m) {
        // 최대 공약수
        int gcd = gcd(n, m);
        // 최소 공배수
        int lcm = (n*m) / gcd;
        int[] answer = {gcd, lcm};
        return answer;
    }
    public static int gcd (int n, int m){
        if(m == 0){
            return n;
        }
        return gcd(m, n%m);
    }
}