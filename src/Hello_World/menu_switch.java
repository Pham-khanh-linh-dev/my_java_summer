package Hello_World;

import java.util.Scanner;

public class menu_switch {
	public static void main(String[] agrs) {
		int option;
		String[] options = new String[10];
		options[0] = "1: Tinh phuong trinh bac nhat";
		options[1] = "2: Tinh phuong trinh bac hai";
		options[2] = "3: Tinh dien tich hinh chu nhat";
		options[3] = "4: Ket thuc";

		System.out.println(
				"///////Menu///////:" + "\n" + "1: Tinh phuong trinh bac 1" + "\n" + "2: Tinh phuong trinh bac 2" + "\n"
						+ "3: Tinh dien tich " + "\n" + "4: ket thuc" + "\n" + "Select the option");
		Scanner sc = new Scanner(System.in);
		option = sc.nextInt();
		sc.close();
		for (int i = 0; i < options.length; i++) {
			if (options[i] != null) {
				System.out.println(options[i]);
			} else {
				break;
			}
		}
		switch (option) {
		case 1:
			System.out.println(options[0]);
			break;
		case 2:
			System.out.println(options[1]);
			break;
		case 3:
			System.out.println(options[2]);
			break;
		default:
			break;

		}

	}

}
