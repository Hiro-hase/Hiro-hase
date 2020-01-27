package calc;
import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		String str1 = "ノートPCの値段:";
		int price = 89800;
		String str3 = "円";
		System.out.println(str1 + price + str3);
		Scanner sc1 = new Scanner(System.in);
		String str4 =sc1.nextLine();
		String str5 =sc1.nextLine();
		String str6 = str4.concat(str5);
		sc1.close();
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
	}

}
