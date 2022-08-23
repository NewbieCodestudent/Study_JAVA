package test.com.board;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import test.com.board.model.BoardDAO;
import test.com.board.model.BoardDAOimpl;
import test.com.board.model.BoardVO;

public class BoardMain_menu {

	private static String num;
	private static String title;
	private static String content;
	private static String writer;

	public static void main(String[] args) {
		System.out.println("Hello Board");

		BoardDAO dao = new BoardDAOimpl();
		Reader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		BoardVO vo = new BoardVO();
		String user;
		boolean bool = true;
		try {
			f: do {
				System.out.println("==============================================");
				System.out.println("1.입력 2.수정 3.삭제 4.번호검색 5.모두검색 6.키워드검색");
				System.out.println("종료 [x]");
				System.out.println("==============================================");
				user = br.readLine();
				if (user.equals("1")) {
					boolean bool2 = true;
					do {
						System.out.println("1.글입력 페이지");
						System.out.println("제목 : ");
						title = br.readLine();
						System.out.println("내용 : ");
						content = br.readLine();
						System.out.println("작성자 : ");
						writer = br.readLine();
						vo.setTitle(title);
						vo.setContent(content);
						vo.setWriter(writer);
						int result = dao.insert(vo);
//						System.out.println("입력결과 : " + result);
						System.out.println("추가입력 아무키, 메뉴는 [x]를 눌러주세요.");
						user = br.readLine();
						if (user.equals("x"))
							continue f;
					} while (bool2);
				} else if (user.equals("2")) {
					boolean bool2 = true;
					do {
						System.out.println("2.글수정 페이지");
						System.out.println("글번호 : ");
						num = br.readLine();
						int num2 = Integer.parseInt(num);
						System.out.println("제목 : ");
						title = br.readLine();
						System.out.println("내용 : ");
						content = br.readLine();
						System.out.println("작성자 : ");
						writer = br.readLine();
						vo.setNum(num2);
						vo.setTitle(title);
						vo.setContent(content);
						vo.setWriter(writer);
						int result = dao.update(vo);
//						System.out.println("수정결과 : " + result);
						System.out.println("추가수정 아무키, 메뉴는 [x]를 눌러주세요.");
						user = br.readLine();
						if (user.equals("x"))
							continue f;
					} while (bool2);
				} else if (user.equals("3")) {
					boolean bool2 = true;
					do {
						System.out.println("3.글삭제 페이지");
						System.out.println("삭제하려는 글번호 : ");
						num = br.readLine();
						int num2 = Integer.parseInt(num);
						vo.setNum(num2);
						int result = dao.delete(vo);
//						System.out.println("삭제결과 : " + result);
						System.out.println("추가삭제 아무키, 메뉴는 [x]를 눌러주세요.");
						user = br.readLine();
						if (user.equals("x"))
							continue f;
					} while (bool2);
				} else if (user.equals("4")) {
					boolean bool2 = true;
					do {
						System.out.println("4.번호검색 페이지");
						System.out.println("검색 글번호 : ");
						num = br.readLine();
						int num2 = Integer.parseInt(num);
						vo.setNum(num2);
						BoardVO vo2 = dao.searchOne(vo);
						System.out.println("검색결과 : " + vo2);
						System.out.println("추가검색 아무키, 메뉴는 [x]를 눌러주세요.");
						user = br.readLine();
						if (user.equals("x"))
							continue f;
					} while (bool2);
				} else if (user.equals("5")) {
					boolean bool2 = true;
					do {
						List<BoardVO> list = dao.searchAll();
						System.out.println("5.전체페이지");
						System.out.println("==================================");
						System.out.println("글번호 | 제목 | 내용 | 작성자 | 작성날자");
						System.out.println("-----------------------------------");
						
						for (BoardVO x : list) {
							System.out.print(x.getNum() + " | ");
							System.out.print(x.getTitle() + " | ");
							System.out.print(x.getContent() + " | ");
							System.out.println(x.getWriter() + " | ");
						}
						System.out.println("메뉴로 가려면 [x]를 눌러주세요.");
						user = br.readLine();
						if (user.equals("x"))
							continue f;
					} while (bool2);
				} else if (user.equals("6")) {
					boolean bool2 = true;
					do {
						String key;
						String word;
						System.out.println("6.키워드검색");
						System.out.println("검색분류 :");
						key = br.readLine();
						System.out.println("검색단어 : ");
						word = br.readLine();
						List<BoardVO> list = dao.searchList(key, word);
						for (BoardVO x : list) {
							System.out.println(x);
						}
						System.out.println("메뉴로 가려면 [x]를 눌러주세요.");
						user = br.readLine();
						if (user.equals("x"))
							continue f;
					} while (bool2);
				} else if (user.equals("x")) {
					break;
				} else {
					System.out.println("없는 번호입니다. 다시 입력해주세요");
					continue f;
				}
			} while (bool);
			System.out.println("종료");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}// end main

}// end class