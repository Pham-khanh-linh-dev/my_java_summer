package ArrayList_test;

import java.util.ArrayList;

public class Test_ar {
	public static void main(String[] agrs) {
		ArrayList al1 = new ArrayList();
		al1.add("I");
		al1.add("am");

		al1.add("Pham");
		al1.add("Khanh");
		al1.add("Linh");
		al1.add("Linh");
		al1.add("Linh");
		al1.add("Linh");

		al1.add(1, "2003");

//		xoa phan tu 
		al1.remove(1);
		al1.remove("Linh");
//		al1.clear();

//		truy cap phan tu bang ham get(index)

//		thay doi phan tu bang ham set(index, E e)

//		Kiem tra gia tri co ton tai hay khong bang ham boolean contains(E e)
		for (Object i : al1) {
			System.out.println(i);
		}
//		al1.toArray();
		System.out.println(al1);
	}
}
