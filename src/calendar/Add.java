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
		
	}

}
