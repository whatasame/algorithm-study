import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ1874 {
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int num=Integer.parseInt(br.readLine());
        for (int i = 0; i < num;i++) {
            stack.push(i + 1);
            sb.append("+").append("\n");
        }
        stack.pop();
        sb.append("-").append("\n");//맨처음 out in
        int next= num+1;
        while(n-->1){
            num = Integer.parseInt(br.readLine());
            if(stack.empty() || stack.peek()<num){
                //stack.peek()<num
                for(int i=next;i<=num;i++){
                    stack.push(i);
                    sb.append("+").append("\n");
                }
                stack.pop();
                next=num+1;
                sb.append("-").append("\n");
            }
            else if(stack.peek()==num){
                    stack.pop();
                    sb.append("-").append("\n");
            }
            else if(stack.peek()>num) {
                    sb.setLength(0);
                    sb.append("NO");
                    break;
            }
        }
        System.out.print(sb);
    }
}
