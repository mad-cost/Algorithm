class Solution {
  public boolean solution(int x) {
    String[] n = String.valueOf(x).split("");
    int sum = 0;

    for (int i = 0; i < n.length; i++) {
      sum = sum + Integer.parseInt(n[i]);
    }
    if (x%sum == 0){
      return true;
    }
    return false;
  }
}