import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
//덱 collection 사용
public class s2164 {
    static Deque<Integer> deque = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        System.out.println(card(N));
    }
    public static int card(int N){
        for(int i=1;i<=N;i++)
            deque.add(i);
          while(N-->1){
              deque.remove();
              deque.add(deque.remove());
          }
          return deque.remove();
    }
}
