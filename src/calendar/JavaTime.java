package calendar;

import java.time.*;


public class JavaTime {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now(); // 현재의 날짜와 시간
		// 원하는 시간으로 time 객체 생성하는 방법
		LocalDate ld1 = LocalDate.of(2021, Month.OCTOBER, 23);
		System.out.println(ld1);
		// 16시 00분에 대한 LocalTime 객체를 구한다.
		LocalTime lt1 = LocalTime.of(16,00);
		System.out.println(lt1);
		//16시 30분 15초라는 문자열에 대한 LocalTime객체를 구한다.
		LocalTime lt2 = LocalTime.parse("16:30:15");
		System.out.println(lt2);
		
		// 현재 날짜와 시간정보를 getter메소드를 이용하여 구하는 방법
		LocalDate theDate = ldt.toLocalDate();
		Month month = ldt.getMonth();
		int day = ldt.getDayOfMonth();
		int hour = ldt.getHour();
		int minute = ldt.getMinute();
		int second = ldt.getSecond();
		System.out.println(month.getValue()+"/"+day+" "+hour+":"+minute+":"+second);
		System.out.println(ldt.getMonth());
	}

}
