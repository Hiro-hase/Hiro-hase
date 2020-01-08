package vrietyArray;

import java.util.ArrayList;

public class task2 {

	public static void main(String[] args) {
		int[] numbers = {21,3,32,6,99,72,78,51,1,26,87,11,48,60};
		ArrayList<Integer> Oddnumber = new ArrayList<>();
		ArrayList<Integer> Evennumber = new ArrayList<>();
		for (int i = 0; i < numbers.length; i++ ) {
			if (numbers[i] % 2 == 0) {
				Evennumber.add(numbers[i]);
			}else{
				Oddnumber.add(numbers[i]);
			}
		}
		System.out.print("奇数");
		System.out.println(Oddnumber);
		System.out.print("偶数");
		System.out.println(Evennumber);
	}

}
