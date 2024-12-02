import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(bf.readLine());

    Queue<Integer> myQueue = new LinkedList<>();
    for (int i = 1; i <= N;i++){
      myQueue.add(i);
    }

    while (myQueue.size() > 1){
      myQueue.poll();
      myQueue.add(myQueue.poll());
    }
    System.out.println(myQueue.poll());
  }
}