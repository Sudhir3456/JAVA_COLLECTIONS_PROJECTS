package employ_project;

import java.util.Comparator;

public class IDComparator implements Comparator<Employ> {

	public int compare(Employ x, Employ y) {
		return y.id - x.id;
	}

}