package branch;
import java.util.Scanner;
public class task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();
		int numB = sc.nextInt();
		sc.close();
		System.out.println("numA:" + numA);
		System.out.println("numB:" + numB);
		if(numA > 0 && numB > 0) {
			int remainder = numA % numB;
			if(remainder == 0) {
				System.out.println("numBはnumAの約数です");
			}else{
				System.out.println("numBはnumAの約数ではありません");}
			}else{
				System.out.println("正の整数を入力してください");
			}
	}

}
