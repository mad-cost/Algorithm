import java.util.Arrays;
class Solution {
  public int solution(int[] numbers) {
    Arrays.sort(numbers);
    int index = 0;
    int result = 0;

    for (int i = 0; i < 10; i++) {
      if (index < numbers.length && i == numbers[index]) {
        index++;
      } else {
        result += i;
      }
    }

    return result;
  }
}