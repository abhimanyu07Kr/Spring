package spring_01_test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_01_beans.Car;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("NewFile.xml");
		Car car=context.getBean(Car.class);
		car.drive();
	}

}
