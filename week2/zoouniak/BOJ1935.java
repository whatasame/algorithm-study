import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

/*후위 표기식을 앞에서부터 계산했을 때, 식의 결과와 중간 결과가 -20억보다 크거나 같고, 20억보다 작거나 같은 입력만 주어진다.
* int 쓰면 됨*/
public class BOJ1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());//피연산자 개수
        String postfix = br.readLine();
        Map <Character,Double> op = new HashMap<>();
        for(int i=0;i<N;i++) {
            op.put((char) ('A'+i), Double.valueOf(br.readLine()));//map이용해서 <A,5><B,3>이런 식으로 저장.
        }
        Stack<Double> stack = new Stack<>();
        for(int i=0;i<postfix.length();i++){
            switch (postfix.charAt(i)){
                case '+':{
                    double op1 = stack.pop();
                    double op2 = stack.pop();
                    stack.push(op1+op2);
                    break;}
                case '-':{
                    double op1 = stack.pop();
                    double op2 = stack.pop();
                    stack.push(op2-op1);
                    break;}
                case '*':{
                    double op1 = stack.pop();
                    double op2 = stack.pop();
                    stack.push(op1*op2);
                    break;
                }
                case '/':{
                    double op1 = stack.pop();
                    double op2 = stack.pop();
                    stack.push(op2/op1);
                    break;
                }
                default:{
                    stack.push(op.get(postfix.charAt(i)));
                }
            }
        }
        System.out.printf("%.2f",stack.pop());
        }
}
