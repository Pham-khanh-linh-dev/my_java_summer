package Hello_World;

import java.util.Arrays;
import java.util.Scanner;

public class baitap01 {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a:");
		int a = sc.nextInt();
//		System.out.println("Nhap b:");
//		int b = sc.nextInt();
//		System.out.println("Nhap c:");
//		int c = sc.nextInt();
		sc.close();

		String[] hobby = { "game", "music", "anime" };
		System.out.println("my hobby: " + Arrays.toString(hobby));
	}
}
