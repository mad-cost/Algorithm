import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken()); // 6
    int M = Integer.parseInt(st.nextToken()); // 18

    //최대 공약수
    int gcd = GCD(N, M);
    int lcm = (N * M) / gcd;

    System.out.println(gcd);
    System.out.println(lcm);
  }
  private static int GCD(int N, int M){
    if (M == 0){
      return N;
    }
    return GCD(M, N % M);
  }
}
