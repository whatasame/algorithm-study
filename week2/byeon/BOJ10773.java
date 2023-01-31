package byeon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BOJ10773 {
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

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        capacity = Integer.parseInt(bf.readLine());
        stack = new int[capacity];
        int sum = 0;
        top = 0;

        for(int i = 0; i < capacity; i++) {
            int num = Integer.parseInt(bf.readLine());
            if(num != 0) {
                push(num);
                sum += num;
            }
            else {
                sum -= pop();
            }
        }
        System.out.println(sum);
    }
}

