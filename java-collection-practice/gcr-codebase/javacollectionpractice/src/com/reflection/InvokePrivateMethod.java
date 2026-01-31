package com.reflection;
import java.lang.reflect.*;

class Calculator{
	private int multiply(int a ,int b) {
		return a*b;
	}
}

public class InvokePrivateMethod {
	public static void main(String[] args) {
		try {
			Calculator calc = new Calculator();
			
			Class <?> cls = calc.getClass();
			
			Method method= cls.getDeclaredMethod("multiply", int.class,int.class);
			
			method.setAccessible(true);
			
			Object result = method.invoke(calc, 4,5);
			
			System.out.println("Result :"+ result);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
