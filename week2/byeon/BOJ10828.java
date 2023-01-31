package byeon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BOJ10828 {
    public static int[] stack;
    public static int top;
    public  static int capacity;

    public static void push(int x) {
        stack[top++] = x;
    }
    public static int pop() {
        if(top <= 0) return -1;
        return stack[--top];
    }
    public static int size() {
        return top;
    }
    public static int top() {
        int ptr = top;
        if(top <= 0) return -1;
        return stack[--ptr];
    }
    public static int empty() {
        if(top <= 0) return 1;
        else return 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        capacity = Integer.parseInt(bf.readLine());
        stack = new int[capacity];
        top = 0;

        for(int i = 0; i < capacity; i++) {
            String[] input = bf.readLine().split(" ");
            switch (input[0]) {
                case "push":
                    int num = Integer.parseInt(input[1]);
                    push(num);
                    break;
                case "pop":
                    System.out.println(pop());
                    break;
                case "size":
                    System.out.println(size());
                    break;
                case "empty":
                    System.out.println(empty());
                    break;
                case "top":
                    System.out.println(top());
                    break;
            }
        }
    }
}
