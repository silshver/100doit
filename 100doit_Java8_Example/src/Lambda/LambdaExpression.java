package Lambda;

public class LambdaExpression {
	public static void main(String[] args) {
		new Thread(()->{
			System.out.println("Hello World.");
		}).start();
	}
}
