package vrietyArray;

import java.util.ArrayList;

public class task2 {

	public static void main(String[] args) {
		int[] ImputNUmbers = {21,3,32,6,99,72,78,51,1,26,87,11,48,60};
		ArrayList<Integer> OddNumbers = new ArrayList<>();
		ArrayList<Integer> EvenNumbers = new ArrayList<>();
		for (int i = 0; i < ImputNUmbers.length; i++ ) {
			if (ImputNUmbers[i] % 2 == 0) {
				EvenNumbers.add(ImputNUmbers[i]);
			}else{
				OddNumbers.add(ImputNUmbers[i]);
			}
		}
		System.out.print("奇数");
		System.out.println(OddNumbers);
		System.out.print("偶数");
		System.out.println(EvenNumbers);
	}

}
