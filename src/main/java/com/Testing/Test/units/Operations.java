package com.Testing.Test.units;

public class Operations {
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public int sub(int a,int b) {
		return a-b;
	}
	
	public int prod(int a,int b) {
		return a*b;
	}
	
	public int div(int a,int b) {
		if(b==0) {
			throw new ArithmeticException("Infinity trap");
		}
		return a/b;
	}
	
}