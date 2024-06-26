package IO_Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInput_Stream {
	public static void main(String[] args) {
		Student st = new Student("Linh", 20);
//		GHi đối tượng vào file
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\DELL\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\Hello_World\\src\\IO_Stream\\input.txt"))) {
			oos.writeObject(st);
			System.out.println("thanh cong");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
//		Đọc đối tượng từ file
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\DELL\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\Hello_World\\src\\IO_Stream\\input.txt"))){
			Student st_in_file = (Student) ois.readObject();
			System.out.println(st_in_file.toString());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
