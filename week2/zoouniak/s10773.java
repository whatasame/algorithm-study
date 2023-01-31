import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class s10773 {
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        int sum=0;
        while(K-- >0){
            int num = Integer.parseInt(br.readLine());
            if(num!= 0) {
                sum += num;
                stack.push(num);
            }
            else sum-=stack.pop();
        }
        System.out.println(sum);
    }
}
