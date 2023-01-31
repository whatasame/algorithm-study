import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class s10866 {
    static Deque<Integer> deque = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        String cmd;
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            cmd= st.nextToken();
            switch (cmd){
                case "push_back":
                    push_back(Integer.parseInt(st.nextToken()));
                    break;
                case "push_front":
                    push_front(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    sb.append(pop_front()).append("\n");
                    break;
                case "pop_back":
                    sb.append(pop_back()).append("\n");
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
    public static void push_front(int x){
        deque.push(x);
    }
    public static void push_back(int x){
        deque.addLast(x);
    }
    public static int pop_front(){
        if(!deque.isEmpty())
            return deque.removeFirst();
        return -1;
    }
    public static int pop_back() {
        if (!deque.isEmpty())
            return deque.removeLast();
        return -1;
    }
    public static int size(){
        return deque.size();
    }
    public static int empty(){
        if(deque.isEmpty())
            return 1;
        return 0;
    }
    public static int front(){
        if(!deque.isEmpty())
            return deque.getFirst();
        return -1;
    }
    public static int back(){
        if(!deque.isEmpty())
            return deque.getLast();
        return -1;
    }
}
