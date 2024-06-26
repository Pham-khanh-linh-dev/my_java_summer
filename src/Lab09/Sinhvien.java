package Lab09;

public class Sinhvien {
	public String masv;
	public String hoten;
	public double diem;
	public int age;
	public String getMasv() {
		return masv;
	}
	
	public Sinhvien(String masv, String hoten, double diem, int age) {
		super();
		this.masv = masv;
		this.hoten = hoten;
		this.diem = diem;
		this.age = age;
	}

	public void setMasv(String masv) {
		this.masv = masv;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public double getDiem() {
		return diem;
	}
	public void setDiem(double diem) {
		this.diem = diem;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Sinhvien [masv=" + masv + ", hoten=" + hoten + ", diem=" + diem + ", age=" + age  + ", toString()=" + super.toString() + "]";
	}
	
	
}
