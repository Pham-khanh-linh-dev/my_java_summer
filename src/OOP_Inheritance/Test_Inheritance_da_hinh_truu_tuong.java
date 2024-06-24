package OOP_Inheritance;

public class Test_Inheritance_da_hinh_truu_tuong {
	public static void main(String[] agrs) {
//		Sử dụng tính đa hình:
//			Khi báo bên trái là lớp cha thay vì lớp con nhưng kết quả vẫn là lớp con
		Student st_it = new Student_IT(2, "it1", "Linh", 3000);
		System.out.println(st_it.hocphi());

	}
}
