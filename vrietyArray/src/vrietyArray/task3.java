package vrietyArray;

import java.util.HashMap;

public class task3 {

	public static void main(String[] args) {
		HashMap<String, Integer> nameprice = new HashMap<>();
		nameprice.put("りんご",130);
		nameprice.put("みかん",120);
		nameprice.put("バナナ",98);
		nameprice.put("メロン",6000);
		for (HashMap.Entry<String, Integer> name : nameprice.entrySet()) {
			System.out.print(name.getKey());
			System.out.print(":");
			System.out.print(name.getValue());
			System.out.println("円");
		}
	}

}
