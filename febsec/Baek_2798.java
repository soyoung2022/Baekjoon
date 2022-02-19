package febsec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_2798 {
    public static void main(String[] args) throws IOException{
        // 1. 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 2. 카드 3장 구하기: 정렬 -> 양 끝 수 더하기 -> 2번째 인덱스부터 더하며 M보다 작고 그 전 합보다 크면 값 교체
        // -> 만약 M보다 커지면 다음 =>
        // -> M하고 같을 때는 그냥 빠져나오기!
        // 36 93 138 181 185 214 216 245 295 315
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        for(int i = 0; i < N-2; i++){
            if(arr[i] >= M) {
                continue;
            }
            for(int j = i+1; j < N-1; j++){
                if(arr[j] >= M){
                    continue;
                }
                for(int k = j+1; k < N; k++){
                    int num = arr[i] + arr[j] + arr[k];
                    // System.out.println(num);
                    if(num > M){
                        // System.out.println("bigger");
                        continue;
                    }
                    else if(num == M){
                        System.out.println(M);
                        // System.out.println("same");
                        return;
                    }
                    sum = Math.max(sum, num);
                    // System.out.println("change");
                }
            }
        }
        System.out.println(sum);
    }
}
