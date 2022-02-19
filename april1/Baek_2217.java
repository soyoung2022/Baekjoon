package april1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalInt;

public class Baek_2217 {
    static int N;
    static int sameN;
    static int[] w;
    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        w = new int[N];
        for(int i = 0; i < N; i++){
            w[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(w);     // 10, 15 -> 15, 20
        // 로프가 다 쓰이지 않아도 되는 것이 핵심!
        result = 0;
        sameN = N;
        for(int i = 0; i < N; i++){
            int weight = w[i] * sameN;
            if(weight > result){
                result = weight;
            }
            sameN--;
        }
        System.out.println(result);
    }
}
