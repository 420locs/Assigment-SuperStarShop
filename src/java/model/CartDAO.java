package model;

import entity.Product;
import entity.ProductInCart;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ninh
 */
public class CartDAO {

	DBContext dbc = new DBContext();

	public List<ProductInCart> getProductsInCart(String customerId) {
		List<ProductInCart> data = new ArrayList<>();
		String sql = "select * , b.name [brand_name] from Cart c inner join Products p on c.product_id = p.id inner join Brands b on b.id = p.brand_id where customer_id = ?";
		try {
			Connection con = dbc.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, customerId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String id = rs.getString("product_id");
				String name = rs.getString("name");
				String brand = rs.getString("brand_name");
				double price = rs.getDouble("price");
				int unitsInStock = rs.getInt("units_in_stock");
				int orderLevel = rs.getInt("order_level");
				int view = rs.getInt("view");
				double discount = rs.getDouble("discount");
				String description = rs.getString("description");
				String picture = rs.getString("picture");
				int quantity = rs.getInt("quantity");
				float size = rs.getFloat("size");
				ProductInCart p = new ProductInCart(quantity,size, id, name, brand, price, unitsInStock, orderLevel, view, discount, description, picture);
				data.add(p);
			}
		} catch (Exception e) {
			System.out.println("Bug in CartDAO");
			e.printStackTrace();
		}
		return data;
	}

	public double getTotal(List<ProductInCart> data) {
		double total = 0;
		for (ProductInCart p : data) {
			total += p.getQuantity() * p.getPrice();
		}
		return total;
	}

	public boolean addToCart(String customerId, String productId, float size, int quantity) {
		String sql = "insert into Cart values(?,?,?,?)";
		int r = 0;
		try {
			Connection con = dbc.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, customerId);
			ps.setString(2, productId);
			ps.setFloat(3, size);
			ps.setInt(4, quantity);
			r = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("Bug in CartDAO");
			e.printStackTrace();
		}
		return r != 0;
	}
	
	public boolean removeItem(String customerId, String productId, float size) {
		String sql = "delete from Cart where customer_id = ? and product_id = ? and size = ?";
		int r = 0;
		try {
			Connection con = dbc.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, customerId);
			ps.setString(2, productId);
			ps.setFloat(3, size);
			r = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("Bug in CartDAO");
			e.printStackTrace();
		}
		return r != 0;
	}
	
	public boolean updateItem(String customerId, String productId, float size, int quantity) {
		String sql = "update Cart set quantity = ? where customer_id = ? and product_id = ? and size = ?";
		int r = 0;
		try {
			Connection con = dbc.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, quantity);
			ps.setString(2, customerId);
			ps.setString(3, productId);
			ps.setFloat(4, size);

			r = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("Bug in CartDAO");
			e.printStackTrace();
		}
		return r != 0;
	}
	
	public boolean hasExistInCart(String customerId, String productId, int size) {
		String sql = "select * from Cart where customer_id = ? and product_id = ? and size = ?";
		int r = 0;
		try {
			Connection con = dbc.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, customerId);
			ps.setString(2, productId);
			ps.setInt(3, size);
			r = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("Bug in CartDAO");
			e.printStackTrace();
		}
		return r != 0;
	}
	
	public ProductInCart getProductInCart(String customerId, String productId, float size) {
		ProductInCart data = null;
		String sql = "select * , b.name [brand_name] "
				+ "from Cart c inner join Products p on c.product_id = p.id "
				+ "inner join Brands b on b.id = p.brand_id "
				+ "where customer_id = ? and product_id = ? and size = ?";
		try {
			Connection con = dbc.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, customerId);
			ps.setString(2, productId);
			ps.setFloat(3, size);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				String id = rs.getString("product_id");
				String name = rs.getString("name");
				String brand = rs.getString("brand_name");
				double price = rs.getDouble("price");
				int unitsInStock = rs.getInt("units_in_stock");
				int orderLevel = rs.getInt("order_level");
				int view = rs.getInt("view");
				double discount = rs.getDouble("discount");
				String description = rs.getString("description");
				String picture = rs.getString("picture");
				int quantity = rs.getInt("quantity");
				data = new ProductInCart(quantity, size, id, name, brand, price, unitsInStock, orderLevel, view, discount, description, picture);
				
			}
		} catch (Exception e) {
			System.out.println("Bug in CartDAO");
			e.printStackTrace();
		}
		return data;
	}
	
	public boolean order(List<ProductInCart> productsInCart, String userId, String address, String city, String phone, String email, String note, String voucher){
		String sqlOrder = "insert into Orders values(?,?,?,?,?,?,?)";
		String sqlOrderDetail = "insert into [Order Details] values((select top 1 id from Orders order by id desc),?,?,?,?)";
		int r = 0;
		try {
			Connection con = dbc.getConnection();
			PreparedStatement ps = con.prepareStatement(sqlOrder);
			ps.setString(1, userId);
			ps.setString(2, Date.valueOf(java.time.LocalDate.now()).toString());
			ps.setString(3, address);
			ps.setString(4, city);
			ps.setString(5, phone);
			ps.setString(6, email);
			ps.setString(7, note);
			r = ps.executeUpdate();
			for(ProductInCart p : productsInCart){
				PreparedStatement psp = con.prepareStatement(sqlOrderDetail);
				psp.setString(1, p.getId());
				psp.setDouble(2, p.getPriceOut());
				psp.setInt(3, p.getQuantity());
				psp.setString(4, voucher);
				psp.executeUpdate();
			}
		} catch (Exception e) {
			System.out.println("Bug in CartDAO");
			e.printStackTrace();
		}
		return r != 0;
	}
	

	public static void main(String[] args) {
		CartDAO dao = new CartDAO();
		System.out.println(dao.updateItem("6","1",36, 12));
	}
}
