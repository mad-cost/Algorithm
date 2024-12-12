class Solution {
    boolean solution(String s) {
        //[연습] 포인터 사용해서 풀어보기
        s = s.toUpperCase();
        int[] count = {0,0}; // P = 0, Y = 0
        
        int startIndex = 0;
    
        while(s.length() > startIndex){
            if(s.charAt(startIndex) == 'P'){
                count[0] += 1;
            }else if(s.charAt(startIndex) == 'Y'){
                count[1] += 1;
            }
            startIndex += 1;
        }
        
        return count[0] == count[1] ? true : false;
    }
}