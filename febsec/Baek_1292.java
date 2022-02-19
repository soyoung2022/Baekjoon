package febsec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int sum = 0, cnt = 0, a = 1;
        int sub = 0;
        boolean getOut = false;
        while(true){
            for(int i = 0; i < a; i++){
                sum += a;
                cnt++;
                if(cnt == A-1){
                    sub = sum;
                }
                else if(cnt == B){
                    getOut = true;
                    break;
                }
            }
            a++;
            if(getOut){
                break;
            }
        }
        System.out.println(sum-sub);
    }
}
