package febfirst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_10823 {
    static StringBuilder stringA;
    static int A;
    static String str;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        stringA = new StringBuilder();
        while(true){
            str = br.readLine();
            if(str == null || str.trim().length() == 0){
                break;
            }
            stringA.append(str);
        }
        // System.out.println(stringA);
        A = 0;
        StringTokenizer st = new StringTokenizer(stringA.toString(), ",");
        while(st.hasMoreTokens()){
            A += Integer.parseInt(st.nextToken());
        }
        System.out.println(A);
    }
}
