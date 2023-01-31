package bye;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Code_10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        Stack<Character> stack = new Stack<>();
        int result = 0;

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') stack.push(c);
            else {
                if (stack.peek() == '(') {
                    stack.pop();
                    result += stack.size();
                } else {
                    stack.pop();
                    result += 1;
                }
            }
        }
        System.out.println(result);
    }
}
