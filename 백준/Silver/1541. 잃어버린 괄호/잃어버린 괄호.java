import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1541
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String N = br.readLine(); // 100+20-40+50+74-30+29-45+43+11
    int result = 0;

    // '-'를 기준으로 파티션을 나눠준다
    String[] str = N.split("-");
    for (int i = 0; i < str.length; i++) {
      if (i == 0) {
        result += SUM(str[i]);
      }else {
        result -= SUM(str[i]);
      }
    }
    System.out.println(result);
  }

  private static int SUM(String str) {
    int sum = 0;
    String[] temp = str.split("[+]");
    for (int i = 0; i < temp.length; i++) {
      sum += Integer.parseInt(temp[i]);
    }
    return sum;
  }
}