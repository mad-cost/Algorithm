import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 13241
class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    long a = Integer.parseInt(st.nextToken());
    long b = Integer.parseInt(st.nextToken());
    long gcd = GCD(a, b); // 최대 공약수
    long lcm = (a * b) / gcd; // 최소 공배수 공식
    System.out.println(lcm);
  }

  public static long GCD(long a, long b){
    if (b == 0){
      return a;
    }
    return GCD(b, a%b);
  }
}
