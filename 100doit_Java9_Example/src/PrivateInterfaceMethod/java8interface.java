package PrivateInterfaceMethod;

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