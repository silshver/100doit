package PrivateInterfaceMethod;

public class java8interface {
	public interface ICustomerService {
		 
		default void healthcare(String name) {
			System.out.println(name + " registers for customer service.");
			System.out.println("-- get HealthCare Service.");
		}
	 
		default void consult(String name) {
			System.out.println(name + " registers for customer service.");
			System.out.println("-- get Consultation Service.");
		}
	}
}
