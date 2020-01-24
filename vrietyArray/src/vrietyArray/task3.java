package vrietyArray;

import java.util.HashMap;

public class task3 {

	public static void main(String[] args) {
		HashMap<String, Integer> NamePrice = new HashMap<>();
		NamePrice.put("りんご",130);
		NamePrice.put("みかん",120);
		NamePrice.put("バナナ",98);
		NamePrice.put("メロン",6000);
		for (HashMap.Entry<String, Integer> Name : NamePrice.entrySet()) {
			System.out.print(Name.getKey());
			System.out.print(":");
			System.out.print(Name.getValue());
			System.out.println("円");
		}
	}

}
