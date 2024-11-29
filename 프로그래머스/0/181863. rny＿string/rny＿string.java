class Solution {
    public String solution(String rny_string) {
        char[] c = rny_string.toCharArray();
        String s = "";
        for (int i = 0; i < c.length; i++){
            if (c[i] == 'm'){
                s += "rn";
            }else{
                s += c[i];
            }
        }
        return s;
    }
}