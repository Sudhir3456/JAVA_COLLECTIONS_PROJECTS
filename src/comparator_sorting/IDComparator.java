 package comparator_sorting;
import java.util.*;
public class IDComparator implements Comparator<Employ>{
	
	public int compare(Employ x, Employ y) {
	return y.id-x.id;
	}
}