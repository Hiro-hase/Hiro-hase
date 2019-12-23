package branch;
import java.util.Scanner;
public class task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		if(str == "月曜") {
			System.out.println(str);
			System.out.println("午前診療と午後診療があります");
		}else if(str == "土曜"){
			System.out.println(str);
			System.out.println("土曜は午前診療のみです");
		}else if(str == "日曜"){
			System.out.println(str);
			System.out.println("日曜は休診です");
		}else{
			System.out.println(str);
			System.out.println("入力を確認してください");

		}


	}

}
