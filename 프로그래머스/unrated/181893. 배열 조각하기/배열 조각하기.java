import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int[] query) {
//        범위 설정(어디까지 포함할건지)
        int leftBound = 0;
        int rightBound = arr.length;
//        모든 query를 순서에 맞게 가져오기
        for (int i = 0; i < query.length; i++) {
//            짝수번째 쿼리라면 오른쪽에서 안쪽으로 들어오기
            if( i % 2 == 0){
//                결과 배열의 실제 시작지점은 0이 아닌 leftBound 부터다.
//                +1은 나 자신을 포함하기 때문
                rightBound = leftBound + query[i] + 1;
            }
//            홀수번쨰 쿼리라면 왼쪽에서 안쪽으로 들어오기
            else{
                leftBound += query[i];
            }
        }
        return Arrays.copyOfRange(arr,leftBound, rightBound);
        
    }
}
