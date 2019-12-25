package loop;
import java.util.Scanner;
public class task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();
		sc.close();
		System.out.println("正の数を入力してください:" + numA);
		System.out.print(numA + "の約数:");
		for (int i = 1;  i <= numA; i++){
			if(numA % i ==0) {
				System.out.print(i);
			}
		}
	}

}
