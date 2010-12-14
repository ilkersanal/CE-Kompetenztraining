package at.jku.ce;

public class DomainObject {

private String uuid;

private String name;

private String comment;


	public DomainObject() {
		super();
	}
	/** 
	* Default Constructor
	*/
	
	public DomainObject(String name, String comment, String id){
	
		super();
		this.name = name;
		this.comment = comment;
		this.id = id;
	}

	public String getUuid() {
		return id;
	}

	public String getComment(){
			return comment;
	}

	public void setComment(final String comment){
			this.comment = comment;
	}

	public String getName(){
			return name;
	}

	public String setName(final String name){
			this.name = name;
	}

	public String toString() {
		return "DomainObject [name=" + name + ", comment=" + comment + ", uuid=" + uuid + "]";

	public boolean equals (Object obj) {
		if (!(obj instanceof DomainObj)) {
			return false;
		}
		DomainObject domainObj = (DomainObject) obj;
		return uuid.equals(domainObj.getUuid());
	}

	public int hashCode() {
		if (uuid != null) {
		return uuid.hashCode();
		} else {
			return super.hashCode();
		}
	}

	public String id = UUID.randomUUID().toString()
}
