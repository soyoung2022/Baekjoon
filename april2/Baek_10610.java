package april2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Baek_10610 {
    static int check3;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(str.contains("0")){
            String[] strA = str.split("");
            Arrays.sort(strA, Collections.reverseOrder());
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < strA.length; i++){
                sb.append(strA[i]);
                check3 += Integer.parseInt(strA[i]);
            }
            if(check3 % 3 == 0){
                System.out.println(sb);
                return;
            }
        }
        System.out.println(-1);
    }
}
