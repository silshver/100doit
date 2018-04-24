package UsingStringsinSwitch;

public class BeforeStringswitch {
	private void processTrade(trade t) {
		String status = t.getStatus();

		if (status.equalsIgnoreCase("NEW")) {
			newTrade(t);
		} else if (status.equalsIgnoreCase("EXECUTED")) {
			executeTrade(t);
		} else if (status.equalsIgnoreCase("PENDING")) {
			pendingTrade(t);
		}
	}

	private void pendingTrade(trade t) {
		System.out.println("This is the Pending Trade");
	}

	private void executeTrade(trade t) {
		System.out.println("This is the Execute Trade");
	}

	private void newTrade(trade t) {
		System.out.println("This is the New Trade");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}


}
