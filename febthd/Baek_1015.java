package febthd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baek_1015 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        LinkedHashMap<Integer, Integer> arr = new LinkedHashMap<>();
        for(int i = 0; i < N; i++){
            arr.put(i, Integer.parseInt(st.nextToken()));
        }
        // 1,2. 정렬하기
        LinkedHashMap<Integer, Integer> list = sort(arr);        // 2, 0, 1
        // 3. 다시 인덱스 순 정렬하기
        for(Integer integer : sort(list).values()){
            System.out.print(integer + " ");
        }

        /*
        1. A[0] = 2, A[1] = 3, A[2] = 1
        2. A[2] = 1, A[0] = 2, A[1] = 3
        3. B[P[2]] = 1, B[P[0]] = 2, A[P[1]] = 3
        4. P[2] = 0, P[0] = 1, P[1] = 2
        2, 3, 1 (0, 1, 2) => 1, 2, 3(2, 0, 1) => 2, 0, 1(0, 1, 2) => 1, 2, 0
         */

    }
    public static LinkedHashMap<Integer, Integer> sort(LinkedHashMap<Integer, Integer> arr){
        List<Map.Entry<Integer, Integer>> entry = new LinkedList<>(arr.entrySet());
        Collections.sort(entry, (i1, i2) -> i1.getValue().compareTo(i2.getValue()));

        LinkedHashMap<Integer, Integer> list = new LinkedHashMap<>();
        int i = 0;
        for(Map.Entry<Integer, Integer> e : entry){
            list.put(i, e.getKey());
            i++;
        }
        return list;
    }
}
