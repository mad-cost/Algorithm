class Solution {
    public int solution(String t, String p) {
        int pLength = p.length();
        int i = 0;
        int result = 0;
        
        while(i+pLength <= t.length()){
            long tSubstring = Long.parseLong(t.substring(i, i+pLength));
            if(tSubstring <= Long.parseLong(p)){
                result ++;
            }
            i++;
        }
        return result;
    }
}