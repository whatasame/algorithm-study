package bye

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Code_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int capacity = Integer.parseInt(bf.readLine());
        String[] str = bf.readLine().split(" ");
        int[] num = new int[capacity];
        for(int i = 0; i < capacity; i++) {
            num[i] = Integer.parseInt(str[i]);
        }
        Stack<Integer> nge = new Stack<>();
        for(int i = 0; i < capacity; i++) {
            while(!nge.empty() && num[nge.peek()] < num[i]) num[nge.pop()] = num[i];
            nge.push(i);
        }
        while(!nge.empty()) num[nge.pop()] = -1;
        for(int i = 0; i < capacity; i++) sb.append(num[i]).append(" ");
        System.out.println(sb);
    }
}
// https://st-lab.tistory.com/196