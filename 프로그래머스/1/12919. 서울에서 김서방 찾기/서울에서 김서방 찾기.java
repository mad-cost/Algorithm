class Solution {
  public String solution(String[] seoul) {
    int count = 0;

    for (String search : seoul){
      if (search.equals("Kim")){
        break;
      }
      count ++;
    }
    return "김서방은 " + count + "에 있다";
  }
}