package test.com;

import java.util.LinkedList;
import java.util.Queue;

public class QuenuMain {

	public static void main(String[] args) {
		System.out.println("Hello Queue");

		Message msg1 = new Message("sendMail", "Hong");
		Message msg2 = new Message("sendSMS", "Shin");
		Message msg3 = new Message("sendKakaotalk", "Yang");
		Queue<Message> q = new LinkedList<Message>();
		q.offer(msg1);
		q.offer(msg2);
		q.offer(msg3);

//		System.out.println(q.poll()); // 가장 먼저 넣은 같이 나온다.
//		System.out.println(q.peek()); // 뽑으면 뭐 있나 보기

		while (!q.isEmpty()) {
			Message m = q.poll();
//			Message m = q.peek();
			switch (m.command) {
			case "sendMail":
				System.out.println(m.to + "에게 메일보내기.");
				break;

			case "sendSMS":
				System.out.println(m.to + "에게 문자보내기.");
				break;

			default:
				System.out.println(m.to + "에게 카톡보내기.");
				break;

			}
		}

		System.out.println("==================");
		for (Message m : q) {
			System.out.println(m);
		}

	}// end main

}// end class