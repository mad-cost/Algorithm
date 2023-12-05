import java.util.Arrays;
import java.util.Map;

public class Solution {
    public int solution(int a, int b, int c) {
        int[] numbers = {a, b, c};
        Arrays.sort(numbers);
        // [0], [1], [2]가 모두 같은가?
        if(numbers[0] == numbers[2]){
            return (a+b+c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        }// [0], [1]가 같거나 || [1], [2]가 같거나
        else if (numbers[0] == numbers[1] || numbers[1] == numbers[2]) {
            return   (a+b+c) * (a*a + b*b + c*c);
        }else{
            return (a + b+ c);
        }
    }
}