package AutomaticResourceManagement;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ThisARM {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileOutputStream fos = new FileOutputStream("movies.txt");
				DataOutputStream dos = new DataOutputStream(fos)) {
			dos.writeUTF("Java 7 Block Buster");
		} catch (IOException e) {
			// log the exception
		}
	}
}
