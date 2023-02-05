import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ9012 {
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String str;
        while (T-- >0) {
            stack.clear();
            str = br.readLine();
            if(VPS(str))
                sb.append("YES").append("\n");
            else sb.append("NO").append("\n");
        }
        System.out.println(sb);
    }
    public static boolean VPS(String str) {
        String[] strArr;
        strArr = str.split("");
        for (String s : strArr) {
            switch (s) {
                case "(":
                    stack.push(1);
                    break;
                default:
                    if (stack.empty())// "("가 없는데 ")" 나오면 VPS아님
                        return false;
                    else stack.pop();
            }
        }
        if(stack.empty())return true;
        else return false;
    }

}
