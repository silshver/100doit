package ProcessAPI;

import java.util.stream.Stream;
import java.lang.ProcessHandle;
import java.lang.ProcessHandle.Info;

/**
 * ���ϸ�	 	: Process API
 * ����		: ���� �������� Process �� ���� �ִ� API�Դϴ�. �������� ���� ���� ���α׷��� Ȯ���ϰų�, �������α׷� ���� ���������� Ȯ���� �� ����� �� ���� �Ŷ�� �����մϴ�.
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
 * ��� �� : �̷� �������� �������� ���μ������� ����Ѵ�.
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