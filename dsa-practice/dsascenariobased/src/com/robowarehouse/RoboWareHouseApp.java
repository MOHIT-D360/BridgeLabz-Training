package com.robowarehouse;

public class RoboWareHouseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Package[] p = new Package[5];
		
		p[0] = new Package(34,"chips");
		p[1] = new Package(12,"toffee");
		p[2] = new Package(19,"shampoo");
		p[3] = new Package(10,"ceiling fan");
		p[4] = new Package(44,"Cooler");
		
		Sort.insertionSort(p);
		
		for(int i=0;i<p.length;i++) {
			p[i].display();
			System.out.println("-----------------------");
		}
	}

}
