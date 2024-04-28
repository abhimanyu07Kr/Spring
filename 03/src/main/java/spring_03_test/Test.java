package spring_03_test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_03_beans.Resto;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("NewFile.xml");
		Resto resto=context.getBean(Resto.class);
		
	}

}
