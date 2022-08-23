package test.com;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02Date2 {
	public static void main(String[] args) {
		System.out.println("Hello Date");
		
		Date ud = new Date();
		System.out.println(ud);
		System.out.println(ud.getTime());
		
		// 날짜타입을 이쁘게 변형(포멧) 해주는 객체
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		String str_date = sdf.format(ud);
		System.out.println(str_date);
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초 SSS");
		str_date = sdf.format(ud);
		System.out.println(str_date);
		
		
	}//end main

}//end class
