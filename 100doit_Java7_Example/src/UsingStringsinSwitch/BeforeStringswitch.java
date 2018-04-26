package UsingStringsinSwitch;

/**
 * 파일명	 	: if using String
 * 설명		: Java7 이전에는 String 자료형이 Switch문에서 사용이 불가능하여 if 문을 사용했습니다.
 * @author 100doit
 *
 */

public class BeforeStringswitch {
	
	public static void processTrade(trade t) {
		String status = t.getStatus();

		if (status.equalsIgnoreCase("NEW")) {
			newTrade(t);
		} else if (status.equalsIgnoreCase("EXECUTED")) {
			executeTrade(t);
		} else if (status.equalsIgnoreCase("PENDING")) {
			pendingTrade(t);
		}
	}
	private static void pendingTrade(trade t) {
		System.out.println("This is the Pending Trade");
	}

	private static void executeTrade(trade t) {
		System.out.println("This is the Execute Trade");
	}

	private static void newTrade(trade t) {
		System.out.println("This is the New Trade");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trade t = new trade();
		processTrade(t);
	}
}

/*
 * 결과값
This is the New Trade 
 */