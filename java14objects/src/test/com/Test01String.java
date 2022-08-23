package test.com;

import java.io.UnsupportedEncodingException;

public class Test01String {

	public static void main(String[] args) throws UnsupportedEncodingException {
		System.out.println("Hello String");
		String txt = "Hello yangssem!!!";
		
		// .length() : 글자의 수를 확인
		System.out.println("txt.length() : " + txt.length());
		
		// .charAt() : _번 글자를 출력
		System.out.println("txt.charAt(0) : " + txt.charAt(0));
		
		// .split(" ") : " "로 기준으로 나누어라 (배열이 생성된다.)
		System.out.println("txt.split(\" \") : " + txt.split(" ")); 
		System.out.println(txt.split(" ")[0]);
		System.out.println(txt.split(" ")[1]);
		
		// .equals("kim") : " "와 비교(참, 거짓으로 반환)
		// 대소문자까지 구분해서 판별
		System.out.println("txt.equals(\"kim\") : " + txt.equals("kim"));  
		System.out.println("txt.equals(\"Hello yangssem!!!\") : " + txt.equals("Hello yangssem!!!")); 
		System.out.println("txt.equals(\"hello yangssem!!!\") : " + txt.equals("hello yangssem!!!"));
		
		// .equalsIgnoreCase() : 대소문자구분없이 스펠링만 확인
		System.out.println("txt.equalsIgnoreCase(\"hello yangssem!!!\") : " + txt.equalsIgnoreCase("hello yangssem!!!")); 
		System.out.println("txt.compareTo(\"Hello yangssem!!!\") : " + txt.compareTo("Hello yangssem!!!"));
		
		// .compareTo() : 글자가 같은지 여부를 해시코드로 비교해서 알려준다.
		System.out.println("txt.compareTo(\"hello yangssem!!!\") : " + txt.compareTo("hello yangssem!!!"));
		
		// .compareToIgnoreCase() : 대소문자 구분없이 비교
		System.out.println("txt.compareToIgnoreCase(\"hello yangssem!!!\") : " + txt.compareToIgnoreCase("hello yangssem!!!")); 

		// .indexOf() : " " 해당글자의 첫번째 위치를 찾아준다. 없으면 음수
		System.out.println("txt.indexOf(\"h\") : " + txt.indexOf("h"));
		System.out.println("txt.indexOf(\"H\") : " + txt.indexOf("H"));
		
		// .lastIndexOf() : " " 해당글자의 마지막 위치를 알려준다.
		System.out.println("txt.lastIndexOf(\"H\") : " + txt.lastIndexOf("H"));
		
		// .startsWith() or .endsWith() : 시작과 끝나는 글자가 맞는지 확인
		System.out.println("txt.startsWith(\"H\") : " + txt.startsWith("H"));
		System.out.println("txt.endsWith(\"H\") : " + txt.endsWith("H"));
		
		System.out.println("=====================================================================");
		txt = "http://yangssem.com/golfzon/y2.png";

		// .substring : _번 부터 뒤에 글자만 출력
		System.out.println("txt.substring(27) : " + txt.substring(20));
		System.out.println(txt.lastIndexOf("/"));
		System.out.println(txt.substring(txt.lastIndexOf("/"))); // = System.out.println("txt.lastIndexOf(\"/\") : " + txt.lastIndexOf("/"));
		
		// .substring(,) : _번 부터 _번 글자를 출력 
		System.out.println("txt.substring(7, 14+1) : " + txt.substring(7, 14+1));
		System.out.println(txt.substring(7, 7 + "yangssem".length())); // 해당 글자 첫글자의 위치와 글자를 통해 글자 출력
		
		// .concat() : () 안에 글자를 합쳐서 출력해준다.
		System.out.println(txt.concat("?id=admin")); // 변수를 바꾸는 것이 아니다.
		System.out.println(txt);
		txt = txt.concat("?id=admin"); // 변수를 수정(재할당)
		System.out.println(txt);
		System.out.println("=====================================================================");
		
		// 계산시간을 확인하는 방법
		long startTime = System.currentTimeMillis();
		String str = "";
		StringBuffer sb = new StringBuffer(); // 글자를 합치는 방법
		for (int i = 0; i < 100000; i++) {
			//str += "Hello";  // 6초
			//str = str.concat("Hello");  // 3초
			sb.append("Hello"); // 0.006초
		}
		str = sb.toString();
		System.out.println("time : " + (System.currentTimeMillis() - startTime));
		System.out.println("=====================================================================");
		txt = "Hello World!!";
		
		// .contains() : ()글자가 있는지 확인
		System.out.println(txt.contains("Hello"));
		System.out.println(txt.contains("World"));
		System.out.println(txt.contains("world"));
		
		// .replace('','') : ''글자를 ''글자로 바꾸어라 
		System.out.println("txt.replace('o', 'O') : " + txt.replace('o', 'O')); // txt가 재할당되는 것은 아니다.
		txt = txt.replace('o', 'O');
		System.out.println(txt);
		System.out.println(txt.replace("He", "히히"));
//		System.out.println(txt.replaceAll([a-z], [A-Z]));
		
		// .toCharArray() : char 배열로 바꾸어 한글자씩 저장
		char[] cs = txt.toCharArray();
		for (char c : cs) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		// .toLowerCase() : 전부 소문자로 출력
		System.out.println(txt.toLowerCase());
		
		// .toUpperCase() : 전부 대문자로 출력
		System.out.println(txt.toUpperCase());
		
		// .trim() : 앞뒤에 있는 공백을 제거
		txt = "  Hello World!!  ";
		System.out.println(txt.length());
		System.out.println(txt.trim().length());
		
		// .getBytes() : byte code로 변환해줌
		byte[] bs = txt.getBytes("utf-8");
		System.out.println(bs);
		for (byte b : bs) {
			System.out.print(b + " ");
		}
		System.out.println();
		
		// .join(구분자, 1, 2) : 1~2번 사이에 구분자를 넣어준다. 배열도 가능   
		System.out.println(String.join("-", "aaa", "bbb", "ccc"));
		System.out.println(String.join("-", new String[] {"aa", "bb", "cc"}));
		
		// .valueof() : 숫자를 문자열로 바꾸어줌
		System.out.println(String.valueOf(1000) + 1000);
		
	}// end main

}// end class