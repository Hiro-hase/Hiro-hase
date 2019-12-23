package branch;
import java.util.Scanner;
public class task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();
		sc.close();
		System.out.println("数字を入力してください");
		System.out.println(numA);
		if(numA > 5) {
			System.out.println( numA + "->" + "unknown");
		}else if(numA == 1) {
			System.out.println( numA + "->" + "Ⅰ");
		}else if(numA == 2) {
			System.out.println( numA + "->" + "Ⅱ");
		}else if(numA == 3) {
			System.out.println( numA + "->" + "Ⅲ");
		}else if(numA == 4) {
			System.out.println( numA + "->" + "Ⅳ");
		}else if(numA == 5) {
			System.out.println( numA + "->" + "Ⅴ");
		}

	}

}
