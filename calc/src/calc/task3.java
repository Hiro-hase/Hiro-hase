package calc;
import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		sc.close();
		int sum = num1 + num2 + num3;
		System.out.println("合計:" + sum);
		int average1 = sum / 3;
		System.out.println("平均(3で割った時):" + average1);
		double average2 = sum / 3;
		System.out.println("平均(3.0で割った時):" + average2);
	}

}
