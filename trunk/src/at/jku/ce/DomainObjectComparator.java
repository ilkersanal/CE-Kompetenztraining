package at.jku.ce;

import java.util.Comparator;

public class Domain ObjectComparator implements Comparator<DomainObject> {

	public int compare (DomainObject o1, DomainObject o2) {
		return o1.getName().compareTO(o2.getName());
	}
}
	