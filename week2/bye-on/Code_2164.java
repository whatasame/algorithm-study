package bye

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_2164 {
    public static int[] queue;
    public static int capacity;
    public static int front;
    public static int rear;
    public static int size;

    public static void enqueue(int x) {
        if(rear == capacity) rear = 0;
        queue[rear++] = x;
        size++;
    }
    public static int dequeue() {
        if(size <= 0) return -1;
        if(front == capacity) front = 0;
        size--;
        return queue[front++];
    }
    public static int getFront() {
        if(size <= 0) return -1;
        else return queue[front];
    }
    public static int getRear() {
        if(size <= 0) return -1;
        else return queue[rear - 1];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        size = front = rear = 0;
        capacity = Integer.parseInt(bf.readLine());
        queue = new int[capacity / 2];
        if(capacity == 1) {
            System.out.println(1);
            return;
        }
        for(int i = 2; i <= capacity; i += 2) {
            enqueue(i);
        }
        while(true) {
            int x = dequeue();
            if(front == rear) {
                System.out.println(x);
                break;
            }
            enqueue(queue[front++]);
        }
    }
}
