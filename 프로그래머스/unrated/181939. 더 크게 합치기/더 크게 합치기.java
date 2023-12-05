public class Solution {
    public int solution(int a, int b) {
        String numOne = Integer.toString(a) + Integer.toString(b);
        String numTwo = Integer.toString(b) + Integer.toString(a);
        int intNO = Integer.parseInt(numOne);
        int intNT = Integer.parseInt(numTwo);

        if(intNO >= intNT){
            return intNO;
        }else {
            return intNT;
        }
    }
}