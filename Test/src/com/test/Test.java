package com.test;

public class Test implements FuncInterface {

	public static void main(String[] args) {
		
		FuncInterface fi = () -> {
			System.out.println("m1");
		};
		
//		FuncInterface fi = new FuncInterface() {
//			
//			@Override
//			public void m5() {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void m1() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		
		fi.m1();
		fi.m2();
		FuncInterface.m3();
		
		Test test = new Test();
		test.m2();
	}

	@Override
	public void m1() {
		
	}
}
