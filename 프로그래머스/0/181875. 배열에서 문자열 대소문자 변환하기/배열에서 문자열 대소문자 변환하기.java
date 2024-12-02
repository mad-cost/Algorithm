
class Solution {
    public String[] solution(String[] strArr) {
        String[] result = new String[strArr.length];
        int i = 0;
        for(String target : strArr){
            if  (i % 2 == 1){
                result[i] = target.toUpperCase();
                i++;
            }else{
                result[i] = target.toLowerCase();
                i++;
            }
        }
        return result;
    }
}