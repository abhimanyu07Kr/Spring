package spring_03_beans;

public class Veg implements RestoCat {
	public Veg() {
		System.out.println("veg::constructor");
	}

	@Override
	public void cat() {
		System.out.println("this is veg section");

	}

}
