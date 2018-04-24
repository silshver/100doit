package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Date;
import java.text.*;

/**
 * 파일명	 	: Multi Catch
 * 설명		: 자바 7 이후에는 Multi Catch를 이용하여 하나의 Catch문으로 여러개의 Exception을 관리할 수 있습니다.
 * @author 100doit
 *
 */


public class multicatch7Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   	try {
		   		URL url = new URL("http://www.yoursimpledate.server/");
		   		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
		   		String line = reader.readLine();
		   		SimpleDateFormat format = new SimpleDateFormat("MM/DD/YY");
		   		Date date = format.parse(line);
		   	}
		   	catch(ParseException | IOException e) {
		   		// catch문 1개로 대체가능
		   		// can use just one catch.
		   	}

	}

}
