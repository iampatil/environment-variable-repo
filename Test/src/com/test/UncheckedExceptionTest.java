package com.test;

public class UncheckedExceptionTest {

	public static void main(String[] args) {
		String s = "s";
		if(s.equals("s")) {
			System.out.println("s is equal");
		} else {
			System.out.println("s is not equal");
		}
		
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		String s3 = new String("abc");
		String s4 = new String("abc");
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
	}

}
