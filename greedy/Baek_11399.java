package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

// Greedy 알고리즘
public class Baek_11399 {
    static ArrayList<Integer> arrayList;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        arrayList = new ArrayList<>();
        for(int i = 0; i < N; i++){
            arrayList.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arrayList);

        int result = 0;
        for(Integer i : arrayList){
            result += (N * i);
            N--;
        }

        System.out.println(result);
    }
}
