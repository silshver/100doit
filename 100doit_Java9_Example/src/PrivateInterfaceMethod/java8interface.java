package PrivateInterfaceMethod;


/**
 * ���ϸ�	 	: Java8�� Interface method
 * ����		: Java8���� �߰��� default method�� ���� �����Դϴ�. default method�� ������ ������ �޼ҵ�� �ڹ�8���� ���� �߰��� method �Դϴ�.
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
 * ��� ��
null registers for customer service.
-- get HealthCare Service.
null registers for customer service.
-- get Consultation Service.
 */