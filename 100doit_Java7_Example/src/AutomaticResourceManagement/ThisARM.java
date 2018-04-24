package AutomaticResourceManagement;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ���ϸ�	 	: Auto Resource Manage (�ڵ� ���ҽ� ����) 
 * ����		: �ڵ����� ���ҽ��� �����ϴ� �Ϳ� ���Ͽ� �ڹ� 7�� �� �� ������ ��.
 * @author 100doit
 *
 */

public class ThisARM {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileOutputStream fos = new FileOutputStream("movies.txt");
				DataOutputStream dos = new DataOutputStream(fos)) {
			dos.writeUTF("Java 7 Block Buster!!!!!!!!!!!");					// �ڹ�7������ ���ҽ��� �ڵ����� �ݾ��༭ ���� �������� �ʿ䰡 ����.
		} catch (IOException e) {
			System.out.println("IOException !!!!!! Java7");
		}
	}
}
