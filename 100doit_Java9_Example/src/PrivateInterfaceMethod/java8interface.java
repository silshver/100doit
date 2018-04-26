package PrivateInterfaceMethod;


/**
 * 파일명	 	: Java8의 Interface method
 * 설명		: Java8에서 추가된 default method의 대한 예제입니다. default method는 구현이 가능한 메소드로 자바8에서 새로 추가된 method 입니다.
 * @author 100doit
 *
 */


interface j8interface {	 
		default void healthcare(String name) {
			System.out.println(name + " registers for customer service.");
			System.out.println("-- get HealthCare Service.");
		}
	 
		default void consult(String name) {
			System.out.println(name + " registers for customer service.");
			System.out.println("-- get Consultation Service.");
		}
}

class inter8 implements j8interface{
	
	@Override
	public void healthcare(String name) {
		System.out.println(name + " registers for customer service.");
		System.out.println("-- get HealthCare Service.");
	}
	
	@Override
	public void consult(String name) {
		System.out.println(name + " registers for customer service.");
		System.out.println("-- get Consultation Service.");
	}
	
}

public class java8interface {
	public static void main (String[] args) {
		new inter8().healthcare(null);
		new inter8().consult(null);		
	}
	
}

/*
 * 결과 값
null registers for customer service.
-- get HealthCare Service.
null registers for customer service.
-- get Consultation Service.
 */