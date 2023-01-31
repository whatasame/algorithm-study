package bye;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Code_10866 {
    public static int[] deque;
    public static int capacity;
    public static int front;
    public static int rear;
    public static int size;

    public static void addFront(int x) {
        if(front < 0) front = capacity - 1;
        deque[front--] = x;
        size++;
    }
    public static void addBack(int x) {
        if(rear == capacity - 1) rear = -1;
        deque[++rear] = x;
        size++;
    }
    public static int deleteFront() {
        if(size <= 0) return -1;
        if(front == capacity - 1) front = -1;
        size--;
        return deque[++front];
    }
    public static int deleteBack() {
        if(size <= 0) return -1;
        if(rear < -1) rear = capacity - 1;
        size--;
        return deque[rear--];
    }
    public static int size() {
        return size;
    }
    public static int empty() {
        if(size <= 0) return 1;
        else return 0;
    }
    public static int getFront() {
        if(size <= 0) return -1;
        else return deque[front + 1];
    }
    public static int getBack() {
        if(size <= 0) return -1;
        else return deque[rear];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        size = 0;
        capacity = Integer.parseInt(bf.readLine());
        front = rear = capacity / 2;
        deque = new int[capacity];

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < capacity; i++) {
            String[] input = bf.readLine().split(" ");
            switch (input[0]) {
                case "push_front":
                    addFront(Integer.parseInt(input[1]));
                    break;
                case "push_back":
                    addBack(Integer.parseInt(input[1]));
                    break;
                case "pop_front":
                    sb.append(deleteFront()).append("\n");
                    //System.out.println(dequeue());
                    break;
                case "pop_back":
                    sb.append(deleteBack()).append("\n");
                    //System.out.println(dequeue());
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    //System.out.println(size());
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    //System.out.println(empty());
                    break;
                case "front":
                    sb.append(getFront()).append("\n");
                    //System.out.println(getFront());
                    break;
                case "back":
                    sb.append(getBack()).append("\n");
                    //System.out.println(getRear());
                    break;
            }
        }
        System.out.println(sb);
    }
}
