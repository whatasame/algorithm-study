import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class s10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Character> bar= new LinkedList<>();
        String str = br.readLine();
        int b =0,answer=0;
        for(int i=0;i<str.length();i++)
            bar.add(str.charAt(i));//큐에넣기.
        while(!bar.isEmpty()){
            char c = bar.remove();
            switch (c){
                case '(':{
                    if(bar.peek()==')'){
                        answer+=b;//레이저에 의해 잘리는막대기
                        bar.remove();
                        break;
                        }
                    else {
                        b++;//레이저가 아니면 막대기개수 추가
                        break;
                    }
                }

                case ')':
                {
                    b--;//막대기의 끝
                    answer++;
                }
            }
        }
        answer+=b;
        System.out.print(answer);
    }
}
