package IO_Stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BuffereReader_io {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\DELL\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\Hello_World\\src\\IO_Stream\\input.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\DELL\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\Hello_World\\src\\IO_Stream\\text.txt"));
			String line;
			
			while((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
			}
			br.close();
			bw.close();
		} catch (Exception e) {
			System.out.println("Erro");
		}

	}
}
