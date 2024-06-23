package Lab;

import java.util.ArrayList;

import oop.Student;

public class Lab06_02 {
//	public static ArrayList<Student> search_name(Student[] a, String name) {
//		ArrayList<Student> student_match = new ArrayList<Student>();
//
//		for (Student tmp : a) {
//			StringBuilder st_tenlot = new StringBuilder();
//			String[] tenlots = tmp.get_name().split(" ");
////			if(tmp.)
//		}
//		return student_match;
//	}
	public static ArrayList<Student> searchByMiddleName(Student[] students, String middleName) {
		ArrayList<Student> matchingStudents = new ArrayList<Student>();
		for (Student student : students) {
			String[] nameParts = student.get_name().split(" ");
			if (nameParts.length > 2) { // Ensure there's a middle name
				StringBuilder middleNameBuilder = new StringBuilder();
				for (int i = 1; i < nameParts.length - 1; i++) {
					middleNameBuilder.append(nameParts[i]).append(" ");
				}
				String studentMiddleName = middleNameBuilder.toString().trim();
				System.out.println(studentMiddleName);
				if (studentMiddleName.equals(middleName)) {
					matchingStudents.add(student);
				}
			}
		}
		return matchingStudents;
	}

	public static void main(String[] agrs) {
		Student[] st = { new Student("01", "Pham Khanh Linh", 10, "Male"),
				new Student("02", "Le Van UUUUUU Kinh", 10, "Male"),
				new Student("03", "Pham Le Thanh Minh", 10, "Male"), new Student("04", "Phan Khan Tinh", 10, "Male"),
				new Student("05", "Khanh Thi SU Sinh", 10, "Male") };
//		ArrayList<Student> student_match = new ArrayList<Student>();
//		for (Student tmp : st) {
//			StringBuilder st_tenlot = new StringBuilder();
//			String[] hoten = tmp.get_name().split(" ");
//			for (String a : hoten) {
//				System.out.println(a);
//				if (hoten.length > 2) {
//					for (int i = 1; i < hoten.length - 1; i++) {
//						st_tenlot.append(hoten[i]);
//					}
//				}
//			}
//			
//			System.out.println(st_tenlot);
//			break;
////			
//		}
//		System.out.println(search_name(st, "Khanh"));
		// Tìm các học sinh có tên lót là "Khanh"
		ArrayList<Student> result = searchByMiddleName(st, "Khanh");
		for (Student student : result) {
			System.out.println(student);
		}
	}
}
