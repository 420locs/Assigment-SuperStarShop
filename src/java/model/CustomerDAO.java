package model;

import entity.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ninh
 */
public class CustomerDAO {
	DBContext dbc = new DBContext();
	public Customer getAccount(String username, String password){
		Customer c = null;
		String sql = "select * from Customers c inner join Account a on c.id = a.customer_id where a.username = ? and a.password = ?";
		try {
			Connection con = dbc.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				String id = rs.getString("id");
				String name = rs.getString("name");
				String address = rs.getString("address");
				String city = rs.getString("city");
				String phone = rs.getString("phone");
				String email = rs.getString("email");
				String picture = rs.getString("picture");
				c = new Customer(id, name, username, password, address, city, phone, email, picture);
			}
			ps.close();
			con.close();
		} catch (Exception e) {
			System.out.println("Bug in CustomerDAO");
			e.printStackTrace();
		}
		return c;
	}
	public boolean addCustomer(Customer c) {
		int r = 0;
		String sql = "insert into Customers values(?,?,?,?,?,?)\n"
				+ "insert into Account values(?,?,(select top 1 id from Customers order by id desc))";
		try {
			Connection con = dbc.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, c.getName());
			ps.setString(2, c.getAddress());
			ps.setString(3, c.getCity());
			ps.setString(4, c.getPhone());
			ps.setString(5, c.getEmail());
			ps.setString(6, c.getPicture());
			ps.setString(7, c.getUsername());
			ps.setString(8, c.getPassword());
			r = ps.executeUpdate();
			ps.close();
			con.close();
		} catch (Exception ex){
			System.out.println("Bug in CustomerDAO");
			ex.printStackTrace();
		}
		return r != 0;
	}
	
	public boolean hasExistedUsername(String username){
		int r = 0;
		String sql = "select username from Account where username = ?";
		try {
			Connection con = dbc.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				r++;
			}
			ps.close();
			con.close();
		} catch (Exception e) {
			System.out.println("Bug in CustomerDAO");
			e.printStackTrace();
		}
		return r != 0;
	}
	public boolean hasExistedEmail(String email){
		int r = 0;
		String sql = "select email from Customers where email = ?";
		try {
			Connection con = dbc.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				r++;
			}
			ps.close();
			con.close();
		} catch (Exception e) {
			System.out.println("Bug in CustomerDAO");
			e.printStackTrace();
		}
		return r != 0;
	}
	public static void main(String[] args) {
		CustomerDAO dao = new CustomerDAO();
		Customer c = new Customer("", "Ninh Trinh Ba Minh", "nguu", "123", "vietnam", "hanoi", "+84369543469", "adzekk01@gmail.com", "");
		System.out.println(dao.hasExistedUsername("ngu"));
	}
}
