package vrietyArray;

import java.util.ArrayList;
import java.util.HashMap;

public class task4 {

	public static void main(String[] args) {
		int[] ImputNumbers = {21,3,32,6,99,72,78,51,1,26,87,11,48,60,29,5,46,74,14,193,215,83};
		ArrayList<Integer> OddNumbers = new ArrayList<>();
		ArrayList<Integer> EvenNumbers = new ArrayList<>();
		HashMap<String, ArrayList<Integer>> NewNumbers = new HashMap<>();
		for (int i = 0; i < ImputNumbers.length; i++ ) {
			if (ImputNumbers[i] % 2 == 0) {
				EvenNumbers.add(ImputNumbers[i]);
			}else{
				OddNumbers.add(ImputNumbers[i]);
			}
		}
		NewNumbers.put("偶数" , EvenNumbers);
		NewNumbers.put("奇数" , OddNumbers);
		System.out.print(NewNumbers);
	}

}
