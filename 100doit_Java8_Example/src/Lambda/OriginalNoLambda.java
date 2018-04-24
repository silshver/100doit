package Lambda;

/**
 * 파일명	 	: 람다식을 쓰기전의 표현
 * 설명		: 기존의 람다식을 쓰기전의 표현방식에 대한 예제입니다.
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
