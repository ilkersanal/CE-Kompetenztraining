package at.jku.ce;

public class DomainObject {

private String uuid;

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

	public String getUuid() {
		return id;
	}

}
