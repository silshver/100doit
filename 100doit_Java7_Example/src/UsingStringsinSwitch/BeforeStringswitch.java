package UsingStringsinSwitch;

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
