 package shape_project;

public class Driver {
	public static void main(String[] args) {
		TwoDShape t1=new Circle();
		ThreeDShape t2=new Cylinder();
		
		t1.rotate();
		t1.getArea();
		System.out.println("===========");
		t2.rotate();
		t2.getVolume();
	}

}