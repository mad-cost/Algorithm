// Math 메서드 사용
class Solution {
    public String solution(String s) {
        String[] strArr = s.split(" ");
        
        int[] intArr = new int[strArr.length];
        
        int index = 0;
        for(String str : strArr){
            intArr[index++] = Integer.parseInt(str);
        }
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < intArr.length; i++){
            min = Math.min(min, intArr[i]);
            max = Math.max(max, intArr[i]);
        }
        
        String answer = min + " " + max;
        return answer;
    }
}