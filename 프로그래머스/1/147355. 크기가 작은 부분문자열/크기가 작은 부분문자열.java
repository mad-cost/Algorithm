// 재귀함수로 풀어보기
class Solution {
    public int solution(String t, String p) {
        int pLength = p.length();
        int i = 0;
        int result = 0;
        
        return recursion(t, p, pLength, i, result);
       
    }
    
    private static int recursion(String t, String p, int pLength, int i, int result){
        if (t.length() < i+pLength){
            return result;
        }
        long tLong = Long.parseLong(t.substring(i, i+pLength));
        if(tLong <= Long.parseLong(p)){
            result ++;
        }
        return recursion(t, p, pLength, i+1, result);
    }
}