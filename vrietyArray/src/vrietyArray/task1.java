package vrietyArray;

import java.util.ArrayList;

public class task1 {

	public static void main(String[] args) {
		ArrayList<String> PlaceName = new ArrayList<>();
		PlaceName.add("北海道");
		PlaceName.add("東北");
		PlaceName.add("関東");
		PlaceName.add("中部");
		PlaceName.add("近畿");
		PlaceName.add("中国");
		PlaceName.add("九州");
		
		for(String Name : PlaceName) {
			System.out.println(Name);
		}
		

	}

}
