package array;

import java.util.Random;

public class task3 {

	public static void main(String[] args) {
		int[] numbers = new int[6];
		System.out.print("[");
		int max = 0;
		int min = 0;
		for (int i = 0; i < numbers.length; i++) {
			Random random = new Random();
			int randomValue = random.nextInt(10);
			numbers[i] = randomValue;
			if (i != 0) {
				System.out.print(",");
				max = Math.max(max, randomValue);
				min = Math.min(min, randomValue);
			}
			System.out.print(randomValue);
		}
        System.out.println("]");
        System.out.println("最大値: " + max);
        System.out.println("最小値: " + min);
	}

}
