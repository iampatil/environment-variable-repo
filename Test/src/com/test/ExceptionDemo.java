package com.test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try {
			int n = 0;
			int result = 10 / n;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
