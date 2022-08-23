package test.com;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test02Date {
	public static void main(String[] args) {
		System.out.println("Hello Date");
		
		Date ud = new Date();
		System.out.println(ud);
		
		// 현재의 날짜를 출력
		java.sql.Date sd = new java.sql.Date(System.currentTimeMillis());
		System.out.println(sd);
		
		// 현재의 날짜, 시간을 출력
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		System.out.println(ts);
		
		Calendar cal = Calendar.getInstance();
		System.out.print(cal.get(Calendar.YEAR) + "-");
		System.out.print(cal.get(Calendar.MONTH) + 1 + "-");
		System.out.print(cal.get(Calendar.DATE) + " ");
//		System.out.print(cal.get(Calendar.DAY_OF_MONTH) + " ");
		System.out.print(cal.get(Calendar.AM_PM) + " ");
//		System.out.print(cal.get(Calendar.HOUR) + ":");
		System.out.print(cal.get(Calendar.HOUR_OF_DAY) + ":");
		System.out.print(cal.get(Calendar.MINUTE) + ":");
		System.out.print(cal.get(Calendar.SECOND) + ":");
		System.out.println(cal.get(Calendar.MILLISECOND));
		
		GregorianCalendar gcal = new GregorianCalendar(2002, 11, 28, 17, 50, 1);
		System.out.print(gcal.get(Calendar.YEAR) + "-");
		System.out.print(gcal.get(Calendar.MONTH) + 1 + "-");
		System.out.print(gcal.get(Calendar.DATE) + " ");
//		System.out.print(gcal.get(Calendar.DAY_OF_MONTH) + " ");
		System.out.print(gcal.get(Calendar.AM_PM) + " ");
//		System.out.print(gcal.get(Calendar.HOUR) + ":");
		System.out.print(gcal.get(Calendar.HOUR_OF_DAY) + ":");
		System.out.print(gcal.get(Calendar.MINUTE) + ":");
		System.out.print(gcal.get(Calendar.SECOND) + ":");
		System.out.println(gcal.get(Calendar.MILLISECOND));
		
		
		
	}//end main

}//end class
