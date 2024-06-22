package Hello_World;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Helloworld {
	public static void main(String[] args) throws IOException {
		float a = (float) 5.1;
		double b = 4.2342;
		double c = a + b;
		System.out.printf("Ket qua cua %.2f + %.2f la: %.3f", a, b, c);
		System.out.print("print output");
		System.out.println("print + '/n'");

//Nhap gia tri tu ban phim
//		Sử dụng Scanner:
//			step 1: Import java.util.Scanner và Khoi tao doi tuong Scanner;
		Scanner scanner = new Scanner(System.in);

//			stap 2: Dung cac phuong thuc cuar Scanner:
		System.out.println("Nhập môt số nguyên:");
		int songuyen_a = scanner.nextInt();

//			System.out.println("Nhập môt chuỗi:");
//			String name = scanner.nextLine();
//			System.out.println("Nhập môt số thực:");
//			double sothuc_a = scanner.nextDouble();
//			scanner.close();
//		Sự dụng buffereReader và InputStreamReader: phức tạp hơn Scanner nhưng hiệu quả cao vì nhanh hơn, có tránh ngoại lệ, kiểm oats đầu vào
//			step 1: Import java.io.BufferedReader và InputStreamReader, khởi tạo đối tượng buffereReader:
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//			step 2: 
		System.out.println("Nhập môt số nguyên:");
		int songuyen_b = Integer.parseInt(reader.readLine());

//			System.out.println("Nhập môt chuỗi:");
//			String str = reader.readLine();
//			System.out.println("Nhập môt số thực:");
//			double sothuc_b = Double.parseDouble(reader.readLine());

//Các hàm toán học: https://www.w3schools.com/java/java_ref_math.asp
//		int max_a = Math.max(songuyen_a, songuyen_b);
//		System.out.printf("Gia tri max la: %d", max_a);

//Switch 
//	switch(expression) {
//	   	case x:
//		// code block
//		break;
//		case y:
//		// code block
//		break;
//		default:
//		// code block
//	}

// Loop + continue:
//		double result;
//		for (int i = 0; i < a; i++) {
//			if (i == 3) {
//				continue;
//			}
//			System.out.printf("i = %d" + "\n", i);
//		}
//		5
//		i = 0
//		i = 1
//		i = 2
//		i = 4

//Array Giong c

//Kiểu dữ liệu
		// Kiểu dữ liệu nguyên thủy: primitive type: Bao gồm 8 loại
		// byte, short, int, long ( số nguyên);
		// float, double( số thực/ số thập phân);
		// char
		// boolean
		// Kiểu dữ liệu không nguyên thủy: non-primitive type(Kiểu dữ liệu tham chiếu):
		// String, Class, Interface, Array( gọi chung là Object); => viết hoa chữ cái
		// đầu tiên

//Cách chuyển đổi qua lại giữa các kiểu dữ liệu: Autoboxing/Unboxing ( Object wrapper class):
		// Dunggf object wrapper class để convert primitive type => non-primitive type;
		// boolean, byte, int , long, short, float, double => Boolean, Integer, Long,
		// Foat,... in hoa chữ đầu
		//
		// Tạo wrapper class:
		// Integer object = new Integer(1)
		// convert ngược lại:
		// int val = object.intValue();
		//
		// Boxing: quá trình convert từ primitive => non-primitive;
		// unBoxing: ngược lại

	}
}
