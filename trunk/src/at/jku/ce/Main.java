package at.jku.ce;

public class Main {

	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Set<DomainObject> objectSet = new HashSet<DomainObject>();

			objectSet.add(DomainFactory.createDomainObject("Helga", "Mutter"));
			objectSet.add(DomainFactory.createDomainObject("Walter", "Vater"));
			objectSet.add(DomainFactory.createDomainObject("Hannah", "Tochter"));
			objectSet.add(DomainFactory.createDomainObject("Paul", "Sohn"));
			objectSet.add(DomainFactory.createDomainObject("Claudia", "Tochter2"));

		for (DomainObject domainObject : objectSet) {
			LOGGER.debug(domainObject.getUuid);
		} 
	}

}
