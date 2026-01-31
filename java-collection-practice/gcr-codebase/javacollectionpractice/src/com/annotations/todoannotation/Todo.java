package com.annotations.todoannotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(METHOD)
public @interface Todo {
	String task() default "complete it before 3days";
	String assignedTo() default "Mohit";
	String priority() default "Medium";
}
