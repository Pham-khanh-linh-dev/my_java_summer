package Lab04;

import java.util.Scanner;

public class Product {
	public String name;
	public double price;
	public double tax;

	public Product(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

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

	public String toString() {
		return "Product{name='" + name + "', price=" + price + "}";
	}

	public static void main(String[] agrs) {
		Product pd = new Product("Nam", 2.3, 4.5);
		System.out.println(pd);

	}
}
