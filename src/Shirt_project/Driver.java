package Shirt_project;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Service manager = new Service();
		Shirt s1 = new Shirt("Blackberry", 40, 2300.5, "White");
		manager.addShirt(s1);
		manager.addShirt(new Shirt("Peter england", 36, 1800.3, "blue"));
		manager.addShirt(new Shirt("Van Heusen", 42, 3200.3, "black"));
		manager.addShirt(new Shirt("H&M       ", 40, 2400.3, "white"));
		manager.addShirt(new Shirt("BlackBerry", 40, 1800.3, "blue"));
		manager.addShirt(new Shirt("Van Heusen", 42, 3200.3, "black"));
		manager.addShirt(new Shirt("Arrow      ", 40, 2400.3, "white"));
		manager.addShirt(new Shirt("BlackBerry", 38, 1800.3, "blue"));
		manager.addShirt(new Shirt("Van Heusen", 42, 3200.3, "black"));
		manager.addShirt(new Shirt("BlackBerry", 40, 2400.3, "white"));
		System.out.println("======AllShirts are Below=======");
		manager.getAllShirts();

		System.out.println("======Accesss Shirts by Brand=====");
		System.out.println("Enter the Brand: ");
		String brand = sc.nextLine();
		manager.getShirtOfBrand(brand);
		System.out.println("=======Sorting on Low to High Price====");
		manager.sortLowToHigh();
		System.out.println("=======Sorting on High to Low Price====");
		manager.sortHighToLow();
		System.out.println("======get All Brands======");
		manager.getAllBrands();

		System.out.println("======get All Brands COunt======");
		manager.getAllBrandsCount();

	}

}