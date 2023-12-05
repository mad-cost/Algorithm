public class Solution {
    public int solution(int a, int b) {
        String putNum = Integer.toString(a) + Integer.toString(b);
        int intPutNum = Integer.parseInt(putNum);
        int mulNum = a * b * 2;
        if(intPutNum >= mulNum){
            return intPutNum;
        }else{
            return mulNum;
        }
    }
}
