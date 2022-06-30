package model;

public class JavaBeans {
	
	private String id;
	private String name;
	private String fone;
	private String email;
	
	public JavaBeans() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public JavaBeans(String id, String name, String fone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.fone = fone;
		this.email = email;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
