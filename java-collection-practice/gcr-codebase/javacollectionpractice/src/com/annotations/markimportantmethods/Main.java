package com.annotations.markimportantmethods;
import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) {
		
		MethodMarker mm = new MethodMarker();
		try {
//		
//		Method m1 = mm.getClass().getMethod("method1");
//		Method m2 = mm.getClass().getMethod("method2");
		
		Method [] m  = mm.getClass().getDeclaredMethods();
		
		
		for(Method method:m) {
			if(method.isAnnotationPresent(ImportantMethod.class)) {
				ImportantMethod im = method.getAnnotation(ImportantMethod.class);
				
				System.out.println(im.level());
			
			}
		}
		
		}
		catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}
}
