package spring_02_test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_02_beans.PaymentProcessor;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("NewFile.Xml");
		PaymentProcessor pp=context.getBean(PaymentProcessor.class);
		Scanner sc=new Scanner(System.in);
		System.out.println("=========================");
		System.out.println("enter the amount ");
		double amt=sc.nextDouble();
		pp.processPayment(amt);
		sc.close();
	}

}
