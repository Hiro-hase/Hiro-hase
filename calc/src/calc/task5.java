package calc;
import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		String str1 = "ノートPCの値段:";
		String str2 = "89800";
		String str3 = "円";
		String str = str1.concat(str2).concat(str3);
		System.out.println(str);
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
