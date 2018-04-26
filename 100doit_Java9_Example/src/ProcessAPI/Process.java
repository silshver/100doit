package ProcessAPI;

import java.util.stream.Stream;
import java.lang.ProcessHandle;
import java.lang.ProcessHandle.Info;

/**
 * 파일명	 	: Process API
 * 설명		: 현재 실행중인 Process 를 찍어볼수 있는 API입니다. 서버에서 실행 중인 프로그램을 확인하거나, 보안프로그램 등이 실행중인지 확인할 때 사용할 수 있을 거라고 생각합니다.
 * @author 100doit
 *
 */


public class Process {

	private static void printInfo (ProcessHandle processHandle) {
		System.out.println("---------");
		System.out.println("Id: " + processHandle.pid());
		System.out.println("isAlive(): " + processHandle.isAlive());
		System.out.println("number of childrens: " + processHandle.children().count());
		System.out.println("isSupportsNormalTermination(): " + processHandle.supportsNormalTermination());
 
		ProcessHandle.Info processInfo = processHandle.info();
		System.out.println("Info: " + processInfo.toString());
		System.out.println("Info arguments().isPresent(): " + processInfo.arguments().isPresent());
		System.out.println("Info command().isPresent(): " + processInfo.command().isPresent());
		System.out.println("Info totalCpuDuration().isPresent(): " + processInfo.totalCpuDuration().isPresent());
		System.out.println("Info user().isPresent(): " + processInfo.user().isPresent());
	}

	public static void main (String[] args) {
		Stream<ProcessHandle> processStream = ProcessHandle.allProcesses();
		processStream.forEach(process -> printInfo(process));
	}
	
}

/*
 * 결과 값 : 이런 형식으로 실행중인 프로세스들을 출력한다.
---------
Id: 13904
isAlive(): true
number of childrens: 0
isSupportsNormalTermination(): false
Info: [user: Optional[DESKTOP-E159PP3\100doit], cmd: C:\Program Files\Java\jre-10.0.1\bin\javaw.exe, startTime: Optional[2018-04-26T06:00:48.987Z], totalTime: Optional[PT1.265625S]]
Info arguments().isPresent(): false
Info command().isPresent(): true
Info totalCpuDuration().isPresent(): true
Info user().isPresent(): true
 */