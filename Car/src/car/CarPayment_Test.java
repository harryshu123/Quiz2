package car;

//import static org.junit.Assert.*;

import org.junit.Test;

public class CarPayment_Test {

	@Test
	public void test() {
		CarPayment car1 = new CarPayment(35000,0.1,0,60);
		System.out.printf("the monthly payment is: %.3f", car1.Monthpay());
		System.out.println();
		System.out.printf("the total interest payment is: %.3f", car1.TotalInterest());
		System.out.println();
		CarPayment car2 = new CarPayment(36000,0.1,5000,70);
		System.out.printf("the monthly payment is: %.3f", car2.Monthpay());
		System.out.println();
		System.out.printf("the total interest payment is: %.3f", car2.TotalInterest());
	}

}
