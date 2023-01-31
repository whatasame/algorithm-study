import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class s11286 {
    static Deque<Integer> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M= Integer.parseInt(st.nextToken());
        for(int i=0;i<N;i++)
            q.push(N-i);
        int index=0,cnt=0;
        st = new StringTokenizer(br.readLine()," ");
        while(st.hasMoreTokens()){
            int out = Integer.parseInt(st.nextToken());
            int size = q.size();
            int outindex = Math.abs(out + index)%q.size();
            while(q.getFirst()!=out){
                if(outindex >(size/2)+1){
                    //3번연산수행
                    q.addFirst(q.removeLast());
                    index++;
                    cnt++;
                }
                else{//2번연산수행
                    q.addLast(q.removeFirst());
                    index--;
                    cnt++;
                }
            }
            if(q.getFirst()==out){
                q.removeFirst();
                index--;
            }
        }
        System.out.print(cnt);
    }
}
