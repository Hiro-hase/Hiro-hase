package standardClass;

public class task3 {

	public static void main(String[] args) {
		String Str = "文字列:ABCDEFG";
		System.out.println("文字列:" + Str);
		for(int i = Str.length() -1; i >= 0; i--) {
			System.out.print(Str.charAt(i));
		}

	}

}
