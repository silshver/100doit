package PlatformLoggingAPI;

import java.lang.System.Logger;
import java.lang.System.LoggerFinder;
 
public class MyLoggerFinder extends LoggerFinder {
 
	@Override
	public Logger getLogger(String name, Module module) {
		if (name.equals("MyNewLogger"))
			return new MyNewLogger();
		else
			return new MyLogger();
	}
}