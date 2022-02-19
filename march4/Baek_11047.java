package march4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baek_11047 {
    static int N, K, minCnt;
    static ArrayList<Integer> Val;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        Val = new ArrayList<>();
        // 입력받으면서 K - 가치 < 0가 되는 위치를 찾고, 그 위치 - 1을 변수에 저장한다. --> 가치를 만들 때 가장 큰 값으로 채우는 것이 중요하기 때문
        for(int i = 0; i < N; i++){
            int value = Integer.parseInt(br.readLine());
            if(K - value > 0){
                Val.add(value);
            } else if(K - value < 0){
            } else{
                minCnt = 1;
            }
        }

        if(minCnt == 1){
            System.out.println(minCnt);
            return;
        }
        minCnt = 0;

        // 이제 저장된 배열에서 거꾸로 가면서(--> 큰 가치의 동전부터 최대 개수로 세야 하기 때문) 최대 몇 개 넣을 수 있는지 세기
        for(int i = Val.size()-1; i >= 0; i--) {
            if (K - Val.get(i) >= 0) {
                minCnt += (K / Val.get(i));
                K -= Val.get(i) * (K / Val.get(i));
            }
            if(K == 0){
                break;
            }
        }
        System.out.println(minCnt);
    }
}
