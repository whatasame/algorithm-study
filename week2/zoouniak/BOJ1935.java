import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/*후위 표기식을 앞에서부터 계산했을 때, 식의 결과와 중간 결과가 -20억보다 크거나 같고, 20억보다 작거나 같은 입력만 주어진다.
* int 쓰면 됨*/
public class BOJ1935 {
    static Stack<String> stack= new Stack<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());//피연산자 개수
        StringTokenizer st = new StringTokenizer(br.readLine(),"");
        double answer = 0;
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]= Integer.parseInt(br.readLine());
        }//피연산자값 입력

        //후위표기 계산 피연산자는 스택에 넣고 연산자 나오면 스택에서 빼서 연산후 연산 결과 다시 스택에
        while(st.hasMoreTokens()){
            String c = st.nextToken();
            if(!c.equals(Integer.parseInt(c))){
                //피연산자면
                stack.push(c);
            }
            //A 아스키코드 97
            else{
                //연산자면

            }

        }


    }
}
