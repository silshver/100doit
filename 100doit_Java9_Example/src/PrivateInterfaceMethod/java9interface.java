package PrivateInterfaceMethod;

/**
 * 파일명	 	: Java9의 interface method
 * 설명		: Java9에서 새로 추가된 private method에 대한 예제입니다. private method는 추상 메소드이면 안됩니다. 또한 상속이 불가능한 메소드입니다.
 * @author 100doit
 *
 */


interface j9interface {

		default void healthcare(String name) {
			register(name);
			System.out.println("-- get HealthCare Service.");
		}
	 
		default void consult(String name) {
			register(name);
			System.out.println("-- get Consultation Service.");
		}
	 
		private void register(String name) {
			System.out.println(name + " registers for customer service.");
		}
	
}


class inter9 implements j9interface{
	
	@Override
	public void healthcare(String name) {
		register(name);
		System.out.println("-- get HealthCare Service.");
	}
	
	@Override
	public void consult(String name) {
		register(name);
		System.out.println("-- get Consultation Service.");
	}
	/*
	 * can not Override private
	 */
	private void register(String name) {
		System.out.println(name + " registers for customer service.");
	} 
	
}

public class java9interface {
	public static void main (String[] args) {
		new inter9().healthcare(null);
		new inter9().consult(null);
	}
	
}
