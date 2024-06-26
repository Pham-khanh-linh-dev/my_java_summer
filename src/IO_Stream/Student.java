package IO_Stream;

import java.io.Serializable;

public class Student implements Serializable {
	public String name;
	public int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [, name=" + name + ", age=" + age + "]";
	}
	
	
}
