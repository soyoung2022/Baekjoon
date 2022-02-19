package janthd;
import java.util.Scanner;

public class baek_2139 {
	public static boolean isLeapYear(int year) {		// checking year is leap year or not
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] days = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		while(true) {
			int year, month, date;
			date = input.nextInt();
			month = input.nextInt();
			year = input.nextInt();
			
			if(year == 0 && month == 0 && date == 0) {
				break;
			}
			
			int sum = date; // 12, 13
			for(int i = 0; i < month-1; i++) {
				sum += days[i];
			}
			
			if(month > 2 && isLeapYear(year)) {	// 3
				sum += 1;
			}
			
			System.out.println(sum);
		}
		
		input.close();
		
	}
}
