class Solution {
  public int[] solution(long n) {
    String stringNum = String.valueOf(n);
    int[] answer = new int[stringNum.length()];

    for (int i = 0; i < stringNum.length(); i++) {
      answer[i] = Integer.parseInt(String.valueOf(stringNum.charAt(stringNum.length() - 1 - i)));
      System.out.println(answer[i]);
    }
    return answer;
  }
}