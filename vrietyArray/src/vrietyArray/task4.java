package vrietyArray;

import java.util.ArrayList;
import java.util.HashMap;

public class task4 {

	public static void main(String[] args) {
		int[] numbers = {21,3,32,6,99,72,78,51,1,26,87,11,48,60,29,5,46,74,14,193,215,83};
		ArrayList<Integer> Oddnumber = new ArrayList<>();
		ArrayList<Integer> Evennumber = new ArrayList<>();
		HashMap<String, ArrayList<Integer>> newnumber = new HashMap<>();
		for (int i = 0; i < numbers.length; i++ ) {
			if (numbers[i] % 2 == 0) {
				Evennumber.add(numbers[i]);
			}else{
				Oddnumber.add(numbers[i]);
			}
		}
		newnumber.put("偶数" , Evennumber);
		newnumber.put("奇数" , Oddnumber);
		System.out.println(newnumber);
	}

}
