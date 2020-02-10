package orientation;

public class Main {
	public static void main(final String[] args) {

		System.out.println("インスタンスを生成していない状態");

		System.out.println(Person.wallet);

		Person hoge01 = new Person(1000);

		System.out.println("インスタンスhoge01でwalletにアクセス");

		System.out.println(Person.wallet);

		Person hoge02 = new Person(2000);

		System.out.println("インスタンスhoge02でwalletにアクセス");

		System.out.println(Person.wallet);

		System.out.println("クラスParsonでwalletにアクセス");

		System.out.println(Person.wallet);

	}

}
