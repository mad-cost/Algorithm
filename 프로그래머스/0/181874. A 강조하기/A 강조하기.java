class Solution {
  public String solution(String myString) {
    myString = myString.toLowerCase(); // 전부 소문자로
    String a = "a";
    return myString.replace(a, a.toUpperCase());
    }
}
// class Solution {
//     public String solution(String myString) {
//         myString = myString.toLowerCase();
//         myString = myString.replaceAll("a", "A");
//         return myString;
//     }
// }