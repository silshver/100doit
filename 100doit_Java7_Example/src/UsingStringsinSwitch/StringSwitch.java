package UsingStringsinSwitch;


public class StringSwitch {
	private static final String PENDING = "PENDING";
	private static final String EXECUTE = "EXECUTE";
	private static final String NEW = "NEW";

	public void processTrade(trade t) {
		String status = t.getStatus();

		switch (status) {
		case NEW:
			newTrade(t);
			break;
		case EXECUTE:
			executeTrade(t);
			break;
		case PENDING:
			pendingTrade(t);
			break;

		default:
			break;
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

	}

}
