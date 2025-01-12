import java.util.*;
// 정렬, 메서드로 풀기 1
class Solution
{
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        
        int answer = 0;
        for (int i = 0; i < A.length; i++){
            int a = A[i];
            answer = multipleAndAdd(a, B, i, answer);         
        }
        return answer;
    }
    
    static int multipleAndAdd(int a, int[] B, int i, int answer){
        int b = B[B.length - 1 - i];
        return answer += a * b;
    }
}