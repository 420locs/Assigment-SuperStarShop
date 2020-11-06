package entity;

/**
 *
 * @author Ninh
 */
public class Product {
	private String id;
	private String name;
	private String brand;
	private double price;
	private int unitsInStock;
	private int orderLevel;
	private int view;
	private double discount;
	private String description;
	private String picture;

	public Product() {
	}

	public Product(String id, String name, String brand, double price, int unitsInStock, int orderLevel, int view, double discount, String description, String picture) {
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.unitsInStock = unitsInStock;
		this.orderLevel = orderLevel;
		this.view = view;
		this.discount = discount;
		this.description = description;
		this.picture = picture;
	}

	

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}
	
	public int getOrderLevel() {
		return orderLevel;
	}

	public int getView() {
		return view;
	}	

	public double getDiscount() {
		return discount;
	}

	public String getPicture() {
		return picture;
	}

	public String getDescription() {
		return description;
	}
	public String getState(){
		return discount > 0 ? "sale" : "new";
	}
	public String getPriceOut(){
		String priceFormatted = (int) (price - price*discount/100)+"";
		StringBuilder formater = new StringBuilder(priceFormatted);
		formater = formater.reverse();
		int insertPointIncreased = 0;
		for(int i = 3; i < formater.length()-1; i+=3){
			formater.insert(i + insertPointIncreased++, '.');
		}
		priceFormatted = formater.reverse().toString() +" VND";
		return priceFormatted;
	}
	
	public String getPriceOutNotSaleOff(){
		String priceFormatted = (int) (price)+"";
		StringBuilder formater = new StringBuilder(priceFormatted);
		formater = formater.reverse();
		int insertPointIncreased = 0;
		for(int i = 3; i < formater.length()-1; i+=3){
			formater.insert(i + insertPointIncreased++, '.');
		}
		priceFormatted = formater.reverse().toString() +" VND";
		return priceFormatted;
	}

	@Override
	public String toString() {
		return brand + " " + name; //To change body of generated methods, choose Tools | Templates.
	}
	
}
