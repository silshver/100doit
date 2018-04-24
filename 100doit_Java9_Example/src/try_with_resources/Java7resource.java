package try_with_resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 파일명	 	: Java7의 Try with Resource 
 * 설명		: Java7의 경우 BufferedReader 선언을 Try문 안에서 선언을 하여야 했습니다. 또는 밖에서 선언을 해도 try문에서는 다른 값에 대입하여 사용하는 번거로움이 있었습니다.
 * @author 100doit
 *
 */


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
