package febfirst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1032 {
    static int N, lengthStr;
    static String[] str1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        str1 = br.readLine().split("");
        lengthStr = str1.length;
        /*
        String str2 = "abcabcabcdefa";
        str2 = str2.replaceFirst("a", "?");
        System.out.println(str2); */

        for(int i = 0; i < N-1; i++){
            String[] compareStr = br.readLine().split("");
            // System.out.println(lengthStr);
            for(int j = 0; j < lengthStr; j++){
                String s = str1[j];
                String c = compareStr[j];
                // System.out.println(s + " " + c);
                if(s.equals(c)) {
                    // System.out.println(str1.replaceFirst(String.valueOf(s), "\\?"));
                } else{
                    str1[j] = "?";
                }
            }
        }
        for(String s : str1){
            System.out.print(s);
        }
    }
}
