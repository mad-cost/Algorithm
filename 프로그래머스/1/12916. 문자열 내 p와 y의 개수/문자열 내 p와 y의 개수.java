class Solution {
    boolean solution(String s) {
        // [연습] 포인터 사용해서 풀어보기
        boolean answer = true;
        s = s.toUpperCase();
        int[] count = new int[2];
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'P'){
                count[0] += 1;
            }else if(s.charAt(i) == 'Y'){
                count[1] += 1;
            }
        }
        return count[0] == count[1] ? true : false;                 
    }
}