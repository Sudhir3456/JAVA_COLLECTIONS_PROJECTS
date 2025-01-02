package comparator_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		List<Employ> l1 = new ArrayList<>();
		l1.add(new Employ("raju", 456, 57567.67));
		Employ e1 = new Employ("mohan", 231, 35346.56);
		Employ e2 = new Employ("sohan", 207, 30346.56);
		Employ e3 = new Employ("rohan", 201, 35346.56);
		Employ e4 = new Employ("john", 331, 35946.56);
		Employ e5 = new Employ("jack", 211, 45346.56);
		Employ e6 = new Employ("mac", 281, 35346.56);
		Employ e7 = new Employ("peter", 291, 35306.56);
		Employ e8 = new Employ("manmohan", 531, 38536.56);
		Employ e9 = new Employ("harimohan", 251, 30340.56);
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		l1.add(e4);
		l1.add(e5);
		l1.add(e6);
		l1.add(e7);
		l1.add(e8);
		l1.add(e9);
		System.out.println("=====All Employees are Below=====");
		for (Employ p : l1)
			System.out.println(p);
		Collections.sort(l1, new NameComparatorLowToHigh());
		System.out.println("=====Sorted Employees on name in ascending order are Below=====");
		for (Employ p : l1)
			System.out.println(p);
		Collections.sort(l1, new NameComparatorHighToLow());
		System.out.println("=====Sorted Employees on name in descending order are Below=====");
		for (Employ p : l1)
			System.out.println(p);
		Collections.sort(l1, new IDComparator());
		System.out.println("=====Sorted Employees on ID are Below=====");
		for (Employ p : l1)
			System.out.println(p);
		Collections.sort(l1, new SalaryComparator());
		System.out.println("=====Sorted Employees on Salary are Below=====");
		for (Employ p : l1)
			System.out.println(p);
	}
}