import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // 표준 입력(System.in)을 통해 Scanner 객체 생성
    int N = sc.nextInt(); // 5
    String sNum = sc.next(); // 입력 받은 숫자들을 String으로 저장 "54321"
    char[] cNum = sNum.toCharArray(); // "54321" -> ['5', '4', '3', '2', '1']
    int sum = 0; // 초기화
    for (int i = 0; i < cNum.length; i++) { // 0 ~ 4 까지 반복 (5번 반복)
      sum += cNum[i] - '0'; // TODO i = 0 일 때, cNum[1] - '0' = 53 - 48
    }
    System.out.print(sum);
  }
}