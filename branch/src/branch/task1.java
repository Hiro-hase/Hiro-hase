package branch;
import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		System.out.println("10以上の数字を入力してください");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		sc.close();
		if(num1 >= 10) {
			System.out.println("値:" + num1);
		}
		if(num1 < 10) {
			System.out.println("値:" + num1 * 10);
		}


	}

}
