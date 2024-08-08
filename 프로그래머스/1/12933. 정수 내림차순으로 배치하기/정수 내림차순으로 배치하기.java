import java.util.Arrays;

class Solution {
  public long solution(long n) {
    long answer = 0;
    String[] array = String.valueOf(n).split("");
    Arrays.sort(array); // 오름 차순 정렬

    String newstr = new String();

    for (int i=array.length-1 ; i >= 0; i--){
      newstr += array[i];
    }

    answer = Long.parseLong(newstr);
    return  answer;
  }
}