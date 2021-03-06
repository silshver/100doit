package PlatformLoggingAPI;

import java.lang.System.Logger;
import java.util.ResourceBundle;

import static java.text.MessageFormat.format;

public class MyNewLogger implements Logger {

	@Override
	public String getName() {
		return "MyNewLogger";
	}

	@Override
	public boolean isLoggable(Level level) {
		switch (level) {
		case OFF:
		case TRACE:
		case DEBUG:
		case INFO:
		case WARNING:
		case ERROR:
		case ALL:
		default:
			return true;
		}
	}

	@Override
	public void log(Level level, ResourceBundle bundle, String msg, Throwable thrown) {
		System.out.printf("Log from MyNewLogger [%s]: %s - %s%n", level, msg, thrown);
	}

	@Override
	public void log(Level level, ResourceBundle bundle, String format, Object... params) {
		System.out.printf("Log from MyNewLogger [%s]: %s%n", level, format(format, params));
	}

}