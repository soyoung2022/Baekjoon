package febfirst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Baek_2407 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // Solving point --> int, long 자료형 모두 문제에서 주어진 값을 저장하기에는 부족하므로 BigInteger 사용하기
        BigInteger calCombination = new BigInteger("1");
        if(m > (n-m)){
            for(int i = m+1; i <= n; i++){
                calCombination = calCombination.multiply(BigInteger.valueOf(i));
            }
            for(int i = 2; i <= (n-m); i++){
                calCombination = calCombination.divide(BigInteger.valueOf(i));
            }
        } else{
            for(int i = n-m+1; i <= n; i++){
                calCombination = calCombination.multiply(BigInteger.valueOf(i));
            }
            for(int i = 2; i <= m; i++){
                calCombination = calCombination.divide(BigInteger.valueOf(i));
            }
        }
        System.out.println(calCombination);
    }
}
