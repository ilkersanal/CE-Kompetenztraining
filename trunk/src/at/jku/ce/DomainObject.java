package at.jku.ce;

public class DomainObject {

public String id;

private String name;

	public DomainObject() {
		super();
	}
	/** 
	* Default Constructor
	*/
	
	public DomainObject(String id){
	
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public String id = UUID.randomUUID().toString()
}
