package AutomaticResourceManagement;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ���ϸ�	 	: before java7 Resource Manage (�ڵ� ���ҽ� ����) 
 * ����		: �ڵ����� ���ҽ��� �����ϴ� �Ϳ� ���Ͽ� �ڹ� 7�� �� �� ������ ���մϴ�.
 * @author 100doit
 *
 */


public class Before7ARM {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream("movies.txt");
			dos = new DataOutputStream(fos);
			dos.writeUTF("Before Java 7 Block Buster");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();		// �ڹ�7 ���������� ��Ʈ���� ������ ���� �ݾ���� �Ѵ�.
				dos.close();
			} catch (IOException e) {
				System.out.println("IOException before 7");
			}
		}
	}
}
