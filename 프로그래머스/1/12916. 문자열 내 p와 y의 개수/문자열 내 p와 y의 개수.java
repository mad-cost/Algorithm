class Solution {
    static int[] count = new int[2];
    
    boolean solution(String s) {
        // [연습] DFS로 문제 풀어보기
        s = s.toUpperCase();
        return DFS(s, 0);
    }

    static boolean DFS(String s, int index) {
        // 종료 조건
        if (index >= s.length()) {
            return count[0] == count[1] ? true : false;
        }

        if (s.charAt(index) == 'P') {
            count[0]++;
        } else if (s.charAt(index) == 'Y') {
            count[1]++;
        }
        // 다음 인덱스로 재귀 호출
        return DFS(s, index + 1);
    }
}
