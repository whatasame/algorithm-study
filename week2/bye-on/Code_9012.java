package bye

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Code_9012 {
    public static int[] stack;
    public static int top;
    public  static int capacity;

    public static void push(int x) {
        stack[top++] = x;
    }
    public static int pop() {
        if(top <= 0) return --top;
        return stack[--top];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        capacity = Integer.parseInt(bf.readLine());
        for(int i = 0; i < capacity; i++) {
            stack = new int[50];
            top = 0;
            String str = bf.readLine();
            String[] c = str.split("");
            for (String s : c) {
                if (s.equals("(")) {
                    push(1);
                }
                else {
                    if (pop() == -1) {
                        break;
                    }
                }
            }
            if(top != 0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}

