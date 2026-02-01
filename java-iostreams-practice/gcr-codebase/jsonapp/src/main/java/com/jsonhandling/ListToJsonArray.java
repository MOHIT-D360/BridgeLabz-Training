package com.jsonhandling;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

class Cars{
	private String brand;
	private String model;
	private int price;
	
	public Cars() {};
	
	public Cars(String brand,String model,int price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	public String getBrand() {return brand;};
	public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }
}

public class ListToJsonArray {
	public static void main(String[] args) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			
			List<Cars> car = new ArrayList<>();
			car.add(new Cars("Tesla", "Model 3", 4500000));
			car.add(new Cars("BMW", "X5", 6500000));
			car.add(new Cars("Audi", "A6", 5500000));
			
			String jsonArray = mapper.writeValueAsString(car);
			System.out.println(jsonArray);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
