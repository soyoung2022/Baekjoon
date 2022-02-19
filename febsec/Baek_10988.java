package febsec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int length = str.length();
        for(int s = 0, e = length-1; s < e; s++, e--) {
            System.out.println(str.charAt(s) + " " + str.charAt(e));
            if (str.charAt(s) != str.charAt(e)) {
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);

        /*
        다른 방법 : StringBuffer 클래스로 입력받은 str 전달하여 객체 생성
        ==> 그 객체.reverse().toString() 한 문자열을 처음 입력받은 문자열과 .equals() 메서드로 같은지 비교하기
        -> 같으면 팰린드롬이고 아니면 아님
         */
    }
}
