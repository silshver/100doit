package UsingStringsinSwitch;


/**
 * ���ϸ�	 	: String with Switch
 * ����		: Switch ���� String �ڷ����� ����ϴ� �����Դϴ�.
 * @author 100doit
 *
 */

public class StringSwitch {
	private static final String PENDING = "PENDING";
	private static final String EXECUTE = "EXECUTE";
	private static final String NEW = "NEW";

	public static void processTrade(trade t) {
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
		trade t = new trade();
		processTrade(t);
	}

}
