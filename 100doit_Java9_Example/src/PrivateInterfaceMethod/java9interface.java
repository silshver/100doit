package PrivateInterfaceMethod;

public class java9interface {
	public interface ICustomerService {
		 
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
}
