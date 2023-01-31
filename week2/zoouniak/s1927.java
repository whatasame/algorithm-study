import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
//우선순위큐 클래스가 잇엇다..
public class s1927 {
    public static PriorityQueue<Integer> heap = new PriorityQueue<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        while(N-->0){
            int X = Integer.parseInt(br.readLine());
            if(X==0){
              sb.append(zero()).append("\n");
            }
            else{
                heap.add(X);
            }
        }
        System.out.print(sb);
    }
    public static int zero(){
        if(heap.isEmpty())
            return 0;
        return heap.remove();
    }
}
