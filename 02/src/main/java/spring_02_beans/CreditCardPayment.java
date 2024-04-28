package spring_02_beans;

public class CreditCardPayment implements IPyment {
	public CreditCardPayment() {
		System.out.println("CreditCard::constructor...");
	}

	@Override
	public boolean pay(double amt) {
		System.out.println("payment processing.......");
		return true;
	}

}
