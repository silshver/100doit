package Lambda;

/**
 * 파일명	 	: 람다식  예제.
 * 설명		: 람다식을 사용한 예제입니다. Interface Runable의 모든 메소드는 void값을 받고, Run()또한 void값을 받아 생략하여서, 람다식으로 간소화 한 예제입니다. 
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
