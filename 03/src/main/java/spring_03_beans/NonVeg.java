package spring_03_beans;

public class NonVeg implements RestoCat {
	public NonVeg() {
		System.out.println("NonVeg::constructor");
	}

	@Override
	public void cat() {
		System.out.println("this is nonveg section");

	}

}
