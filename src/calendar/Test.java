package calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
	/**
	 * 특정 날짜에 대하여 요일을 구함(일 ~ 토)
	 * @param date
	 * @param dateType
	 * @return
	 * @throws Exception
	 */
	public String getDateDay(String date, String dateType) throws Exception {
	 
	     
	    String day = "" ;
	     
	    SimpleDateFormat dateFormat = new SimpleDateFormat(dateType) ;
	    Date nDate = dateFormat.parse(date) ;
	     
	    Calendar cal = Calendar.getInstance() ;
	    cal.setTime(nDate);
	     
	    int dayNum = cal.get(Calendar.DAY_OF_WEEK) ;
	     
	     
	     
	    switch(dayNum){
	        case 1:
	            day = "일";
	            break ;
	        case 2:
	            day = "월";
	            break ;
	        case 3:
	            day = "화";
	            break ;
	        case 4:
	            day = "수";
	            break ;
	        case 5:
	            day = "목";
	            break ;
	        case 6:
	            day = "금";
	            break ;
	        case 7:
	            day = "토";
	            break ;
	             
	    }
	    
	     
	     
	     
	    return day ;
	}
	public static void main(String[] args) {
		Date date = new Date();
		
//		Date today = new Date();
		
//		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
//		System.out.println(dateFormat.format(today)); // 년월일 형식으로 출력
//		System.out.println();
//		
//		dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
//		System.out.println(dateFormat.format(today)); // 년-월-일-시:분:초 형식으로 출력
		
		// 특정 날짜 요일 구하기
//		String inputDate = "구하고 싶은 날짜";
//		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
//		Date date = dateFormat.parse(inputDate);
//		
//		Calendar cal = Calendar.getInstance();
//		cal.setTime(date);
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
	}

}
