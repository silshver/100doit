package PlatformLoggingAPI;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

/**
 * ���ϸ�	 	: PlatformLgging API
 * ����		: �ڹٿ��� ���� Log��� API �����Դϴ�. �ٸ� ������ �ҷ��ͼ� ���� ��Ű�� Error�� Info Level�� �ҷ��ͼ� �α׸� ���ܺ��ҽ��ϴ�.
 * @author 100doit
 *
 */

public class MainApp {
 
	private static Logger LOGGER1 = System.getLogger("MyLogger");
	
	private static Logger LOGGER2 = System.getLogger("MyNewLogger");
	
	private static Logger LOGGER3 = System.getLogger("MyLoggerFinder");
 
	public static void main(String[] args) {
		LOGGER1.log(Level.ERROR, "This is just an Error Log test.");
		LOGGER1.log(Level.INFO, "Hello World!");
		
		LOGGER2.log(Level.ERROR, "This is just an Error Log test.");
		LOGGER2.log(Level.INFO, "Hello World!");
		
		LOGGER3.log(Level.ERROR, "This is just an Error Log test.");
		LOGGER3.log(Level.INFO, "Hello World");
	}
}

/*
 * ��� ��
4�� 26, 2018 3:10:12 ���� PlatformLoggingAPI.MainApp main
�ɰ�: This is just an Error Log test.
4�� 26, 2018 3:10:12 ���� PlatformLoggingAPI.MainApp main
����: Hello World!
4�� 26, 2018 3:10:12 ���� PlatformLoggingAPI.MainApp main
�ɰ�: This is just an Error Log test.
4�� 26, 2018 3:10:12 ���� PlatformLoggingAPI.MainApp main
����: Hello World!
4�� 26, 2018 3:10:12 ���� PlatformLoggingAPI.MainApp main
�ɰ�: This is just an Error Log test.
4�� 26, 2018 3:10:12 ���� PlatformLoggingAPI.MainApp main
����: Hello World
 */