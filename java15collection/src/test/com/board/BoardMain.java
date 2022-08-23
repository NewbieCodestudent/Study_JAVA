package test.com.board;

public class BoardMain {

	public static void main(String[] args) {
		System.out.println("Hello Board");
		
		// BoardVO  - num(int), title, content, writer(String), wdate(date)
		// BoardDAO - interface(input, update, delete, searchAll, searchOne, searchList)
		// BoardDAOimpl - BoardDAO 상속
		// main에서 객체생성, 함수호출, 출력
		
		BoardDAOimpl result = new BoardDAOimpl();
		BoardVO vo = new BoardVO();
		
		System.out.println(result.input(vo));
		System.out.println();
		
		System.out.println(result.update(vo));
		System.out.println();
		
		System.out.println(result.delete(vo));
		System.out.println();
		
		vo.setNum(999);
		System.out.println(result.searchOne(vo));
		System.out.println();
		
		for (BoardVO x : result.searchAll()) {
			System.out.println(x);
		}
		System.out.println();
		
		for (BoardVO x : result.searchList("KKK", "LLL", "SSS")) {
			System.out.println(x);
		}
		System.out.println();
		
		for (BoardVO i : result.test().values()) {
			System.out.println(i);
		}	
		
	}//end main

}//end class
