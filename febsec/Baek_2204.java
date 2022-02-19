package febsec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek_2204 {
    static int n;
    static String[] str;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            n = Integer.parseInt(br.readLine());
            if(n == 0){
                break;
            }
            str = new String[n];
            for(int i = 0; i < n; i++){
                str[i] = br.readLine();
            }
            Arrays.sort(str, String.CASE_INSENSITIVE_ORDER);
            System.out.println(str[0]);
        }
    }
}
