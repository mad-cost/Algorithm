import java.util.Scanner;

// 재귀함수를 사용한 해결 방법
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        recursive(a, a, b);
    }
    // 재귀함수 시작
    public static void recursive(int originalA, int a, int b) {
        if (b == 0) {
            return;
        }
        
        if (a > 0) {
            System.out.print("*");
            recursive(originalA, a - 1, b);
        } else {
            System.out.println();
            recursive(originalA, originalA, b - 1);
        }
    }
}
