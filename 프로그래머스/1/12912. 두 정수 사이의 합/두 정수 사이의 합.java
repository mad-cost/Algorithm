class Solution {
  public long solution(int a, int b) {
    long answer = 0;
    int max = Math.max(a, b);
    int min = Math.min(a, b);

    while (true){
      if (min == max){
        answer += max;
        break;
      }
      answer += min;
      min ++;
    }
    return answer;
  }
}