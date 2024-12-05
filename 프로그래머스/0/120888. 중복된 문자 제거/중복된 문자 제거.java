class Solution {
    public String solution(String my_string) {
        String result = "";
        for(int i =0; i< my_string.length(); i++){
            if(!result.contains(String.valueOf(my_string.charAt(i)))){
                result += String.valueOf(my_string.charAt(i));
            }
        }
        return result;
        
    }
}