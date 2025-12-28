package com.constructor.level1;

public class Circle {
	private double radius ;
	
	Circle(){
		radius = 7.0;
		
	}
	Circle(double radius){
		this.radius = radius;
		
	}
	public void showRadius() {
		System.out.println("Radius of circle : "+ radius);
	}
	public void areaCircle() {
		System.out.println("Area of cirle : "+ Math.PI*radius*radius);
	}
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(14.7);
		
		c1.areaCircle();
		c2.showRadius();

	}

}
