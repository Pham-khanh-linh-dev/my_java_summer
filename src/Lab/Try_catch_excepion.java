package Lab;

import java.util.Scanner;

public class Try_catch_excepion {
	public static void main(String[] args) {
		int a; 
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("a = ");
			
			try {
				a = sc.nextInt();
				System.out.printf("gia tri 10 / a= %d", 10/a);
				break;
			} catch (Exception e) {
				System.out.println("Loi roi, Nhap lai: ");
				sc.nextLine();
			}
			
			
			
		}
		
		
		
	}
}
