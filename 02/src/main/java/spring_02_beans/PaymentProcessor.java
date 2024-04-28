package spring_02_beans;

public class PaymentProcessor {
	private IPyment payment;
	
	public void setPayment(IPyment payment)
		{
		this.payment=payment;
		System.out.println("injecting setter injection ");
	}
	public PaymentProcessor() {
		System.out.println("paymentprocessor::constructor");
	}
	public void processPayment(double amt)
	{
		boolean dd=payment.pay(amt);
		if (dd) {
			System.out.println("payment sucssesful......rs-"+amt);
		}else
			System.out.println("payment failed...");
	}

}
