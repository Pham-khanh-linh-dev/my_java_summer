package oop.oop01;

public class CanBo {

	protected String name;
	protected int age;
	protected String gender;
	protected String address;
	
	public CanBo(String name, int age, String gender, String address) {
		this.name = name;
		this.age= age;
		this.gender = gender;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "CanBo [toString()=" + super.toString() + "]";
	}

}
