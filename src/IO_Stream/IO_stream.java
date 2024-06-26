package IO_Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IO_stream {
	public static void main(String[] args) {
		
		try {
			int data;
			FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\Hello_World\\src\\IO_Stream\\input.txt");
			FileOutputStream fos = new FileOutputStream("C:\\Users\\DELL\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\Hello_World\\src\\IO_Stream\\text.txt");
			while((data = fis.read()) != -1) {
				System.out.print((char) data);
				fos.write(data);
			}
			fis.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

