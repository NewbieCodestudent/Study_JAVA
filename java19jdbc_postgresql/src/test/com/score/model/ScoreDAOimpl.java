package test.com.score.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ScoreDAOimpl implements ScoreDAO {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	// #1 드라이버 접속
	public ScoreDAOimpl() {
		System.out.println("ScoreDAOimpl...");
		try {
			Class.forName(ScoreDB_postgres.DRIVER_NAME);
			System.out.println("Driver succesed");
			
//			jdbcConnctionTest();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// #2 jdbc 연결 테스트
	private void jdbcConnctionTest() {
		try {
			conn = DriverManager.getConnection(ScoreDB_postgres.URL, ScoreDB_postgres.USER, ScoreDB_postgres.PASSWORD);
			System.out.println("conn successed");
			String sql = "select version() as version";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getString("version"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}// end finally
	}
	
	@Override
	public int insert(ScoreVO vo) {
		System.out.println("inset");
		System.out.println(vo);
		int flag = 0;
		try {
			conn = DriverManager.getConnection(ScoreDB_postgres.URL, ScoreDB_postgres.USER, ScoreDB_postgres.PASSWORD);
			pstmt = conn.prepareStatement(ScoreDB_postgres.SQL_INSERT);
			pstmt.setString(1, vo.getName());
			pstmt.setInt(2, vo.getKor());
			pstmt.setInt(3, vo.getEng());
			pstmt.setInt(4, vo.getMath());
			flag = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}//end finally
		return flag;
	}

	@Override
	public int update(ScoreVO vo) {
		System.out.println("update");
		System.out.println(vo);
		int flag = 0;
		
		try {
			conn = DriverManager.getConnection(ScoreDB_postgres.URL, ScoreDB_postgres.USER, ScoreDB_postgres.PASSWORD);
			pstmt = conn.prepareStatement(ScoreDB_postgres.SQL_UPDATE);
			pstmt.setString(1, vo.getName());
			pstmt.setInt(2, vo.getKor());
			pstmt.setInt(3, vo.getEng());
			pstmt.setInt(4, vo.getMath());
			pstmt.setInt(5, vo.getNum());
			flag = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return flag;
	}

	@Override
	public int delete(ScoreVO vo) {
		System.out.println("delete");
		System.out.println(vo);
		int flag = 0;
		try {
			conn = DriverManager.getConnection(ScoreDB_postgres.URL, ScoreDB_postgres.USER, ScoreDB_postgres.PASSWORD);
			pstmt = conn.prepareStatement(ScoreDB_postgres.SQL_DELETE);
			pstmt.setInt(1, vo.getNum());
			flag = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return flag;
	}

	@Override
	public ScoreVO selectOne(ScoreVO vo) {
		System.out.println("selectOne");
		ScoreVO vo2 = new ScoreVO();
		try {
			conn = DriverManager.getConnection(ScoreDB_postgres.URL, ScoreDB_postgres.USER, ScoreDB_postgres.PASSWORD);
			pstmt = conn.prepareStatement(ScoreDB_postgres.SQL_SELECT_ONE);
			pstmt.setInt(1, vo.getNum());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo2.setNum(rs.getInt("num"));
				vo2.setName(rs.getString("name"));
				vo2.setKor(rs.getInt("kor"));
				vo2.setEng(rs.getInt("eng"));
				vo2.setMath(rs.getInt("math"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return vo2;
	}

	@Override
	public List<ScoreVO> selectAll() {
		System.out.println("selectAll");
		List<ScoreVO> list = new ArrayList<ScoreVO>();
		try {
			conn = DriverManager.getConnection(ScoreDB_postgres.URL, ScoreDB_postgres.USER, ScoreDB_postgres.PASSWORD);
			pstmt = conn.prepareStatement(ScoreDB_postgres.SQL_SELECT_ALL);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ScoreVO vo = new ScoreVO();
				vo.setNum(rs.getInt("num"));
				vo.setName(rs.getString("name"));
				vo.setKor(rs.getInt("kor"));
				vo.setEng(rs.getInt("eng"));
				vo.setMath(rs.getInt("math"));
				vo.setTotal(rs.getInt("kor") + rs.getInt("eng") + rs.getInt("math"));
				int sum = rs.getInt("kor") + rs.getInt("eng") + rs.getInt("math");
				vo.Grade(sum);
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}//end finally
		
		return list;
	}

	@Override
	public List<ScoreVO> searchList(String x, String y) {
		System.out.println("searchList");
		System.out.print(x + " ");
		System.out.print(y);
		List<ScoreVO> list = new ArrayList<ScoreVO>();
		try {
			conn = DriverManager.getConnection(ScoreDB_postgres.URL, ScoreDB_postgres.USER, ScoreDB_postgres.PASSWORD);
			if (x.equals("name")) {
				pstmt = conn.prepareStatement(ScoreDB_postgres.SQL_SEARCH_LIST_NAME);
				pstmt.setString(1, "%" + y + "%");
			} else if (x.equals("kor")) {
				int i = Integer.parseInt(y);
				pstmt = conn.prepareStatement(ScoreDB_postgres.SQL_SEARCH_LIST_KOR);
				pstmt.setInt(1, i);
			} else if (x.equals("eng")) {
				int i = Integer.parseInt(y);
				pstmt = conn.prepareStatement(ScoreDB_postgres.SQL_SEARCH_LIST_ENG);
				pstmt.setInt(1, i);
			} else if (x.equals("math")) {
				int i = Integer.parseInt(y);
				pstmt = conn.prepareStatement(ScoreDB_postgres.SQL_SEARCH_LIST_MATH);
				pstmt.setInt(1, i);
			}
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				ScoreVO vo = new ScoreVO();
				vo.setNum(rs.getInt("num"));
				vo.setName(rs.getString("name"));
				vo.setKor(rs.getInt("kor"));
				vo.setEng(rs.getInt("eng"));
				vo.setMath(rs.getInt("math"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return list;
	}
	
}
