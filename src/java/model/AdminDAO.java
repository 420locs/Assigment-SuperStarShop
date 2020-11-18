package model;

import entity.Admin;
import entity.Customer;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Ninh
 */
public class AdminDAO {
	DBContext dbc = new DBContext();
	public Admin getAccount(String username, String password){
		Admin a = null;
		String sql = "select * from Admin where username = ? and password = ?";
		try {
			Connection con = dbc.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				String name = rs.getString("name");
				a = new Admin(name, username, password);
			}
			ps.close();
			con.close();
		} catch (Exception e) {
			System.out.println("Bug in AdminDAO");
			e.printStackTrace();
		}
		return a;
	}
	public String getMd5(String input) {
		try {

			// Static getInstance method is called with hashing MD5 
			MessageDigest md = MessageDigest.getInstance("MD5");

			// digest() method is called to calculate message digest 
			//  of an input digest() return array of byte 
			byte[] messageDigest = md.digest(input.getBytes());

			// Convert byte array into signum representation 
			BigInteger no = new BigInteger(1, messageDigest);

			// Convert message digest into hex value 
			String hashtext = no.toString(16);
			while (hashtext.length() < 32) {
				hashtext = "0" + hashtext;
			}
			return hashtext;
		} // For specifying wrong message digest algorithms 
		catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}
	public static void main(String[] args) {
		AdminDAO dao = new AdminDAO();
		System.out.println(dao.getAccount("ninh137", dao.getMd5("Zekais137")));
	}
}
