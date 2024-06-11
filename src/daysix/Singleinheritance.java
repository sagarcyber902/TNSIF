package daysix;

public class Singleinheritance {

	public static void main(String[] args) {
		Person p1 = new Person();
		// System.out.println(p1.toString());
		System.out.println(p1); // calling toString() method

		Person p2 = new Person("Sagar", 20);
		System.out.println(p2);

		Student st1 = new Student("Tejas", 20, 4);
		System.out.println(st1);

	}

}