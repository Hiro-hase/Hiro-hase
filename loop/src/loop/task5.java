package loop;

public class task5 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i ++) {
			for (int j = 1; j <= 9; j ++) {
					int mul = i * j;
					System.out.print(" ");
					if (10 > mul)
						System.out.print(" ");
				System.out.print(mul);
			}
			System.out.println();
		}
	}
}
