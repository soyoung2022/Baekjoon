package febfirst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Baek_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   // 듣지도 못한 사람의 수 N
        int M = Integer.parseInt(st.nextToken());   // 보지도 못한 사람의 수 M
        // Solving point --> arraylist contains는 시간복잡도 O(n)으로 느리다. 상대적으로 빠른 hashset 사용하자.
        HashSet<String> names = new HashSet<>();
        TreeSet<String> notHearAndSee = new TreeSet<>();
        for(int i = 0; i < N; i++){     // 듣지도 못한 사람의 이름 배열에 추가
            names.add(br.readLine());
        }
        for(int i = 0; i < M; i++){     // 보지도 못한 사람의 이름 배열에 추가
            String name = br.readLine();
            if(names.contains(name)){       // 입력받은 이름이 names에 있으면 treeset에 추가 --> treeset 이용한 이유는 정렬 때문
                notHearAndSee.add(name);
            }
        }
        System.out.println(notHearAndSee.size());
        for(String s: notHearAndSee){
            System.out.println(s);
        }
    }
}
