package test.com.score.model;

public interface ScoreDB_postgres {

	String DRIVER_NAME = "org.postgresql.Driver";
	String URL = "jdbc:postgresql://localhost:5432/golfzon";
	String USER = "kosta";
	String PASSWORD = "hi123456";
	String SQL_INSERT = "insert into score(num, name, kor, eng, math)"
			+ " values(nextval('seq_score'), ?, ?, ?, ?);";
	String SQL_SELECT_ALL = "select * from score;";
	String SQL_UPDATE = "update score set name=?, kor=?, eng=?, math=? where num=?";
	String SQL_DELETE = "delete from score where num=?";
	String SQL_SELECT_ONE = "select * from score where num=?";
	String SQL_SEARCH_LIST_NAME = "select * from score where name like ?";
	String SQL_SEARCH_LIST_KOR = "select * from score where kor = ?";
	String SQL_SEARCH_LIST_ENG = "select * from score where eng = ?";
	String SQL_SEARCH_LIST_MATH = "select * from score where math = ?";
	
}
