package Lab04;

import java.util.Scanner;

public class Product {
	public String name;
	public double price;
	public double tax;

	public void setInformation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of product:");
		this.name = sc.nextLine();

		System.out.println("Enter the price of product:");
		this.price = sc.nextDouble();

		System.out.println("Enter the tax of product:");
		this.tax = sc.nextDouble();
	}

	public void getInformation() {
		System.out.println(this.name + "\n" + this.price + "\n" + this.tax);
	}

	public double getTaxPrice() {
		return this.price * this.tax;
	}
}
