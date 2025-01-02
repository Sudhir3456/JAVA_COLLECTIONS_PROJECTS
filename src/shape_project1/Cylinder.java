package shape_project1;

public class Cylinder extends ThreeDShape {
	double r;
	double h;

	Cylinder() {

	}

	Cylinder(double r, double h) {
		this.r = r;
		this.h = h;
	}

	@Override
	public void getVolume() {
		System.out.println("Cylinder Volume is: " + 3.14 * r * r * h + " Cube Unit");

	}

	@Override
	public void getLateralSurfcaeArea() {
		System.out.println("Cylinder LSA is: " + 2 * 3.14 * r * h + " Sq. Unit");

	}

	@Override
	public void getTotalSurfaceArea() {
		System.out.println("Cylinder TSA is: " + 2 * 3.14 * r * (h + r) + " Sq. Unit");

	}

}