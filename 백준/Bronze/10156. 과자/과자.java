import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputSplit = br.readLine().split(" ");

        int price = Integer.parseInt(inputSplit[0]) * Integer.parseInt(inputSplit[1]);
        int extraPrice = price - Integer.parseInt(inputSplit[2]);
        if(extraPrice < 0){
            extraPrice = 0;
        }
        System.out.println(extraPrice);

    }

}
