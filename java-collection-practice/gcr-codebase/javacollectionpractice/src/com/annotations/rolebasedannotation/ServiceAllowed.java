package com.annotations.rolebasedannotation;

public class ServiceAllowed {
	@RoleAllowed("Admin")
	public  void  deleteUser() {
		System.out.println("User deleted ");
	}
	@RoleAllowed("User")
	public void viewProfile() {
		System.out.println("profile viewed");
	}
}
