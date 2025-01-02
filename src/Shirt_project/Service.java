package Shirt_project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Service {
	private List<Shirt> l1 = new ArrayList<>();

	public void addShirt(Shirt s) {
		l1.add(s);
	}

	public void getAllShirts() {
		for (Shirt s : l1)
			System.out.println(s);
	}

	public void getShirtOfBrand(String brand) {
		for (Shirt s : l1) {
			if (s.brand.equalsIgnoreCase(brand))
				System.out.println(s);
		}

	}

	public void getShirtOnBrandAndSize(String brand, int size) {
		for (Shirt s : l1) {
			if (s.brand.equalsIgnoreCase(brand) && s.size == size)
				System.out.println(s);
		}
	}

	public void sortLowToHigh() {
		Collections.sort(l1, new PriceComparatorLowToHigh());
		for (Shirt s : l1)
			System.out.println(s);
	}

	public void sortHighToLow() {
		Collections.sort(l1, new PriceComparatorHighToLow());
		for (Shirt s : l1)
			System.out.println(s);
	}

	public void getAllBrands() {
		Set<String> s1 = new HashSet<>();
		for (Shirt s : l1)
			s1.add(s.brand.toLowerCase());
		for (String brand : s1)
			System.out.println(brand);
	}

	public void getAllBrandsCount() {
		Map<String, Integer> m1 = new HashMap<>();
		for (Shirt s : l1) {
			String br = s.brand.toLowerCase();
			if (m1.containsKey(br))
				m1.put(br, m1.get(br) + 1);
			else
				m1.put(br, 1);
		}
		Set<Map.Entry<String, Integer>> ent = m1.entrySet();
		for (Map.Entry<String, Integer> p : ent)
			System.out.println(p.getKey() + "==> " + p.getValue());
	}

}
