// toCharArray 사용해서 풀어보기
class Solution {
    public boolean solution(String s) {
        boolean answer = true;

        if(s.length() == 4 || s.length() == 6){
            try{
                Integer.parseInt(s);
            }catch (Exception e){
                return false;
            }
        }else{
            return false;
        }
        
        return true;
    }
}