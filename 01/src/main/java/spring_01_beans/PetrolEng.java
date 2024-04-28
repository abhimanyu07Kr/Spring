package spring_01_beans;

public class PetrolEng implements IEngine {
	public PetrolEng() {
		System.out.println("petrolengine::contructor");
	}

	@Override
	public boolean start() {
		System.out.println("Petrol engine starting......");
		return false;
	}

}
