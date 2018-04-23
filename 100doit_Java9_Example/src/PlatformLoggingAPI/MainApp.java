package PlatformLoggingAPI;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
 
public class MainApp {
 
	private static Logger LOGGER1 = System.getLogger("MyLogger");
	
	private static Logger LOGGER2 = System.getLogger("MyNewLogger");
 
	public static void main(String[] args) {
		LOGGER1.log(Level.ERROR, "This is just an Error Log test.");
		LOGGER1.log(Level.INFO, "Hello World!");
		
		LOGGER2.log(Level.ERROR, "This is just an Error Log test.");
		LOGGER2.log(Level.INFO, "Hello World!");
	}
}