package model;

public class Category {

	private String name;
	private String spec;
	
	public Category(){}

	public Category(String name, String spec) {
		super();
		this.name = name;
		this.spec = spec;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}
	
	
}
