package test.com.empoyee;

import java.util.List;

import test.com.empoyee.model.EmployeeDAO;
import test.com.empoyee.model.EmployeeDAOimpl;
import test.com.empoyee.model.EmployeeVO;

public class EmployeeMain {

	public static void main(String[] args) {
		System.out.println("Hello Employee");
		
		EmployeeDAO dao = new EmployeeDAOimpl();
		EmployeeVO vo = new EmployeeVO();
		
//		vo.setFist_name("kim");
//		vo.setLast_name("jae seok");
//		vo.setEmail("lee@naver.com");
//		vo.setSalary(900);
//		int result = dao.insert(vo);
		
//		vo.setFist_name("kim");
//		vo.setLast_name("ji heok");
//		vo.setEmail("kim@naver.com");
//		vo.setSalary(700);
//		vo.setNum(2);
//		int result = dao.update(vo);
		
//		vo.setNum(3);
//		int result = dao.delete(vo);
		
//		vo.setNum(1);
//		EmployeeVO result = dao.selectOne(vo);
//		System.out.println(result);
		
//		List<EmployeeVO> list = dao.searchList("email", "kim");
//		for (EmployeeVO x : list) {
//			System.out.println(x);
//		}
//		list = dao.searchList("salary", "500");
//		for (EmployeeVO x : list) {
//			System.out.println(x);
//		}
		
		
//		List<EmployeeVO> list = dao.selectAll();
//		for (EmployeeVO x : list) {
//			System.out.println(x);
//		}
		
	}//end main

}//end class