package febthd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baek_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<Character> stackL = new Stack<>();
        Stack<Character> stackR = new Stack<>();

        for(int i = 0; i < str.length(); i++){      // pop -> d, c, b, a 순으로 스택에서 꺼내짐
            stackL.push(str.charAt(i));
        }

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            String str2 = br.readLine();
            switch (str2.charAt(0)){
                case 'P':
                    stackL.push(str2.charAt(2));
                    break;
                case 'B':
                    if(stackL.empty()) break;
                    stackL.pop();
                    break;
                case 'L':
                    if(stackL.empty()) break;
                    stackR.push(stackL.pop());
                    break;
                case 'D':
                    if(stackR.empty()) break;
                    stackL.push(stackR.pop());
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stackL.empty()){
            stackR.push(stackL.pop());
        }
        while(!stackR.empty()) {
            sb.append(stackR.pop());
        }
        // a b c vs x d y

        System.out.println(sb);
    }
}
