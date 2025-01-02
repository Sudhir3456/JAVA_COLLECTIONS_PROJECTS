package shape_project1;

import java.util.Scanner;

public class Game {
	Game() {
		System.out.println("Welcome TO Game");
	}

	public int selectShape() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for ==>2D Shape");
		System.out.println("Press 2 for ==>3D Shape");
		int option = sc.nextInt();
		if (option == 1 || option == 2)
			return option;
		else {
			System.out.println("Invalid Option");
			return selectShape();
		}
	}

	public TwoDShape selectTwoDShape() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 ==>For Circle");
		System.out.println("Press 2 ==>For Rectangle");
		System.out.println("Press 3 ==>For Square");
		System.out.println("Press 4 ==>For Triangle");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("You have selected Circle");
			System.out.println("ENter the Radius: ");
			double radius = sc.nextDouble();
			Circle c1 = new Circle(radius);
			return c1;
		case 2:
			System.out.println("You have selected Rectangle");
			System.out.println("ENter the length: ");
			double l = sc.nextDouble();
			System.out.println("ENter the width: ");
			double w = sc.nextDouble();
			return new Rectangle(l, w);
		case 3:
			System.out.println("You have selected Square");
			System.out.println("ENter the side: ");
			double side = sc.nextDouble();
			return new Square(side);
		default:
			System.out.println("Invalid Choice!");
			return selectTwoDShape();
		}

	}

	public ThreeDShape selectThreeDShape() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 ==>For Cylinder");
		System.out.println("Press 2 ==>For Sphere");
		System.out.println("Press 3 ==>For Hemisphere");
		System.out.println("Press 4 ==>For Cone");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("You have selected Clinder");
			System.out.println("ENter the Radius: ");
			double radius = sc.nextDouble();
			System.out.println("ENter the height: ");
			double height = sc.nextDouble();
			return new Cylinder(radius, height);
		default:
			System.out.println("Invalid Choice!");
			return selectThreeDShape();
		}
	}

}
