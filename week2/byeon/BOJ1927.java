package byeon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BOJ1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int N = Integer.parseInt(bf.readLine());
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(bf.readLine());
            if(num == 0) {
                if(minHeap.isEmpty()) System.out.println("0");
                else System.out.println(minHeap.remove());;
            }
            else {
                minHeap.add(num);
            }
        }
    }
}
