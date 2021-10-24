package com.test;

public class CustomExceptionTest {

	public static void main(String[] args) {
		try {
			validate(17);
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}
	
	public static void validate(int age) throws CustomException {
		
		if(age > 18) {
			throw new CustomException("age is not valid to vote");
		} else {
			System.out.println("age is valid to vote");
		}
	}

}
