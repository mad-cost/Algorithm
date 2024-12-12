class Solution {
    boolean solution(String s) {
        int[] count = new int[2];
        s = s.toUpperCase();
        return DFS(s, 0, count); // DFS 호출 시 count 전달
    }

    static boolean DFS(String s, int index, int[] count) {
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
        return DFS(s, index + 1, count);
    }
}
