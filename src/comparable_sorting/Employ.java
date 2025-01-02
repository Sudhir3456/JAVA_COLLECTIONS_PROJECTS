package comparable_sorting;

public class Employ implements Comparable<Employ> {
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

	/*
	 * public int compareTo(Employ e) {// to Sort on id return this.id-e.id; }
	 */
	/*
	 * public int compareTo(Employ e) {// to Sort on Salary
	 * if(this.salary==e.salary) return this.id-e.id; return
	 * (int)(this.salary-e.salary); }
	 */
	public int compareTo(Employ e) {// to Sort on name
		return this.name.compareTo(e.name);
	}

}
