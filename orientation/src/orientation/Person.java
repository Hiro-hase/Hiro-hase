package orientation;

public class Person {
	private String name;

	private int age;

	static public int wallet = 0 ;

    public Person(int wallet) {

    	Person.wallet += wallet;
    }

	public Person(String name, int age) {

		this.name = name;

		this.age = age;

	}

	 public void displayMyProfile() {

	        System.out.println("私の名前は" + this.name + "です。");

	        System.out.println("年齢は" + this.age + "才です。");

	        System.out.println("よろしくお願いします！");

	 }

	 public String getName() {

	        return this.name;

	 }

	 public void setName(String name) {

		 this.name = name;

	 }

	 public int getAge() {

		 return this.age;

	 }

	 public void setAge(int age) {

		 this.age = age;
	 }

}
