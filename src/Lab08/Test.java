package Lab08;

public class Test {
	public static void main(String[] args) {
		Student st1 = new Student("123", "linh", 10, 5);
		System.out.println(st1);
		
		st1.setGrade();
		System.out.println(st1);

		Person p1 = new Person("123", "eric", 26);
		System.out.println(p1);

	}
}

