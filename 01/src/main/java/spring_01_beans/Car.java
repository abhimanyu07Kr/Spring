package spring_01_beans;

public class Car {
	private IEngine eng;

	public void setEng(IEngine eng) {
		this.eng = eng;
		System.out.println("injecting setter injection");
	}
	
	public Car() {
		System.out.println("Car::contructor");
	}
	
	public void drive()
	{
		boolean b1=eng.start();
		if (b1) {
			System.out.println("engine started.....");
		}else
			System.out.println("fault in ngine....");
	}

}
