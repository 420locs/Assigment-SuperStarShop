package entity;

/**
 *
 * @author Ninh
 */
public class ProductInCart extends Product {
	private int quantity;
	private float size;

	public ProductInCart() {
	}

	public ProductInCart(int quantity, float size, String id, String name, String brand, double price, int unitsInStock, int orderLevel, int view, double discount, String description, String picture) {
		super(id, name, brand, price, unitsInStock, orderLevel, view, discount, description, picture);
		this.quantity = quantity;
		this.size = size;
	}

	public float getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
