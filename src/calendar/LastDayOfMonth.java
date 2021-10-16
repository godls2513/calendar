package calendar;

import java.util.Scanner;

public class LastDayOfMonth {

	public static void main(String[] args) {
		//월을 입력하면 그 달이 몇일로 구성되어 있는지 출력하는 프로그램 작성하기
		int[] month = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		Scanner sc = new Scanner(System.in);
		System.out.print("달을 입력하세요.");
		int inputMonth = sc.nextInt();
		if(inputMonth == month[0]) {
			System.out.println("1월은 31일까지 있습니다.");
		}
		else if(inputMonth == month[1]) {
			System.out.println("2월은 28일까지 있습니다.");
		}
		else if(inputMonth == month[2]) {
			System.out.println("3월은 31일까지 있습니다.");
		}
		else if(inputMonth == month[3]) {
			System.out.println("4월은 30일까지 있습니다.");
		}
		else if(inputMonth == month[4]) {
			System.out.println("5월은 31일까지 있습니다.");
		}
		else if(inputMonth == month[5]) {
			System.out.println("6월은 30일까지 있습니다.");
		}
		else if(inputMonth == month[6]) {
			System.out.println("7월은 31일까지 있습니다.");
		}
		else if(inputMonth == month[7]) {
			System.out.println("8월은 31일까지 있습니다.");
		}
		else if(inputMonth == month[8]) {
			System.out.println("9월은 30일까지 있습니다.");
		}
		else if(inputMonth == month[9]) {
			System.out.println("10월은 31일까지 있습니다.");
		}
		else if(inputMonth == month[10]) {
			System.out.println("11월은 30일까지 있습니다.");
		}
		else if(inputMonth == month[11]) {
			System.out.println("12월은 31일까지 있습니다.");
		}
		sc.close();
	}

}
