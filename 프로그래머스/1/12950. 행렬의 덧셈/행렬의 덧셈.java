// 재귀호출로 풀어보기
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        // 재귀 시작
        return recursive(arr1, arr2, answer, 0, 0);
    }
    
    public int[][] recursive(int[][] arr1, int[][] arr2, int[][] answer, int i, int j) {
        // 종료 조건
        if (i == arr1.length) {
            return answer;
        }
        
        answer[i][j] = arr1[i][j] + arr2[i][j];
        
        // 재귀 조건
        if (j < arr1[i].length - 1) {
            return recursive(arr1, arr2, answer, i, j + 1);
        } else {
            return recursive(arr1, arr2, answer, i + 1, 0);
        }
    }
}
