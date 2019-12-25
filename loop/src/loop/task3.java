package loop;
import java.util.Scanner;
public class task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();
		sc.close();
		System.out.println("数字を入力してください:" + numA);

		int numB = 0;
		while(numA > 0) {
			numA /= 10;
			numB ++;
		}
		System.out.println("桁数:" + numB);
	}

}
