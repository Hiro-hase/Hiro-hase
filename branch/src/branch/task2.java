package branch;
import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		sc.close();
		String str1 = "0" + num1;
		System.out.println("数字を入力してください");
		System.out.println(num1);
		if(num1 > 10) System.out.println(num1);
		if(num1 < 10) System.out.println(str1);


	}

}
