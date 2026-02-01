package com.jsonhandling;
import com.fasterxml.jackson.databind.*;
 class Car{
	private String brand;
	private String model;
	private int price;
	
	public Car() {};
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
		
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price= price;
	}
}
public class JavaObjectToJsonFormat {
	public static void main(String[] args) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			
			Car car = new Car();
			car.setBrand("Tesla");
			car.setModel("Model 1");
			car.setPrice(5600000);
			
			String json = mapper.writeValueAsString(car);
			System.out.println(json);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
