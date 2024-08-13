class Solution {
  public int solution(long num) {
    // answer을 count로 사용
    int answer = 0;

    if (num == 1) {
      return 0;
    }

    while (num != 1){
      num = (num % 2 ==0) ? num / 2 : num * 3 +1;
      answer ++;

      if (answer == 500){
        return -1;
      }
    }

    return answer;
  }
}