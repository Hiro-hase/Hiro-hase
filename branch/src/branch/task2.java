package branch;
import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		System.out.println("数字を入力してください");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		sc.close();
		String str1 = null;
		if(num1 > 10) {
			System.out.println("値:" + num1);
		}
		if(num1 < 10) {
			str1 = "0" + num1;
			System.out.println("値:" + str1);
		}
	}

}
