package employ_project;

public class Employ {
	String name;
	int id;
	double salary;

	Employ() {

	}

	Employ(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String toString() {
		return "Name: " + name + "\tId: " + id + "\tSalary: " + salary;
	}

}