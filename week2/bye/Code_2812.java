package bye;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Code_2812 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        String[] str = bf.readLine().split("");
        int[] num = new int[N];
        for(int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(str[i]);
        }
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i = 0; i < N; i++) {
            while(!deque.isEmpty() && deque.getLast() < num[i] && K > 0) {
                deque.removeLast();
                K--;
            }
            deque.addLast(num[i]);
        }
        StringBuilder sb = new StringBuilder();
        while(deque.size() > K) sb.append(deque.removeFirst());
        System.out.println(sb);
    }
}
