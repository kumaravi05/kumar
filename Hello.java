package com.kumar;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hello hello = new Hello();
		System.out.println("Hello Avinash");
		hello.callJavaProc(args[0]);
	}

	
	public String callJavaProc(String param){
		
		System.out.println("Hello " + param);
		return "Hello " + param ;
	}
}
