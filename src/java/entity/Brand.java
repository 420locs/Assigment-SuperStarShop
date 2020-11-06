package entity;

/**
 *
 * @author Ninh
 */
public class Brand {
	private String id;
	private String name;

	public Brand() {
	}

	public Brand(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name; //To change body of generated methods, choose Tools | Templates.
	}
	
	public String getNameOut(){
		return name.isEmpty() ? "Hãng Khác" : name;
	}
	
}
