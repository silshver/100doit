package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Date;
import java.text.*;


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
		   		
		   	}

	}

}
