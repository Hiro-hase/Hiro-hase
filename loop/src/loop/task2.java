package loop;
import java.util.Scanner;
public class task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();
		sc.close();
		System.out.println("数字を入力てください: " + numA);
		int sum = 0;
		for (int i = 1; i <= numA; i++ ) {
            if (i != 1) {
                System.out.print(" + ");
            }
            sum += i;
            System.out.print(i);
        }
        System.out.println(" = " + sum);
    }
}