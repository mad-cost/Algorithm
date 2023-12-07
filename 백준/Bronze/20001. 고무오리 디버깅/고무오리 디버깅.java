import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        고무오리 디버깅 시작
        String line = br.readLine();

        int count =0;

//        마지막 "고무오리 디버깅 끝"을 입력 받을때 까지 반복한다.
        while (true){
            line = br.readLine();
//            종료조건 구현
            if (line.equals("고무오리 디버깅 끝")){
                break;
            }
//            입력이 "문제"라면 count ++
            if(line.equals("문제")){
                count ++;
            }
//            입력이 "고무오리"라면 count --
            else if (line.equals("고무오리") && count != 0) {
                count --;
            }
//            단 count == 0 이면 count += 2
            else {
                count = 2;
            }
        }
//        count의 값에 따라 결과를 출력
        if(count == 0){
            System.out.println("고무오리야 사랑해");
        }else{
            System.out.println("힝구");
        }
    }
}
