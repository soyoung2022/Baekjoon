package febthd;

import java.io.*;
import java.util.StringTokenizer;

public class Baek_1629 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        /*
        분할정복 => O(logn)에 연산을 처리한다.
         */

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());

        System.out.println(power(A, B, C));
    }
    public static long power(long a, long b, long c){
        if(b == 1){
            return a % c;
        }
        long result = power(a, b / 2, c);
        if(b % 2 == 0){
            return result * result % c;
        }
        return (result * result % c) * a % c;
    }
}
