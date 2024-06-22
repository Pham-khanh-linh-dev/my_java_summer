package Hello_World;

import java.util.Scanner;

public class baitap03 {
	public static void main(String[] agrs) {
		System.out.println("Nhap vao so nguyen:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean signal = false;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				signal = true;
				break;
			}
		}
		if (signal == true) {
			System.out.println("Day la so nguyen to");
		} else {
			System.out.println("Day khong phai la so nguyen to");
		}
		int[] array_a = new int[a];

	}
}
