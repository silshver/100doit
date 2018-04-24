package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Date;
import java.text.*;

/**
 * 파일명	 	: 자바7 이전의 Catch 관리.
 * 설명		: 자바7 이전의 버전은 Catch문을 여러개를 써서 Exception을 관리 하였습니다.
 * @author 100doit
 *
 */

public class Before7Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   	try {
		   		URL url = new URL("http://www.yoursimpledate.server/");
		   		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
		   		String line = reader.readLine();
		   		SimpleDateFormat format = new SimpleDateFormat("MM/DD/YY");
		   		Date date = format.parse(line);
		   	}
		   	catch(ParseException pe) {
		   		
		   	}
		   	catch(IOException ioe) {
		   		// have to use several Exception. So use catches.
		   		// 여러개의 catch문 사용
		   	}
	}

}
