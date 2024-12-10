class Solution {
    static int result;

    public int solution(int[] numbers, int target) {
        DFS(numbers, target,0 ,0);
        return result;
    }
    static void DFS(int[] numbers, int target, int sum, int index){
        if(index == numbers.length){
            if(sum == target){
                result ++;
            }
            return;
        }
        DFS(numbers, target, sum + numbers[index], index + 1);
        DFS(numbers, target, sum - numbers[index], index + 1); 
    }
}