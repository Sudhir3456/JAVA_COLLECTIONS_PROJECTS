 package Shirt_project;
public class Shirt {
	String brand;
	double price;
	int size;
	String color;
	Shirt(){
		
	}
	Shirt(String brand, int size,double price, String color){
		this.brand=brand;
		this.price=price;
		this.size=size;
		this.color=color;
	}
	public String toString() {
	return "Brand is: "+brand+"\tPrice is: "+price+"\tSize is: "+size+"\tColor is: "+color;
	}

}