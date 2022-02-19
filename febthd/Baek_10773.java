package febthd;

import java.io.*;
import java.util.ArrayList;

public class Baek_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int K, sum = 0, temp;
        ArrayList<Integer> store = new ArrayList<>();

        // 입력받기
        K = Integer.parseInt(br.readLine());
        for(int i = 0; i < K; i++){
            temp = Integer.parseInt(br.readLine());
            // 숫자가 0이 아닌 경우
            if(temp != 0){
                sum += temp;
                store.add(temp);
            }
            // 숫자가 0인 경우
            else{
                if(store.size() > 0){
                    sum -= store.get(store.size()-1);
                    store.remove(store.size()-1);
                }
            }
        }
        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }
}
