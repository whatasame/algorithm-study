package byeon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class BOJ11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= N; i++) {
            queue.add(i);
        }
        sb.append("<");
        while(queue.size() > 1) {
            for(int i = 0; i < K - 1; i++) {
                queue.add(queue.remove());
            }
            sb.append(queue.remove()).append(", ");
        }
        sb.append(queue.remove());
        sb.append(">");
        System.out.println(sb);
    }
}
