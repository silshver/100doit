package Lambda;

/**
 * 파일명	 	: 람다식을 쓰기전의 표현
 * 설명		: 기존의 람다식을 쓰기 전의 표현방식에 대한 예제입니다.
 * @author 100doit
 *
 */


public class OriginalNoLambda {
	public static void main(String[] args) {
		new Thread(new Runnable() {							// void를 받는 Runnable()
			@Override
			public void run() {								// void를 받는 run()
				System.out.println("Hello World.");
			}
		}).start();
	}
}

/*
 * 결과
Hello World.
 */
