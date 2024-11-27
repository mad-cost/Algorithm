import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int max = 0;
    double result = 0;

    int[] numbers = new int[N];

    for (int i = 0; i < N ; i ++){
      numbers[i] = sc.nextInt(); // 40 / 80 / 60
    }

    for (int j = 0 ; j < N ; j++) {
      if (numbers[j] > max) {
        max = numbers[j]; // 80
      }
    }

    for (int z = 0 ; z < N ; z++){
      result += (double) numbers[z] / max*100;
    }

    System.out.print(result/N);
  }
}