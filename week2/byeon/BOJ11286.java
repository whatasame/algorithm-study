package byeon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
public class BOJ11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1) > Math.abs(o2)) return 1; // o1이 o2보다 큰 경우
                else if (Math.abs(o1) < Math.abs(o2)) return -1; // o1이 o2보다 작은 경우
                else { // o1과 o2가 같은 경우
                    if(o1 > o2) return 1;
                    else if (o1 < o2) return -1;
                    else return 0;
                }
            }
        });

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
