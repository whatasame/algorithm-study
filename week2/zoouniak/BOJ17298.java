import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ17298 {
    static Queue<Integer> arr = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        arr.add(Integer.parseInt(st.nextToken()));//첫번쨰거 넣기
        while(st.hasMoreTokens()){
            arr.add(Integer.valueOf(st.nextToken()));

        }
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<arr.size();i++){


        }
        System.out.println(sb);
    }
}
