package try_with_resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * ���ϸ�	 	: Java7�� Try with Resource 
 * ����		: Java7�� ��� BufferedReader ������ Try�� �ȿ��� ������ �Ͽ��� �߽��ϴ�. �Ǵ� �ۿ��� ������ �ص� try�������� �ٸ� ���� �����Ͽ� ����ϴ� ���ŷο��� �־����ϴ�.
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
