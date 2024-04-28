package spring_01_beans;

public class DieselEng implements IEngine {
	public DieselEng() {
		System.out.println("Dieselengine::contructor");
	}

	@Override
	public boolean start() {
		System.out.println("Diesel engine starting......");
		return true;
	}

}
