package bye

import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class Code_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = bf.readLine();
        LinkedList<Character> list = new LinkedList<>();
        for(int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        ListIterator<Character> cursor = list.listIterator();
        while(cursor.hasNext()) cursor.next();

        int num = Integer.parseInt(bf.readLine());
        for(int i = 0; i < num; i++) {
            String input = bf.readLine();
            char c = input.charAt(0);
            switch (c) {
                case 'L':
                    if(cursor.hasPrevious()) cursor.previous();
                    break;
                case 'D':
                    if(cursor.hasNext()) cursor.next();
                    break;
                case 'B':
                    if(cursor.hasPrevious()) {
                        cursor.previous();
                        cursor.remove();
                    }
                    break;
                case 'P':
                    char t = input.charAt(2);
                    list.add(t);
                    break;
            }
        }
        System.out.println(list);
    }
}
