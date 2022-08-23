package test.com.empoyee.model;

public interface EmployeeDB_postgres {
	
	String DRIVER_NAME = "org.postgresql.Driver";
	String URL = "jdbc:postgresql://localhost:5432/golfzon";
	String USER = "kosta";
	String PASSWORD = "hi123456";
	String INSERT = "insert into employee(num, first_name, last_name, email, salary, wdate)"
			+ "values(nextval('seq_employee'), ?, ?, ?, ?, 'now()')";
	String UPDATE = "update employee set first_name=?, last_name=?, email=?, salary=?, wdate='now()' where num=?";
	String DELETE = "delete from employee where num=?";
	String SELECT_ONE = "select * from employee where num=?";
	String SELECT_ALL = "select * from employee order by num asc";
	String SEARCH_LIST_FIRST_NAME = "select * from employee where first_name like ?";
	String SEARCH_LIST_LAST_NAME = "select * from employee where last_name like ?";
	String SEARCH_LIST_EMAIL = "select * from employee where email like ?";
	String SEARCH_LIST_SALARY = "select * from employee where salary = ?";
}
