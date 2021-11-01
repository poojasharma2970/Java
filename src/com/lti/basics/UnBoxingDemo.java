package com.lti.basics;

public class UnBoxingDemo {

	public static void main(String[] args) {
		Integer i =10;
		int a = i.intValue();
		int a1= i;
		
		System.out.println("Wrapper class Object " +i);
		System.out.println("Datatype " +a);
		System.out.println("Datatype" +a1);

		
	}

}
