package janfourth;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_1297 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); // \n
		
		int D = Integer.parseInt(st.nextToken());// 52
		int H = Integer.parseInt(st.nextToken());// 9
		int W = Integer.parseInt(st.nextToken());// 16
		// 
		int height, width;
		// Math.pow(a, b)
		double x = Math.sqrt( (double)Math.pow(D, 2) / ((Math.pow(H, 2)) + Math.pow(W, 2)));		// D^2 / (W^2 + H^2)를 하면 x^2 나옴 -> x = 원래 길이를 구하기 위해 비율에 곱해야 하는 값
		
		height = (int) Math.floor(x*H);		// Math.floor 내림 함수로, .0 형태의 double로 반환함 -> int 형 변환 필요
		width = (int) Math.floor(x*W);
		
		System.out.println(height + " " + width);
	}
}
