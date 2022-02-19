package febfirst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Baek_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 중복 제거하는 set 사용하기
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = 0; i < 10; i++){
            int num = Integer.parseInt(br.readLine()) % 42;
            if(hashSet.contains(num)){}
            else {
                hashSet.add(num);
            }
        }
        System.out.println(hashSet.size());
    }
}
