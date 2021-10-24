package com.test;

@FunctionalInterface
public interface FuncInterface {

	public void m1();
	
	default void m2() {
		System.out.println("m2");
	}
	
	static void m3() {
		System.out.println("m3");
	}
	
	default void m4() {
		System.out.println("m4");
	}
	
//	public void m5();
}
