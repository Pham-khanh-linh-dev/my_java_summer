package OOP_Inheritance;
// Cần phải khai báo lớp abtract - trừu tượng để dử dụng
public abstract class Student {
	protected String id;
	protected String name;
	protected int price;

	public Student(String id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	// hàm abstract - trừu tượng, chỉ thành công khi có child class overriding nó
	abstract int hocphi();

	public void set_name(String name) {
		this.name = name;
	}

	public void set_price(int price) {
		this.price = price;
	}

	public String get_name() {
		return this.name;
	}

	public int get_price() {
		return this.price;
	}


	public String get_info() {
		return "id: " + this.id + ", name: " + this.name + ", price: " + this.price ;
	}

}
