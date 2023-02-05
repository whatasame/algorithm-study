import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ18258 {
    static Deque<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(N-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd= st.nextToken();
            switch (cmd){
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "front":
                    sb.append(front()).append("\n");
                    break;
                case "back":
                    sb.append(back()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
    public static void push(int x){
        queue.add(x);
    }
    public static int pop(){
        if(!queue.isEmpty())
            return queue.remove();
        return -1;
    }
    public static int size(){
        return queue.size();
    }
    public static int empty(){
        if(queue.isEmpty())
            return 1;
        return 0;
    }
    public static int front(){
        if(!queue.isEmpty())
            return queue.getFirst();
        return -1;
    }
    public static int back(){
        if(!queue.isEmpty())
            return queue.getLast();
        return -1;
    }

}
