package calendar;

import java.util.Scanner;

public class LastDaysOfMonth2 {
	private static final int[] LAST_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getLastDaysOfMonth(int month) {
		return LAST_DAYS[month -1];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LastDaysOfMonth2 ldom = new LastDaysOfMonth2();
		System.out.print("달을 입력하세요 : ");
		int month = sc.nextInt();
		
		System.out.printf("%d월은 %d일까지 있습니다. \n", month, ldom.getLastDaysOfMonth(month) );
	}

}
