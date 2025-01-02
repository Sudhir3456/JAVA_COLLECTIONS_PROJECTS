package employ_project;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployManager {

	public static void getAllEmploy(List<Employ> l) {
		for (Employ p : l)
			System.out.println(p);
	}

	public static void SortEmployOnName(List<Employ> l) {
		Collections.sort(l, new NameComparator());
		for (Employ p : l)
			System.out.println(p);
	}

	public static void accessOnId(List<Employ> l) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID: ");
		int id = sc.nextInt();
		System.out.println("====All employyes having ID>" + id + "======");
		for (Employ p : l) {
			if (p.id > id)
				System.out.println(p);
		}
	}

}