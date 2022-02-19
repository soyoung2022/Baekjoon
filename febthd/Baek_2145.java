package febthd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2145 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String N = br.readLine();
			// System.out.println(N);
			if(N.equals("0")) {
				break;
			}
			String[] num = N.split("");
			System.out.println(cal(num));
		}
	}
	public static int cal(String[] num) {
		int sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum += (Integer.parseInt(num[i]));
		}
		if(sum / 10 != 0) {
			return cal(String.valueOf(sum).split(""));
		}
		else {
			return sum;
		}
	}
}