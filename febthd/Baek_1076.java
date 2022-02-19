package febthd;

import java.io.*;

public class Baek_1076 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long rs = 0;
        // (첫 번째 색 : 값 * 10 + 두 번째 색 : 값) * (세 번째 색 : Math.pow(10, 값)
        String color1 = br.readLine();
        rs = find(color1) * 10;
        String color2 = br.readLine();
        rs += find(color2);
        String color3 = br.readLine();
        rs *= Math.pow(10, find(color3));

        System.out.println(rs);
    }
    public static int find(String s){
        // 값 == 인덱스, 곱 == Math.pow(10, 인덱스) => 배열 사용하자
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int i = 0;
        for(i = 0; i < color.length; i++){
            if(s.equals(color[i])){
                break;
            }
        }
        return i;
    }
}
