import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ2493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> top =new Stack<>();
        Stack<Integer> index =new Stack<>();
        int i=1;
        StringTokenizer st= new StringTokenizer(br.readLine()," ");
        while(st.hasMoreTokens()){
            int pass=0;
            int num =Integer.valueOf(st.nextToken());
            while(!top.empty()){
                if(top.peek()>num) {
                    pass = index.peek();
                    break;
                }
                else{
                    top.pop();//pop해도 되는 이유는 나보다 작은것은 뒤에 탑들은어차피 내가 더 크니가..막힘
                    index.pop();
                }
            }
            sb.append(pass).append(" ");
            top.push(num);
            index.push(i++);//tower클래스 만들기

        }
        System.out.print(sb);
    }
}
