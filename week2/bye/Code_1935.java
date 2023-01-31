package bye;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Code_1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        double operand[] = new double[num];
        for(int i = 0; i < num; i++) {
            operand[i] = Double.parseDouble(bf.readLine());
        }
        Stack<Double> stack = new Stack<Double>();
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(('A' <= c) && (c <= 'Z')) {
                stack.push(operand[c - 'A']);
            }
            else {
                double a = stack.pop();
                double b = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(b + a);
                        break;
                    case '-':
                        stack.push(b - a);
                        break;
                    case '/':
                        stack.push(b / a);
                        break;
                    case '*':
                        stack.push(b * a);
                        break;
                }
            }
        }
        System.out.printf("%.2f", stack.pop());
    }
}
