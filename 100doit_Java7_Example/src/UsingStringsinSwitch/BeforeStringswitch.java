package UsingStringsinSwitch;

import trade.trade;

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

	private void newTrade(trade t) {
		//impl goes here
	}

	private void executeTrade(trade t) {
		//impl goes here
	}

	private void pendingTrade(trade t) {
		//impl goes here
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
