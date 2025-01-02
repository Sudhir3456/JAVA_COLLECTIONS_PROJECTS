package shape_project1;

public class Square extends TwoDShape {
	double side;

	Square() {
	}

	Square(double side) {
		this.side = side;
	}

	@Override
	public void getArea() {
		System.out.println("Area of Square is: " + side * side + " Sq. Unit");

	}

	@Override
	public void getPerimeter() {
		System.out.println("Perimeter of Square is: " + 4 * side + " Unit");

	}

}