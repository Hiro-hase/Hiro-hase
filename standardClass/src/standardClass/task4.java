package standardClass;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		String Message = "ABCDGOPQRSYZ";
		Scanner sc = new Scanner(System.in);
		String SearchMessage = sc.next();
		sc.close();
		System.out.println("探したい文字:" + SearchMessage);
		if(Message.indexOf(SearchMessage) >= 0 ) {
			System.out.println(Message + "は" + SearchMessage + "を含む");
		}else{
			System.out.println(Message + "は" + SearchMessage + "を含まない");
		}
		
	}

}
