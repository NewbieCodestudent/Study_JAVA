package test.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test03ObjectInputStream2 {

	public static void main(String[] args) {
		System.out.println("Hello ObjectInputStream");
		
		String path = "test.db";  // 파일 이름을 path로 작성
		File file = new File(path);   // path 제목으로 file 생성
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);  // 파일을 생성해 준다.
			oos = new ObjectOutputStream(fos);
			
			List<TestVO> vos = new ArrayList<TestVO>();
			for (int i = 0; i < 5; i++) {
				TestVO vo = new TestVO();
				vo.setNum(i+1);
				vo.setName("kim" + (i+1));
				vo.setAge(33+i);
				vos.add(vo);
			}
			oos.writeObject(vos);
			
			oos.flush();
			System.out.println("oos successed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
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
		
	}//end main

}//end class