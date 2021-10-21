package calendar;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT=">";
	
	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		MyCalendar cal = new MyCalendar();
		int month = 1;
		int year = -1;
		String week = null;
		
		while(true) {
			System.out.println("년도를 입력하세요");
			System.out.print(PROMPT);
			year = sc.nextInt();
			System.out.println("달을 입력하세요 : ");
			System.out.print(PROMPT);
			month = sc.nextInt();
			System.out.println("첫번째 요일을 입력하세요. (일, 월, 화, 수, 목, 금, 토)");
			week = sc.next();
			if(month == -1) {
				System.out.println("Have a good day");
				break;
			}
			if(month > 12) {
				continue;
			}
			cal.printCalendar(year, month);
		}
		sc.close();
	}
	public static void main(String[] args) {
		// 셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
