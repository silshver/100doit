package Lambda;

/**
 * ���ϸ�	 	: ���ٽ��� �������� ǥ��
 * ����		: ������ ���ٽ��� ���� ���� ǥ����Ŀ� ���� �����Դϴ�.
 * @author 100doit
 *
 */


public class OriginalNoLambda {
	public static void main(String[] args) {
		new Thread(new Runnable() {							// void�� �޴� Runnable()
			@Override
			public void run() {								// void�� �޴� run()
				System.out.println("Hello World.");
			}
		}).start();
	}
}

/*
 * ���
Hello World.
 */
