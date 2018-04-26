package PlatformLoggingAPI;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

/**
 * 파일명	 	: PlatformLgging API
 * 설명		: 자바에서 나온 Log찍는 API 예제입니다. 다른 파일을 불러와서 실행 시키고 Error와 Info Level을 불러와서 로그를 남겨보았습니다.
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
 * 결과 값
4월 26, 2018 3:10:12 오후 PlatformLoggingAPI.MainApp main
심각: This is just an Error Log test.
4월 26, 2018 3:10:12 오후 PlatformLoggingAPI.MainApp main
정보: Hello World!
4월 26, 2018 3:10:12 오후 PlatformLoggingAPI.MainApp main
심각: This is just an Error Log test.
4월 26, 2018 3:10:12 오후 PlatformLoggingAPI.MainApp main
정보: Hello World!
4월 26, 2018 3:10:12 오후 PlatformLoggingAPI.MainApp main
심각: This is just an Error Log test.
4월 26, 2018 3:10:12 오후 PlatformLoggingAPI.MainApp main
정보: Hello World
 */