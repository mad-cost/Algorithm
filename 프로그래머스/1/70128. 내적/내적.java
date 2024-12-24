// 계산해주는 메서드 분리하기
class Solution {
    public int solution(int[] a, int[] b) {
        return calculate(a, b, 0);
    }
    public static int calculate(int[] a, int[]b, int sum){
        for(int i = 0; i < a.length; i++){
            sum += a[i] * b[i];
        }
        return sum;
    }
}