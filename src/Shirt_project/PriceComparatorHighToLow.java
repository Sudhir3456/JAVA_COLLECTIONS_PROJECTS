package Shirt_project;

import java.util.Comparator;

public class PriceComparatorHighToLow implements Comparator<Shirt> {

	public int compare(Shirt s1, Shirt s2) {
		if (s1.price == s2.price)
			return s1.brand.compareToIgnoreCase(s2.brand);
		return (int) (s2.price - s1.price);
	}

}
