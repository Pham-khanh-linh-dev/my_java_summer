package oop;

public class Student {
	private String id = "01";
	private String name;
	public int age;
	public String gender;

	public void get_id() {
		System.out.println(this.id);
	}

	public void get_name() {
		System.out.println(this.name);
	}

	public void set_name(String name) {
		this.name = name;
	}
}
