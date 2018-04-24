package AutomaticResourceManagement;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 파일명	 	: Auto Resource Manage (자동 리소스 관리) 
 * 설명		: 자동으로 리소스를 관리하는 것에 대하여 자바 7과 그 전 버전을 비교.
 * @author 100doit
 *
 */

public class ThisARM {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileOutputStream fos = new FileOutputStream("movies.txt");
				DataOutputStream dos = new DataOutputStream(fos)) {
			dos.writeUTF("Java 7 Block Buster!!!!!!!!!!!");					// 자바7에서는 리소스를 자동으로 닫아줘서 따로 관리해줄 필요가 없다.
		} catch (IOException e) {
			System.out.println("IOException !!!!!! Java7");
		}
	}
}
