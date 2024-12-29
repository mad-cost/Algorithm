// toCharArray 사용해서 풀어보기
class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] c = s.toCharArray();
        
        if(c.length != 4 && c.length != 6)
        return false;
        
        for(int i = 0; i<c.length; i++){
            try{
                Integer.parseInt(String.valueOf(c[i]));
            }catch (Exception e) {
                return false;
            }
        }
        return answer;
    }
}