package at.jku.ce;

public class Main {

	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Set<DomainObject> objectSet = new TreeSet<DomainObject>(new DomainObjectComparator());

		objectSet.add(new DomainObject("Helga", "Mutter"));
		objectSet.add(new DomainObject("Walter", "Vater"));
		objectSet.add(new DomainObject("Hannah", "Tochter"));
		objectSet.add(new DomainObject("Paul", "Sohn"));
		objectSet.add(new DomainObject("Claudia", "Baby"));

		for (DomainObject domainObject : objectSet) {
			LOGGER.debug(domainObject.getUuid());
			LOGGER.debug(domainObject.toString());
		}
	}

}
