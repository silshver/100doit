package try_with_resources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 파일명	 	: Java9의 Try with Resource
 * 설명		: Java9에서는 밖에서 선언을 한 후에 try문에 곧바로 받아서 쓸 수 있어서 간편하고, 여러 개의 try문을 작성 할 때에도 계속 선언 할 필요가 없이 받아 쓸 수 있습니다.
 * @author 100doit
 *
 */


public class Java9resource {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("C://readfile/input.txt"));
		
		try (br) {
			String line;
			while (null != (line = br.readLine())) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
