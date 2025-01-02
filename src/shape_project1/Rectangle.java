package shape_project1;

public class Rectangle extends TwoDShape {
	double l;
	double w;

	Rectangle() {

	}

	Rectangle(double l, double w) {
		this.l = l;
		this.w = w;
	}

	@Override
	public void getArea() {
		System.out.println("Area of Rectangle is: " + l * w + " Sq. Unit");

	}

	@Override
	public void getPerimeter() {
		System.out.println("Perimeter of Rectangle is: " + 2 * (l + w) + " Unit");

	}

}