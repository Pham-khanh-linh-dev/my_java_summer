package oop;

public class Student {
	private String id;
	private String name;
	public int age;
	public String gender;

	public String get_id() {
		return this.id;
	}

	public String get_name() {
		return this.name;
	}

	public void set_name(String name) {
		this.name = name;
	}

	public Student(String id, String name, int age, String gender) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String toString() {
		return "ID: " + this.id + ", Name: " + this.name + ", age: " + this.age + ", gender: " + this.gender;
	}
}
