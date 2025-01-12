class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        for(int i = 0; i < arr.length; i++){
            // ""가 들어올 경우 " "
            if(arr[i].length() == 0){
                answer += " ";
            }
            else{
                answer += arr[i].substring(0, 1).toUpperCase();
                answer += arr[i].substring(1).toLowerCase();
                answer += " ";
            }
        }
        // 기존에 입력된 값의 마지막에 " " 이 있다면 그냥 리턴
        if(s.substring(s.length()-1, s.length()).equals(" ")) 
            return answer;
        // 기존에 입력된 값의 마지막에 " " 이 없다면 추가한 공백을 제거하고 리턴 
        return answer.trim();
    }
}