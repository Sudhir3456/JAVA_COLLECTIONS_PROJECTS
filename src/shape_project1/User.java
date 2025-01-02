package shape_project1;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Game g = new Game();
		char c;
		do {
			int choice = g.selectShape();
			switch (choice) {
			case 1:
				System.out.println("You have Selected 2D Shape");
				TwoDShape twod = g.selectTwoDShape();
				twod.getArea();
				twod.getPerimeter();
				break;

			case 2:
				System.out.println("You have Selected 3D Shape");
				ThreeDShape threed = g.selectThreeDShape();
				threed.getVolume();
				threed.getLateralSurfcaeArea();
				threed.getTotalSurfaceArea();
				break;
			}
			System.out.println("ENter Y/y to Restart the Game...");
			c = sc.next().charAt(0);
		} while (c == 'Y' || c == 'y');
		System.out.println("=====Thank You! Game Ends!!====");
	}

}