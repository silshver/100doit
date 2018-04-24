package AutomaticResourceManagement;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 파일명	 	: before java7 Resource Manage (자동 리소스 관리) 
 * 설명		: 자동으로 리소스를 관리하는 것에 대하여 자바 7과 그 전 버전을 비교합니다.
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
				fos.close();		// 자바7 이전에서는 스트림을 시작한 것을 닫아줘야 한다.
				dos.close();
			} catch (IOException e) {
				System.out.println("IOException before 7");
			}
		}
	}
}
