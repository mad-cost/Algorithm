import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main { //30
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> colors = new HashMap<>();
        colors.put("black", "0");
        colors.put("brown", "1");
        colors.put("red", "2");
        colors.put("orange", "3");
        colors.put("yellow", "4");
        colors.put("green", "5");
        colors.put("blue", "6");
        colors.put("violet", "7");
        colors.put("grey", "8");
        colors.put("white", "9");

        String colorOne = br.readLine();
        String colorTwo = br.readLine();
        String colorThree = br.readLine();

        StringBuilder sb = new StringBuilder();
        sb.append(colors.get(colorOne));
        sb.append(colors.get(colorTwo));

        long result = Integer.parseInt(sb.toString());
        int colorThird = Integer.parseInt(colors.get(colorThree));
        result *= (long) Math.pow(10, colorThird);
        System.out.println(result);
    }
}
