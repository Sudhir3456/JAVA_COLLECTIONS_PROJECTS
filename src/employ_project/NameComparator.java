package employ_project;

import java.util.Comparator;

public class NameComparator implements Comparator<Employ> {

	public int compare(Employ x, Employ y) {
		return x.name.compareTo(y.name);
	}
}