package variable;

public class task3 {

	public static void main(String[] args) {
		int intNum = 219;
		long b = intNum;

		double doubleNum = 364.2;
		float d = (float) doubleNum;

		long longNum = 123456L;
		double f = longNum;

		System.out.println("変換前");
		System.out.println(intNum);
		System.out.println(doubleNum);
		System.out.println(longNum);
		System.out.println("変換後");
		System.out.println(b);
		System.out.println(d);
		System.out.println(f);

	}

}
