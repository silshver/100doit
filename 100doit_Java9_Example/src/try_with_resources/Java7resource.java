package try_with_resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Java7resource {
	public static void main(String[] args) {
		
		try (BufferedReader br = new BufferedReader(new FileReader("C://readfile/input.txt"))) {
			String line;
			while (null != (line = br.readLine())) {
				System.out.println(line);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
