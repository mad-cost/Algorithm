public class Solution {
    public long solution(int price, int money, int count) {
        // price 3, money = 20, count =4, result = 10
        long sum = 0;
        long answer = 0L;

        for (int i = 1; i <= count; i++) {
            long pay = price * i; // 3*1 3*2 3*3 3*4
            sum = sum+pay; // 3 + 6 +9 + 12 = 30
        }
        // 지불하고 돈이 남았다면
        if(money - sum >= 0){
            return answer;
        }else {
            answer = Math.abs(money-sum);
            return answer;
        }
    }
}