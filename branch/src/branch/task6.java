package branch;
import java.util.Scanner;
public class task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();
		sc.close();
		String str;
		if(numA == 1) {
			str =  numA + "->" + "Ⅰ";
		}else if(numA == 2) {
			str = numA + "->" + "Ⅱ";
		}else if(numA == 3) {
			str = numA + "->" + "Ⅲ";
		}else if(numA == 4) {
			str = numA + "->" + "Ⅳ";
		}else if(numA == 5) {
			str = numA + "->" + "Ⅴ";
		}else{
			str = numA + "->" + "unknow";
		}
		System.out.println("数字を入力してください");
		System.out.println(numA);
		System.out.println(str);

	}

}
