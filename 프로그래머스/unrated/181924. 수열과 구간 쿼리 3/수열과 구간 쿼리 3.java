class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        for (int i = 0; i < queries.length; i++) {
            int temp = arr[queries[i][0]];; //temp = arr[0]
            arr[queries[i][0]] = arr[queries[i][1]]; // arr[0] = arr[3]
            arr[queries[i][1]] = temp;
        }
        return  arr;
    }
}