 package comparator_sorting;
import java.util.*;
public class NameComparatorLowToHigh implements Comparator<Employ>{
	
	public int compare(Employ x, Employ y) {
	return x.name.compareTo(y.name);
	}

}