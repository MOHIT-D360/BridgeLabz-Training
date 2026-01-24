package com.swiftcar;



public class Cart  implements ICheckout{
	private  Product[] prd ;
	private double  total;
	private int count;
	private double tempPrice;
	private double tempDiscount ;
	
	Cart(){
		prd = new Product[100];
		this.total = 0;
		this.count =0;
		this.tempPrice =0;
		this.tempDiscount =0;
	}
	public void addProduct(Product prd) {
		this.prd[count++] = prd;
	}
	public void removeProduct(Product prd) {
        for (int i = 0; i < count; i++) {
            if (this.prd[i] == prd) {
                this.prd[i] = this.prd[count - 1];
                count--;
                System.out.println(prd.name + " dropped from cart" );
                return;
            }
        }
    }
	@Override
	public void generateBill() {
		for(int i=0;i<count;i++) {
			tempPrice = tempPrice + this.prd[i].price;
		}
		
		System.out.println("Your total Bill    :"+tempPrice);
	}
	
	
	public void applyDiscount() {
		for(int i=0;i<count;i++) {
		if(this.prd[i] instanceof PerishableProduct) {
			
			tempDiscount = tempDiscount +((this.prd[i].price)-(this.prd[i].price *0.20));
			
		}
		else {
			tempDiscount = tempDiscount + ((this.prd[i].price)-(this.prd[i].price *0.10));
		}
		
		}
		System.out.println("Total Bill after discount :"+ tempDiscount);
	}
	
	public void displayItem() {
		for(int i=0;i<count;i++) {
			this.prd[i].getProductDetails();
			System.out.println("__________________________");
		}
	}
}
