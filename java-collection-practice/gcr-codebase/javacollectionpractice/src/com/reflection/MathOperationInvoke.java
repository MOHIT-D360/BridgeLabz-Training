package com.reflection;
import java.util.*;
import java.lang.reflect.Method;

class MathOperations {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}


public class MathOperationInvoke {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			
			MathOperations obj = new MathOperations();
			Class<?> cls = obj.getClass();
			
			System.out.println("Enter method name ");
			String methodName = sc.next();
			
			
			System.out.println("Enter first number :");
			int num1 = sc.nextInt();
			
			System.out.println("Enter second number :");
			int num2  = sc.nextInt();
			
			Method method = cls .getMethod(methodName,int.class,int.class);
			
			Object result = method.invoke(obj,num1,num2);
			
			System.out.println("Result : "+ result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
