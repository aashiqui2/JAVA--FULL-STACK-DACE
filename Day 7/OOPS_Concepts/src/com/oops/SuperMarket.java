package com.oops;

public class SuperMarket {
	//fields,instance variable,member variable
	int price;
	int quantity;
	String productName;
	
	static String name="D-MART"; //static variable
	
	//constructor
	//no return type
	//no arg constructor
	SuperMarket(){
		System.out.println("Welcome to market");
	}
	
	//argument passed constructor
	/*SuperMarket(String pn,int p,int q)
	{
		productName=pn;
		price=p;
		quantity=q;
	}*/
	
	SuperMarket(String productName,int price,int quantity)
	{
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
	}

	public static void main(String[] args) {
//		SuperMarket product1=new SuperMarket();
//		product1.productName="Rice";
//		product1.price=50;
//		product1.quantity=1;
//		
//		SuperMarket product2= new SuperMarket();
//		product2.productName="Chocolate";
//		product2.price=10;
//		product2.quantity=5;
		
		SuperMarket product3= new SuperMarket("Biscuits",10,2);
		System.out.println(product3.productName);
		System.out.println(product3.price);
		//System.out.println(productName);error
		System.out.println(name);
	}

}
