class Solution {
  public int solution(int n) {
    int answer = 0;
    String StringN = Integer.toString(n);
    for (int i = 0; i < StringN.length(); i++) {
      answer += Integer.parseInt(String.valueOf(StringN.charAt(i)));
    }
    return answer;
  }
}
