package com.example.reflection;

public class BaseClass {

	public int count = 1;

	public void function2(int a) {
		System.out.println("*******Checking function2*****");
	}

	public static void function3(int a, String b) {

		System.out.println("*******Checking function3*****");
	}
	
	public class InnerBaseClass{
		
	}
	
	public enum BaseEnumerator{
		
	}
}
