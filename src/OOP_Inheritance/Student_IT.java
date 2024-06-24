package OOP_Inheritance;

public class Student_IT extends Student {
	private int tinchi;

	public Student_IT(int tinchi, String id, String name, int price) {
		super(id, name, price);
		this.tinchi = tinchi;
	}

	public String get_info() {
		return "tinchi: " + this.tinchi + super.get_info();

	}
	public int hocphi() {
		return this.tinchi * this.price;
	}
}


