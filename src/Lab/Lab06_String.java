package Lab;

import java.util.Scanner;

public class Lab06_String {
	public static void main(String[] agrs) {
		String input = new String();
		String username;
		String password;
		System.out.println("Nhap vao username va password");
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();

		String[] tmp = input.split(" ");
		username = tmp[0];
		password = tmp[1];

		if (username.equals("Linh") && password.length() > 6) {
			System.out.println(username.toString() + password.toString());
		}
	}
}
