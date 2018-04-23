package UsingStringsinSwitch;

import trade.trade;

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
		// impl goes here
	}

	private void executeTrade(trade t) {
		// impl goes here
	}

	private void newTrade(trade t) {
		// impl goes here
	}

	public static void main(String[] args) {

	}

}
