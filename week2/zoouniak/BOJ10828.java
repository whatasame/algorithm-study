import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ10828 {
    static Stack<Integer>stack = new Stack<>();
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine()," ");
            String s = st.nextToken();

            switch (s){
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                   sb.append(pop()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "top":
                    sb.append(top()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
            }

        }
        System.out.println(sb);
    }
    public static void push(int x){
        stack.push(x);
    }
    public static int pop(){
        if(!stack.empty())
            return stack.pop();
        else return -1;
    }
    public static int empty(){
        if(stack.empty())
            return 1;
        else return 0;
    }
    public static int size(){
        return stack.size();
    }
    public  static int top(){
        if(!stack.empty())
            return stack.peek();
        else return -1;
    }
}
