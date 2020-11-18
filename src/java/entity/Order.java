package entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ninh
 */
public class Order {
	private int id;
	private int customerId;
	private String orderedDate;
	private String address;
	private String city;
	private String phone;
	private String email;
	private String note;
	private double totalValue;
//	List<ProductInCart> list = new ArrayList<>();

	public Order() {
	}

	public Order(int id, int customerId, String orderedDate, String address, String city, String phone, String email, String note, double totalValue) {
		this.id = id;
		this.customerId = customerId;
		this.orderedDate = orderedDate;
		this.address = address;
		this.city = city;
		this.phone = phone;
		this.email = email;
		this.note = note;
		this.totalValue = totalValue;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getOrderedDate() {
		return orderedDate;
	}

	public void setOrderedDate(String orderedDate) {
		this.orderedDate = orderedDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

//	public List<ProductInCart> getList() {
//		return list;
//	}

//	public void setList(List<ProductInCart> list) {
//		this.list = list;
//	}

	@Override
	public String toString() {
		return "#"+id+" Ngày "+orderedDate+" Đến " +address+" tại "+city+" Tổng tiền: " +totalValue+" Note: " +note; //To change body of generated methods, choose Tools | Templates.
	}
	
	
	
}
