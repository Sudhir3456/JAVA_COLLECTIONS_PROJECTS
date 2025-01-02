 package Shirt_project;

import java.util.Comparator;

public class PriceComparatorLowToHigh implements Comparator<Shirt>{
	
	public int compare(Shirt s1, Shirt s2) {
		if(s1.price==s2.price)
			return s1.size-s2.size;
	return (int)(s1.price-s2.price);
	}

}
