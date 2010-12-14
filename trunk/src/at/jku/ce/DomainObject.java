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

	public void setComment(String comment){
			this.comment = comment;
		}



	public String id = UUID.randomUUID().toString()
}
