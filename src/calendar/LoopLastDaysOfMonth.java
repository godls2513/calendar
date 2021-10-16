package calendar;

import java.util.Scanner;

public class LoopLastDaysOfMonth {
	private static final int[] LAST_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getLastDaysOfMonth(int month) {
		return LAST_DAYS[month -1];
	}
	public static void main(String[] args) {
		
		String PROMPT = "> ";
		Scanner sc = new Scanner(System.in);
		LoopLastDaysOfMonth ldom = new LoopLastDaysOfMonth();
		int month = 1;
		while(true) {
			System.out.println("달을 입력하세요 : ");
			System.out.print(PROMPT);
			month = sc.nextInt();
			if(month == -1) {
				System.out.println("Have a good day");
				break;
			}
			if(month > 12) {
				continue;
			}
			System.out.printf("%d월은 %d일까지 있습니다. \n", month, ldom.getLastDaysOfMonth(month) );
		}
		sc.close();
	}

}
