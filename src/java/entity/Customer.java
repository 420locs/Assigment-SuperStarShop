package entity;

/**
 *
 * @author Ninh
 */

public class Customer {
	private String id;
	private String name;
	private String username;
	private String password;
	private String address;
	private String city;
	private String phone;
	private String email;
	private String picture;

	public Customer() {
	}

	public Customer(String id, String name, String username, String password, String address, String city, String phone, String email, String picture) {
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.address = address;
		this.city = city;
		this.phone = phone;
		this.email = email;
		this.picture = picture;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getPicture() {
		return picture;
	}

	@Override
	public String toString() {
		return name; //To change body of generated methods, choose Tools | Templates.
	}
	
	
}
