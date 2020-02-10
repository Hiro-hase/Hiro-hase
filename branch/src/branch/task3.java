package branch;
import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		sc.close();
		System.out.println(num1);
		if(num1 > 0) {
			System.out.println("入力された数字は正の数です。");
		}
		if(num1 < 0) {
			System.out.println("入力された数字は負の数です。");
		}
		if(num1 == 0) {
			System.out.println("入力された数字は" + num1 + "です。");
		}


	}

}
