package loop;
import java.util.Scanner;
public class task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();
		sc.close();
		System.out.println("数字を入力てください:" + numA);
		String str;
		int sum = 0;
		for (int i = 1; i <= numA; i++){
			sum += i;
		}

		 for(int i = 1; i<=numA; i++){
	            if(i>=2){
	                int numB = i - 1;
	            str = numB + "+" ;
	            System.out.print(str);
	            }
	        }

	        System.out.println( numA + "=" + sum);
	    }
	}
