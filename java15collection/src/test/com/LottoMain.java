package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoMain {

	public static void main(String[] args) {
		// 로또번호생성기
		// 로또번호 - 1~45 , 6개의 중복없는 수를 랜덤하게 추출
		// 출력.
		// 얼마치 드릴까요? 1천원- 1줄
		// 2천원- 2줄
		// Arrays.sort(Object[]);//정렬

		Random ran = new Random();
		Set<Integer> s = new HashSet<Integer>();

		InputStream is = null;
		Reader r = null;
		BufferedReader br = null;
		try {
			is = System.in;
			r = new InputStreamReader(is);
			br = new BufferedReader(r);

			System.out.println("얼마치드려요?[천원]:");
			String str_money = br.readLine();

			int money = Integer.parseInt(str_money);
			for (int i = 0; i < money; i++) {
				while (s.size() < 6) {
					s.add(ran.nextInt(45) + 1);
				}
				Object[] objs = s.toArray();
				Arrays.sort(objs);
				for (Object obj : objs) {
					System.out.print(obj + " ");
				}
				System.out.println();
				s.clear();
			}

		} catch (IOException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (r != null) {
				try {
					r.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (is != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} // end finally

	}// end main

}// end class