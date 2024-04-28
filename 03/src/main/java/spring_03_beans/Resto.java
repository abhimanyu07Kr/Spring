package spring_03_beans;

public class Resto {
	private RestoCat reso;

	public void setReso(RestoCat reso) {
		this.reso = reso;
		System.out.println("injecting setter injection");
	}
	public Resto() {
		System.out.println("Resto::constructor");
	}
	

}
