package test.com.member_me;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class MemberDAOimpl implements MemberDAO {

	@Override
	public String insert() {
		System.out.println("insert_회원정보를 입력해 주세요.");
		String path = "Member_me.db";
		File file = new File(path);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		Reader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);

		boolean bool = true;
		String x = "y";
		int num = 1;

		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);

			List<MemberVO> vos = new ArrayList<MemberVO>();
			do {
				MemberVO vo = new MemberVO();
				System.out.println("회원번호 " + num + "번 입니다.");
				vo.setNum(num);

				System.out.println("id를 입력해 주세요.");
				String id = br.readLine();
				vo.setId(id);

				System.out.println("pw를 입력해 주세요.");
				String pw = br.readLine();
				vo.setPw(pw);

				System.out.println("name를 입력해 주세요.");
				String name = br.readLine();
				vo.setName(name);

				System.out.println("tel를 입력해 주세요.");
				String tel = br.readLine();
				vo.setTel(tel);

				vos.add(vo);

				num++;
				System.out.println("종료시 X를 입력 [계속하고 싶으면 아무키나 눌러주세요]");
				x = br.readLine();
				if (x.equals("x"))
					break;

			} while (bool);
			{
				oos.writeObject(vos);
				oos.flush();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return "회원가입이 완료되었습니다.";
	}

	@SuppressWarnings("unchecked")
	@Override
	public void update() {
		System.out.println("update_회원정보 수정");

		String path = "Member_me.db";
		File file = new File(path);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		List<MemberVO> vos = null;
		int num;
		
		Reader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		try {
			fis = new FileInputStream("C:\\golfzon\\javaStudy\\java18InputOutput\\Member_me.db");
			ois = new ObjectInputStream(fis);
			vos = (List<MemberVO>) ois.readObject();
			
			System.out.println("회원번호를 검색해주세요.");
			String s = br.readLine();
			num = Integer.parseInt(s) - 1;
			MemberVO x = vos.get(num);
			if (num<=vos.size()) {
				System.out.println("기존 정보입니다.");
				System.out.println(x);

				System.out.println("수정 id를 입력해 주세요.");
				String id = br.readLine();
				x.setId(id);

				System.out.println("수정 pw를 입력해 주세요.");
				String pw = br.readLine();
				x.setPw(pw);

				System.out.println("수정 name를 입력해 주세요.");
				String name = br.readLine();
				x.setName(name);

				System.out.println("수정 tel를 입력해 주세요.");
				String tel = br.readLine();
				x.setTel(tel);

				vos.set(num, x);
			} else {
				System.out.println("회원추가입니다.");
				System.out.println(x);

				System.out.println("id를 입력해 주세요.");
				String id = br.readLine();
				x.setId(id);

				System.out.println("pw를 입력해 주세요.");
				String pw = br.readLine();
				x.setPw(pw);

				System.out.println("name를 입력해 주세요.");
				String name = br.readLine();
				x.setName(name);

				System.out.println("tel를 입력해 주세요.");
				String tel = br.readLine();
				x.setTel(tel);

				vos.add(x);
				
			}
			
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);

			oos.writeObject(vos);
			oos.flush();
			
//			x.setNum(1);
//			x.setId("admin");
//			x.setPw("qwer");
//			x.setName("lee");
//			x.setTel("010");
//			vos.set(num, x);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void delete() {
		System.out.println("delete_회원 1명 삭제");
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		List<MemberVO> vos = null;
		int num;
		
		Reader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		try {
			fis = new FileInputStream("C:\\golfzon\\javaStudy\\java18InputOutput\\Member_me.db");
			ois = new ObjectInputStream(fis);
			vos = (List<MemberVO>) ois.readObject();
			
			System.out.println("회원번호를 검색해주세요.");
			String s = br.readLine();
			num = Integer.parseInt(s) - 1;
			vos.remove(num);
			
			for (MemberVO x : vos) {
				System.out.println(x);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void selectAll() {
		System.out.println("selectAll_회원정보");
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		List<MemberVO> vos = null;
		
		try {
			fis = new FileInputStream("C:\\golfzon\\javaStudy\\java18InputOutput\\Member_me.db");
			ois = new ObjectInputStream(fis);
			vos = (List<MemberVO>) ois.readObject();
			for (MemberVO x : vos) {
				System.out.println(x);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void selectOne() {
		System.out.println("selectOne_회원 1명의정보");
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		List<MemberVO> vos = null;
		int num;
		
		Reader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		try {
			fis = new FileInputStream("C:\\golfzon\\javaStudy\\java18InputOutput\\Member_me.db");
			ois = new ObjectInputStream(fis);
			vos = (List<MemberVO>) ois.readObject();
			
			System.out.println("회원번호를 검색해주세요.");
			String s = br.readLine();
			num = Integer.parseInt(s) - 1;
			MemberVO x = vos.get(num);
			
			System.out.println(vos.get(num));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return;
	}
	
	// 수정필요
	@Override
	public List<MemberVO> searchList(String x, String y) {
		System.out.println("searchList");
		System.out.println(x);
		System.out.println(y);
		List<MemberVO> vos = new ArrayList<MemberVO>();
		for (int i = 0; i < 3; i++) {
			MemberVO vo = new MemberVO();
			vo.setNum(i);
			vo.setName("kim" + i);
			vo.setId("admin" + i);
			vo.setPw("qwer" + i);
			vo.setTel("010-" + i);
			vos.add(vo);
		}
		return vos;
	}

}
