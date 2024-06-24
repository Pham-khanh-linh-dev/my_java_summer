package Lab;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab05 {
	public static double total_value(ArrayList<Double> a) {
		double total = 0;
		for (double tmp : a) {
			total += tmp;
		}
		return total;
	}
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so luong phan tu cua ArrayList");
		int al1_size = sc.nextInt();
		ArrayList<Double> al1 = new ArrayList<Double>();
		double element;
		for (int i = 0; i < al1_size; i++) {
			element = sc.nextDouble();
			al1.add(element);
		}
		System.out.printf("Tong gia tri phan tu trong arraylist la: %f", total_value(al1));
	}
}
