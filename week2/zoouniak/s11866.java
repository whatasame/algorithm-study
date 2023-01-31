import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class s11866 {
    static Queue<Integer> queue = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int N= Integer.parseInt(st.nextToken());
        int K= Integer.parseInt(st.nextToken());
        for(int i=1;i<=N;i++)
            queue.add(i);
        while(queue.size()>0){
            for(int i=1;i<=K;i++){
                if(i==K)
                    sb.append(queue.remove());
                else
                    queue.add(queue.remove());
            }
            if(queue.size()!=0)
                sb.append(", ");
        }
        sb.append(">");
        System.out.print(sb);
    }
}
