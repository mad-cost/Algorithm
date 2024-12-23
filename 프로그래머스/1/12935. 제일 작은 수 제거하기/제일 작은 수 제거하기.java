class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1){
            return new int[] {-1}; 
        }
        
        int min = findMin(arr, 0, Integer.MAX_VALUE);
        
        int[] answer = new int[arr.length - 1];
        
        int index = 0;
        for(int i : arr){
            if(i != min){
                answer[index++] = i;
            }
        }
        return answer;
    }
    
    public int findMin(int[] arr, int index, int min){
        if(arr.length == index){
            return min;
        }
        return findMin(arr, index+1, Math.min(min, arr[index]));
    }
    
}