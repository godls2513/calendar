package calendar;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		int num1, num2, sum;
		System.out.println("두 수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		sum = num1 + num2;
		System.out.println("두 수의 합은 " + sum + "입니다.");
		String su1, su2;
		System.out.println();
		System.out.println("두 수를 입력하세요.");
		sc = new Scanner(System.in);
		su1 = sc.next();
		su2 = sc.next();
		num1 = Integer.parseInt(su1);
		num2 = Integer.parseInt(su2);
		
		System.out.printf("%d과(와) %d의 합은 %d입니다.", num1, num2, num1 + num2); //%d는 정수, %f는 실수, %c는 문자, %s는 문자열 표현
		sc.close();
		
		
	}

}
