 package comparator_sorting;
import java.util.*;
public class SalaryComparator implements Comparator<Employ>{
	
	public int compare(Employ x, Employ y) {
		if(x.salary==y.salary)
			return x.id-y.id;
	return (int)(x.salary-y.salary);
	}

}