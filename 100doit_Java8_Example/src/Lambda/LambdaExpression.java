package Lambda;

/**
 * ���ϸ�	 	: ���ٽ�  ����.
 * ����		: ���ٽ��� ����� �����Դϴ�. Interface Runable�� ��� �޼ҵ�� void���� �ް�, Run()���� void���� �޾� �����Ͽ���, ���ٽ����� ����ȭ �� �����Դϴ�. 
 * @author 100doit
 *
 */


public class LambdaExpression {
	public static void main(String[] args) {
		new Thread(()->{
			System.out.println("Hello World.");
		}).start();
	}
}
