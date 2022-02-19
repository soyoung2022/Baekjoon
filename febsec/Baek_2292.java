package febsec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2292 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // 1, 6, 12, 18, 24, ...
        int i = 1;
        N -= 1;
        int room = 1;
        while(N > 0){
            int substract = 6 * i;
            N -= substract;
            i++;
            room++;
        }
        System.out.println(room);
    }
}
