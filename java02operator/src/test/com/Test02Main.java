package test.com;

public class Test02Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
		//3.비교연산 ==, !=, >, <, >=, <=  : 결과값이 boolean 타입으로 나온다.
		int su1 = 5;
		int su2 = 5;
		System.out.println(su1 == su2);
		System.out.println(su1 != su2);
		System.out.println(su1 > su2);   // 초과
		System.out.println(su1 < su2);   // 미만
		System.out.println(su1 >= su2);  // 이상연산자, 코드는 왼쪽이 항상 기준으로 작성되기 때문에 왼쪽기준으로 부호를 읽어준다.
		System.out.println(su1 <= su2);  // 이하
		
		//4.비트연산 : 논리 & | ^, 반전 ~
		System.out.println(10 & 3);
		// 1010 10의 비트 값이  
		// 0011 3의 비트 값이 
		// 0010 결과 (같은 것만 1로 표시) 
		System.out.println(10 | 3);
		// 1010 10의 비트 값이  
		// 0011 3의 비트 값이 
		// 1011 결과 (하나라도 있으면 1로 표시)
		System.out.println(10 ^ 3);
		// 1010 10의 비트 값이  
		// 0011 3의 비트 값이 
		// 1001 결과 (안 맞는것만 1로 표시)
		System.out.println(~10);
		// 0000 1010 10의 비트 값  
		// 1111 0101 -11의 비트 값 (숫자를 반전) 
		System.out.println("=================");

		//5.비트연산 : 이동(쉬프트) >>, <<, >>>(우측으로 이동하되 양수만 이동)
		// 0000 1000 : 8     8 >> 1 : 4
		// >> (우측이동은 두배)  << (죄측이동은 반감)
		// 1000 0000 : 128
		System.out.println(8 >> 1);   // 1/2
		System.out.println(8 >> 2);   // 1/4
		System.out.println(128 >> 1); // 1/2
		System.out.println(128 >> 2); // 1/4
		System.out.println(5 >> 1);   // 홀수는 나머지를 버림.
		System.out.println("=================");
		System.out.println(8 << 1);   // 2배
		System.out.println(8 << 2);   // 4배
		System.out.println(128 << 1); // 2배
		System.out.println(128 << 2); // 4배
		System.out.println("=================");
		System.out.println(128 >>> 1);
		System.out.println(-128 >>> 1);
		System.out.println("=================");
				
		//6.논리연산 &, |, &&, ||  (입력 또는 출력되는 결과 값이 boolean(true or false)만 와야한다.)
		//true & false, 5==5 & Boolean.parseBoolean("true")
		System.out.println(true & false);
		System.out.println(true && false); 
		System.out.println(false & true);   // &의 연산은 앞 뒤의 참 거짓을 판단 후 비교
		System.out.println(false && true);  // &&의 연산은 앞이 거짓이면 오른쪽은 계산하지 않고 거짓으로 판단
		System.out.println(true | false);
		System.out.println(true || false);
		System.out.println(false | true);
		System.out.println(false || true);  // ||의 연산은 앞이 참이면 오른쪽은 계산하지 않고 참으로 판단
		System.out.println("=================");
				
		//단항연산자 : 증감연산[++(1씩 증가), --(1씩 감소)], 음양(+, -), 부정(!), ~ 
		int max = 10;
		max++;  // 1증가 >> max += 1;  >> max = max + 1;
		System.out.println(max);
		++max;  // 앞뒤 어디에 붙여도 상관없지만 뒤에 붙을 때는 다른 연산자와 같이 사용하면 나중에 계산이 된다. 
		System.out.println(max);
		System.out.println("=================");
		
		int top = ++max;
		System.out.println(top);
		System.out.println(max);
		System.out.println("=================");
		
		int top2 = max++;
		System.out.println(top2);
		System.out.println(max);
		System.out.println("=================");
	
		//기타 : (), {}, [], 삼항연산자(조건 boolean값 ? 참 반환값 : 거짓 반환값)
		System.out.println(true ? 100 : 0);
		System.out.println(false ? 100 : 0);
		
		boolean bool = true;
		System.out.println(bool ? 100 : 0);
		
		int min = 60;
		System.out.println(min<=60 ? "No" : "Good");
		
		//여러조건을 넣을 때는 거짓 반환값 부분에 조건을 다시 걸어서 여러조건을 적용할 수 있다.
		int total = 60+60+60;
		double avg = total / 3.0;
		System.out.println(avg >= 90 ? "A" : "B");
		System.out.println(avg >= 90 ? "A" : avg >= 80 ? "B" : avg >= 70 ? "C" : "D");
		
		String grade = (avg >= 90) ? "A" : avg >= 80 ? "B" : avg >= 70 ? "C" : "D";
		System.out.println(grade);
		// 삼항연산을 변수로 지정해서 할 경우 각 참, 거짓 반환값의 결과값의 타입은 같은 타입으로 입력해야 한다.
		
		
		
	}//end main

}//end class