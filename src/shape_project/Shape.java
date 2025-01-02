package shape_project;

public interface Shape {

	default void test() {
		System.out.println("test method");
	}

	private void start() {
		System.out.println();
	}

	public static void demo() {
		System.out.println("demo method");
	}

	public void rotate();

}