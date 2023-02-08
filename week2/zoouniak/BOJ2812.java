import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2812 {
    static Queue<Integer> arr = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int max = -1;
        String str=br.readLine();
        for(int i=0;i<str.length();i++){
            int num = Integer.parseInt(String.valueOf(str.charAt(i)));
           arr.add(num);//
           if(i<N-K-2||num>max){
               max = num; //젤 큰 수를 앞으로, 근데 K개 지우는 거 생각해서 자릿수.
           }
        }
        while(arr.peek()!= max)
            arr.remove();
        sb.append(arr.remove());//맨앞숫자


    }
}
