package OOP_Inheritance;

public class Student_cokhi extends Student {

	private int mon;

	public Student_cokhi(int mon, String id, String name, int price) {
		super(id, name, price);
		this.mon = mon;
	}

	public String get_info() {
		return "mon: " + this.mon + super.get_info();

	}
	public int hocphi() {
		return this.mon* this.price;
	}
}
