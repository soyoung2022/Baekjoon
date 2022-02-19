package febsec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_16462 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        double avg = 0.0;
        for(int i = 0; i < N; i++){
            String str = br.readLine();
            if(Integer.parseInt(str) == 100){
                avg += 100;
            } else{
                str = str.replace("0", "9");
                str = str.replace("6", "9");
                avg += Integer.parseInt(str);
            }
        }
        avg = avg / (double) N;
        System.out.println((int) Math.round(avg));      // 맨 처음 제출 틀린 이유 --> 평균 성적과 가장 가까운 정수 출력을 위해서는 round 써야 하는데 ceil 사용함

//        System.out.println((int) Math.ceil(90.0));
//        String str = "60";
//        str = str.replace("0", "9");
//        str = str.replace("6", "9");
//        System.out.println(str);
    }
}
