public class Solution {
    public int[] solution(int[] arr) {
        int leftIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 2){
//                왼쪽인덱스의 2를 찾으면 발견 중단.
                leftIndex = i;
                break;
            }
        }
        if(leftIndex == -1){
            return new int[]{-1};
        }
        
        
        int rightIndex = 0;
        for (int i = arr.length -1; i > -1; i--) {
            if(arr[i] ==2){
                rightIndex = i;
                break;
            }
        }
        int[] answer = new int[rightIndex - leftIndex +1];
//        arr = 1,2,1,4,5,2,9 / answer = [5-1+1]
        for (int i = leftIndex; i < rightIndex +1; i++) {
            answer[i - leftIndex] = arr[i];
        }
        for (int i = 0; i < rightIndex -leftIndex +1; i++){
            answer[i] = arr[i + leftIndex];
        }
        return answer;
    }
}