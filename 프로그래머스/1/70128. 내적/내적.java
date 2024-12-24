// 재귀 함수로 풀어보기
class Solution {
    public int solution(int[] a, int[] b) {
        return recursive(a, b, 0, 0);
    }
    public static int recursive(int[] a, int[]b, int index, int result){
        if(index == a.length){
            return result;
        }
        return recursive(a, b, index + 1, result + ( a[index]  * b[index] ));
    }
}