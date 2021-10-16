package calendar;

import java.util.Scanner;

public class EndLoopLastDaysOfMonth2 {
	private static final int[] LAST_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getLastDaysOfMonth(int month) {
		return LAST_DAYS[month -1];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EndLoopLastDaysOfMonth2 ldom = new EndLoopLastDaysOfMonth2();
		System.out.println("반복 횟수를 입력하세요: ");
		int loop = sc.nextInt();
		System.out.println("달을 입력하세요 : ");
//		for(int i=0; i<loop; i++) {
//			
//			int month = sc.nextInt();
//			
//			System.out.printf("%d월은 %d일까지 있습니다. \n", month, ldom.getLastDaysOfMonth(month) );
//		}
		
		int i = 0;
		while(i < loop) {
			i++;
			int month = sc.nextInt();
			System.out.printf("%d월은 %d일까지 있습니다. \n", month, ldom.getLastDaysOfMonth(month) );
		}
		sc.close();
	}

}
