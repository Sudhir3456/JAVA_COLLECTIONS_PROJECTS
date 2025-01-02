 package comparator_sorting;
import java.util.Comparator;

public class NameComparatorHighToLow implements Comparator<Employ>{
	
	public int compare(Employ x, Employ y) {
	return y.name.compareTo(x.name);
	}
}