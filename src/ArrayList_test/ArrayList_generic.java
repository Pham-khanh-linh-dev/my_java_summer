package ArrayList_test;

import java.util.ArrayList;

import Lab04.Product;

public class ArrayList_generic {
	public static void main(String[] agrs) {
		ArrayList al1 = new ArrayList();
		al1.add("This is a String");
		Product pd = new Product("Linh", 2.3, 2.5);
		al1.add(pd);
		for (Object obj1 : al1) {
			System.out.println(obj1);
		}
	}
}
