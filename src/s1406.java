import java.io.*;
import java.util.Stack;
//linkedlist실패
//listiterator 실패
//stackt성공 시간복잡도 O(1)
public class s1406 {
    public static void main(String[] args) throws IOException {
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < str.length(); i++) {
            left.push(str.charAt(i));
        }
        int M = Integer.parseInt(br.readLine());
        while (M-- > 0) {
            String cmd = br.readLine();
            char cmd1 = cmd.charAt(0);
            switch (cmd1) {
                case 'L':
                    if (!left.empty())
                        right.push(left.pop());
                    break;
                case 'D':
                    if (!right.empty())
                        left.push(right.pop());
                    break;
                case 'B':
                    if(!left.empty())
                        left.pop();
                    break;
                case 'P':
                    left.push(cmd.charAt(2));
            }
        }
        while(!left.empty())
            right.push(left.pop());//중요...
        while(!right.empty())
            bw.write(right.pop());
        bw.flush();
    }
}
/*
public class s1406 {
    static LinkedList<Character> list = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        ListIterator<Character> cursor = list.listIterator();
        while(cursor.hasNext())
            cursor.next();
        int M = Integer.parseInt(br.readLine());
        while (M-->0){
            String cmd = br.readLine();
            char cmd1 = cmd.charAt(0);
            switch (cmd1) {
                case 'L':
                    if(cursor.hasPrevious())
                        cursor.previous();
                    break;
                case 'D':
                    if(cursor.hasNext())
                        cursor.hasNext();
                    break;
                case 'B':
                    if(cursor.hasPrevious()){
                        cursor.previous();
                        cursor.remove();
                    }
                    break;
                case 'P':
                    cursor.add(cmd.charAt(2));
            }
        }
        for(Character c :list){
            bw.write(c);
        }
        bw.flush();
        //System.out.print(list.toString());
    }
}
*/

/*
public class s1406 {
    static LinkedList<String> list = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }
        ListIterator<String> cursor = list.listIterator();
        while (cursor.hasNext())
            cursor.next();
        int M = Integer.parseInt(br.readLine());
        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            switch (cmd) {
                case "L":
                    if (cursor.hasPrevious())
                        cursor.previous();
                    break;
                case "D":
                    if (cursor.hasNext())
                        cursor.next();
                    break;
                case "B":
                    if (cursor.hasPrevious()) {
                        cursor.previous();
                        cursor.remove();
                    }
                    break;
                case "P":
                    cursor.add(st.nextToken());
            }
        }
            System.out.print(list.toString());

    }
}
*/

/*
public class s1406 {
    static LinkedList<String> list = new LinkedList<>();
    static int cursor;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            list.add(st.nextToken());
        }
        cursor = list.size();
        int M = Integer.parseInt(br.readLine());
        while (M-->0){
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            switch (cmd) {
                case "L":
                    L();
                    break;
                case "D":
                    D();
                    break;
                case "B":
                    B();
                    break;
                case "P":
                    P(st.nextToken());
            }
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
    }
    public static void L(){//커서 왼쪽 한칸
        if(cursor==0)//맨 앞이면 무시
            return;
        cursor-=1;
    }
    public static void D(){//커서 오른쪽 한칸
        if(cursor == list.size())//맨 뒤면 무시
            return;
        cursor+=1;
    }
    public static void B(){//커서 왼 문자삭제
        if(cursor==0)return;//맨 앞이면 무시
        list.remove(--cursor);
    }
    public static void P(String s){//커서 왼쪽 문자 추가
        list.add(cursor++,s);
    }
}
*/
