package spring_02_beans;

public class DebitCardPayment implements IPyment {
	public DebitCardPayment() {
		System.out.println("DebitCard::constructor");
	}

	@Override
	public boolean pay(double amt) {
		System.out.println("payment processing........");
		return true;
	}

}
