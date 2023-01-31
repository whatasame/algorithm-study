import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;
//컬랙션의 reverse메서드를 사용하니 시간초과가 났다
//일일이 뒤ㅣ집지않고 R을 구현해야한다 ->reverse변수
public class s5430 {
    static Deque<Integer> arr  = new LinkedList<>();
    static boolean reverse = false; //reverse를위한 변수
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb= new StringBuilder();
    public static void main(String[] args) throws IOException {

        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            reverse = false;
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            if(AC(p)){
                int size= arr.size();
                sb.append("[");
                for(int i=0;i<size;i++){
                    if(!reverse)//정방향
                        sb.append(arr.removeFirst());
                    else sb.append(arr.removeLast());
                    if(i!=size-1)
                        sb.append(",");
                }
                sb.append("]").append("\n");
            }
            else sb.append("error").append("\n");
            }
        System.out.print(sb);
    }
    public static void setArr() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(),"[,]");
        int i=0;
        while(st.hasMoreTokens()){
            if(i++%2!=0)
                arr.add(Integer.valueOf(st.nextToken()));
        }
    }
    public static boolean AC(String p) throws IOException {
        setArr();
        for(int i=0;i<p.length();i++){
            switch (p.charAt(i)){
                case 'R':
                    reverse = !reverse;
                    break;
                case 'D':
                {
                    if(!D())//error
                        return false;
                }
            }
        }
        return true;
    }
    public static boolean D(){
        if(arr.size()!=0) {
            if(!reverse) arr.removeFirst();//정방향
            else arr.removeLast();//역방향
            return true;
        }
        return false;
    }
}
