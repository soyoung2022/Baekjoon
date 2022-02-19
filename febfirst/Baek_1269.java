package febfirst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Baek_1269 {
    static int a, b, element;
    static HashSet<Integer> nums;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        // 한꺼번에 입력받고 집합에 추가한다. --> 만약 입력받은 것이 이미 집합에 존재하면 추가하지 않고 있던 값 제거하기(교집합에 해당하므로)
        nums = new HashSet<>();
        for(int i = 0; i < 2; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < (i == 0 ? a : b); j++) {
                element = Integer.parseInt(st.nextToken());
                if (nums.contains(element)) {
                    nums.remove(element);
                } else {
                    nums.add(element);
                }
            }
        }
        System.out.println(nums.size());        // 최종적으로 남은 원소들의 개수가 대칭 차집합 원소들의 수이다.
    }
}
