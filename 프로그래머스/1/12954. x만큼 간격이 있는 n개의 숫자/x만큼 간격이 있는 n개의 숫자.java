class Solution {
  public long[] solution(int x, int n) { // 2, 5
    long[] answer = new long[n]; // 배열 초기화
    long num = 0;

    for (int i = 0; i < n; i++) {
      num += x;
      answer[i] = num;
    }
    return answer;
  }
}


