package ProcessAPI;

import java.util.stream.Stream;
import java.lang.ProcessHandle;
import java.lang.ProcessHandle.Info;

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
