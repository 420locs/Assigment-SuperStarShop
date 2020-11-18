package model;

import entity.Order;
import entity.ProductInCart;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ninh
 */
public class OrderDAO {
	DBContext dbc = new DBContext();
	
	public List<Order> getOrderedByUserId(String customer_id) {
		List<Order> data = new ArrayList<>();
		String sql = "select o.id, o.customer_id, cast(o.order_date as date) [order_date], o.city, o.address, o.phone, o.email, o.note ,sum(od.unit_price*od.quantity) [value] \n" +
"				from Orders o inner join [Order Details] od on o.id = od.order_id \n" +
"				where o.customer_id = ? \n" +
"				group by o.id, o.customer_id, o.order_date, o.city, o.address, o.phone, o.email, o.note ";
		try {
			Connection con = dbc.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, customer_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				int customerId = rs.getInt("customer_id");
				String city = rs.getString("city");
				String orderDate = rs.getString("order_date");
				String address = rs.getString("address");
				String phone = rs.getString("phone");
				String email = rs.getString("email");
				String note = rs.getString("note");
				double totalValue = rs.getDouble("value");
				Order o = new Order(id, customerId, orderDate, address, city, phone, email, note, totalValue);
				data.add(o);
			}
		} catch (Exception e) {
			System.out.println("Bug in CartDAO");
			e.printStackTrace();
		}
		return data;
	}
	
	public static void main(String[] args) {
		OrderDAO dao = new OrderDAO();
		System.out.println(dao.getOrderedByUserId("6"));
	}
}
