import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                resultList.add(todo_list[i]);
            }
        }
        return resultList.toArray(new String[0]);
    }
}
