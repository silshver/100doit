package Lambda;

/**
 * ���ϸ�	 	: ���ٽ��� �������� ǥ��
 * ����		: ������ ���ٽ��� �������� ǥ����Ŀ� ���� �����Դϴ�.
 * @author 100doit
 *
 */


public class OriginalNoLambda {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello World.");
			}
		}).start();
	}
}
