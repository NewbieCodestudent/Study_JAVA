package test.com;

public class Solution {

	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		long r = x;
		for (int i = 0; i < n; i++) {
			answer[i] = r;
			r = r + x;
		}
		return answer;
	}
	
}
