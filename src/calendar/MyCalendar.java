package calendar;

public class MyCalendar {
	private static final int[] LAST_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private static final int[] LEAP_LAST_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public boolean isLeapYear(int year) {
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0 ))  
			return true;
		else
		return false;
	}
	
	public int getLastDaysOfMonth(int year, int month) {
		if(isLeapYear(year)) {
			return LEAP_LAST_DAYS[month -1];
		}else {
			return LAST_DAYS[month - 1];
		}
	}
	
	public void printCalendar(int year, int month) {
		System.out.printf("   <<%4d년%3d월>>\n",year, month);
		System.out.println("  일  월   화   수   목   금   토");
		System.out.println("---------------------");
		
		int maxday = getLastDaysOfMonth(year, month);
		
		for(int i = 1; i<=maxday; i++) {
			System.out.printf("%3d",i);
			if(i%7 == 0)
				System.out.println();
		}
		System.out.println();
		
//		System.out.println(" 1  2  3  4  5  6  7");
//		System.out.println(" 8  9 10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");
	}
	
	public static void main(String[] args) {
		
	}



}
