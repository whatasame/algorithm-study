package byeon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bf.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = 0; i < count; i++) {
            String[] testCase = bf.readLine().split(" ");
            int num = Integer.parseInt(testCase[0]);
            int index = Integer.parseInt(testCase[1]);

            String[] str = bf.readLine().split(" ");
            
        }
    }
}
