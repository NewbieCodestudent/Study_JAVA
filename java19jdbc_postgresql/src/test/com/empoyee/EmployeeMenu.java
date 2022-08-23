package test.com.empoyee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

import test.com.empoyee.model.EmployeeDAO;
import test.com.empoyee.model.EmployeeDAOimpl;
import test.com.empoyee.model.EmployeeVO;

public class EmployeeMenu {

	public static void main(String[] args) throws IOException {
		System.out.println("Hello Employee");
		EmployeeDAO dao = new EmployeeDAOimpl();
		Reader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		boolean bool = true;
		String menu = "y";
		do {
			System.out.println("====================Employee===================");
			System.out.println("1.입력 2.수정 3.삭제 4.번호검색 5.키워드검색 6.전체인원");
			System.out.println("종료 [x] 계속[아무키] ");
			System.out.println("===============================================");
			System.out.println("메뉴를 선택하세요.");
			menu = br.readLine();
			
			if(menu.equals("1")) {
				System.out.println("===============================================");
				System.out.println("1.사원정보 입력페이지");
				System.out.println("===============================================");
				System.out.println("first_name : ");
				String first_name = br.readLine();
				System.out.println("last_name : ");
				String last_name = br.readLine();
				System.out.println("email : ");
				String email = br.readLine();
				System.out.println("salary : ");
				String salary = br.readLine();
				int salary2 = Integer.parseInt(salary);
				EmployeeVO vo = new EmployeeVO();
				vo.setfirst_name(first_name);
				vo.setLast_name(last_name);
				vo.setEmail(email);
				vo.setSalary(salary2);
				int result = dao.insert(vo);
				System.out.println("result : " + result);
				if (result ==1) System.out.println("입력성공");
				else System.out.println("입력오류");
			} else if(menu.equals("2")) {
				System.out.println("===============================================");
				System.out.println("2.사원정보 수정페이지");
				System.out.println("===============================================");
				System.out.println("사원번호 : ");
				String num = br.readLine();
				int num2 = Integer.parseInt(num);
				System.out.println("first_name : ");
				String first_name = br.readLine();
				System.out.println("last_name : ");
				String last_name = br.readLine();
				System.out.println("email : ");
				String email = br.readLine();
				System.out.println("salary : ");
				String salary = br.readLine();
				int salary2 = Integer.parseInt(salary);
				EmployeeVO vo = new EmployeeVO();
				vo.setNum(num2);
				vo.setfirst_name(first_name);
				vo.setLast_name(last_name);
				vo.setEmail(email);
				vo.setSalary(salary2);
				int result = dao.update(vo);
				System.out.println("result : " + result);
				if (result ==1) System.out.println("수정성공");
				else System.out.println("수정오류");
			} else if(menu.equals("3")) {
				System.out.println("===============================================");
				System.out.println("3.사원정보 삭제페이지");
				System.out.println("===============================================");
				System.out.println("사원번호 : ");
				String num = br.readLine();
				int num2 = Integer.parseInt(num);
				EmployeeVO vo = new EmployeeVO();
				vo.setNum(num2);
				int result = dao.delete(vo);
				System.out.println("result : " + result);
				if (result ==1) System.out.println("삭제성공");
				else System.out.println("삭제오류");
			} else if(menu.equals("4")) {
				System.out.println("===============================================");
				System.out.println("4.사원정보 번호검색 페이지");
				System.out.println("===============================================");
				System.out.println("사원번호 : ");
				String num = br.readLine();
				int num2 = Integer.parseInt(num);
				EmployeeVO vo2 = new EmployeeVO();
				if (vo2.getNum() == 0) {
					System.out.println("해당사원이 없습니다.");
				} else {
					System.out.print(vo2.getNum() + " | ");
					System.out.print(vo2.getFirst_name() + " | ");
					System.out.print(vo2.getLast_name() + " | ");
					System.out.print(vo2.getEmail() + " | ");
					System.out.print(vo2.getSalary() + " | ");
					System.out.println(vo2.getWdate());
				}
			} else if(menu.equals("5")) {
				System.out.println("===============================================");
				System.out.println("5.사원정보 검색어 검색 페이지");
				System.out.println("===============================================");
				System.out.println("검색키워드를 입력하세요. : ");
				String searchKey = br.readLine();
				System.out.println("검색어를 입력하세요. : ");
				String searchWord = br.readLine();
				System.out.println("-----------------------------------------------");
				System.out.println("사원번호 | First_name | Last_name | Email | Salary | Wdate");
				System.out.println("-----------------------------------------------");
				List<EmployeeVO> vos = dao.searchList(searchKey, searchWord);
				for (EmployeeVO x : vos) {
					System.out.print(x.getNum() + " | ");
					System.out.print(x.getFirst_name() + " | ");
					System.out.print(x.getLast_name() + " | ");
					System.out.print(x.getEmail() + " | ");
					System.out.print(x.getSalary() + " | ");
					System.out.println(x.getWdate());
				}
			} else if(menu.equals("6")) {
				System.out.println("===============================================");
				System.out.println("6.전체사원정보");
				System.out.println("===============================================");
				System.out.println("-----------------------------------------------");
				System.out.println("사원번호 | First_name | Last_name | Email | Salary | Wdate");
				System.out.println("-----------------------------------------------");
				List<EmployeeVO> vos = dao.selectAll();
				for (EmployeeVO x : vos) {
					System.out.print(x.getNum() + " | ");
					System.out.print(x.getFirst_name() + " | ");
					System.out.print(x.getLast_name() + " | ");
					System.out.print(x.getEmail() + " | ");
					System.out.print(x.getSalary() + " | ");
					System.out.println(x.getWdate());
				}
			}
			if(menu.equals("x")) break;
		} while(bool);
		System.out.println("종료");

	}//end main

}//end class