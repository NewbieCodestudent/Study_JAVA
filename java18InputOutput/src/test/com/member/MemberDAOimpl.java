package test.com.member;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class MemberDAOimpl implements MemberDAO {
	
	List<MemberVO> vos = new ArrayList<MemberVO>();
	
	public MemberDAOimpl() {
		System.out.println("MemberDAOimpl()..");
	}

	@Override
	public int insert(MemberVO vo) {
		System.out.println("insert()...");
		System.out.println(vo);
		int flag = 0;
		vo.setNum(vos.size()+1);
		vos.add(vo);
		flag = executeFileOutput(vos);
		
		return flag;
	}
	
	

	private int executeFileOutput(
			List<MemberVO> vos) {
		int flag = 0;
		String path = "member.db";
		File file = new File(path);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(vos);
			
			oos.flush();
			System.out.println("oos successed...");
			flag = 1;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(oos!=null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return flag;
	}

	@Override
	public int update(MemberVO vo) {
		System.out.println("update()...");
		System.out.println(vo);
		
		int flag = 0;
		for (int i = 0; i < vos.size(); i++) {
			if(vo.getNum() == vos.get(i).getNum()) {
				vos.set(i, vo);
				flag = executeFileOutput(vos);
			}
		}
		return flag;
	}

	@Override
	public int delete(MemberVO vo) {
		System.out.println("delete()...");
		System.out.println(vo);
		int flag = 0;
		for (int i = 0; i < vos.size(); i++) {
			if(vo.getNum() == vos.get(i).getNum()) {
				vos.remove(i);
				flag = executeFileOutput(vos);
			}
		}
		
		return flag;
	}

	@Override
	public List<MemberVO> selectAll() {
		System.out.println("selectAll()...");
		
		List<MemberVO> vos = executeFileInput();
		
		return vos;
	}

	@SuppressWarnings("unchecked")
	private List<MemberVO> executeFileInput() {
		String path = "member.db";
		File file = new File(path);
		FileInputStream fos = null;
		ObjectInputStream ois = null;
		List<MemberVO> vos = null;
		try {
			fos = new FileInputStream(file);
			ois = new ObjectInputStream(fos);
			vos = 
			(List<MemberVO>) ois.readObject();
			
			
			System.out.println("ois successed...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(ois!=null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return vos;
	}

	@Override
	public MemberVO selectOne(MemberVO vo) {
		System.out.println("selectOne()...");
		System.out.println(vo);
		
		MemberVO vo2 = new MemberVO();
		vo2.setNum(77);
		vo2.setId("admin77");
		vo2.setPw("hi123477");
		vo2.setName("kim77");
		vo2.setTel("0277");
		return vo2;
	}

	@Override
	public List<MemberVO> searchList(String searchKey, String searchWord) {
		System.out.println("searchList()...");
		System.out.println(searchKey);
		System.out.println(searchWord);
		
		List<MemberVO> vos = new ArrayList<MemberVO>();
		
		for (int i = 0; i < 4; i++) {
			MemberVO vo = new MemberVO();
			vo.setNum(55 + i);
			vo.setId("admin55" + i);
			vo.setPw("hi1234555" + i);
			vo.setName("kim55" + i);
			vo.setTel("055" + i);
			vos.add(vo);
		}
		
		return vos;
	}

}
