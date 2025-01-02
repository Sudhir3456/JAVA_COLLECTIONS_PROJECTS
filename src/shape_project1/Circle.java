package shape_project1;

public class Circle extends TwoDShape {
	double r;

	Circle() {

	}

	Circle(double r) {
		this.r = r;
	}

	@Override
	public void getArea() {
		System.out.println("Area Of Circle is: " + 3.14 * r * r + "Sq. Unit");

	}

	@Override
	public void getPerimeter() {
		System.out.println("Perimeter of Circle is: " + 2 * 3.14 * r + " Unit");

	}

}