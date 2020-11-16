package controller;

import entity.Customer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.CustomerDAO;

/**
 *
 * @author Ninh
 */
public class RegisterServlet extends HttpServlet {

	/**
	 * Processes requests for <code>POST</code> method.
	 *
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String city = request.getParameter("city");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		CustomerDAO customerAccess = new CustomerDAO();
		password = customerAccess.getMd5(password);
		Customer c = new Customer("", name, username, password, address, city, phone, email, phone);
		String url;
		// Validate data
		String error="";
		if (customerAccess.hasExistedUsername(username)) {
			error += "Username" + username + " đã tồn tại, hãy thử bằng một username khác<br/>";
		}
		if (customerAccess.hasExistedEmail(email)) {
			error += "Email " + email + " đã tồn tại, hãy thử bằng một email khác<br/>";
		} 
		
		if (error.isEmpty()) {
			customerAccess.addCustomer(c);
			url = "login";
		} else {
			HttpSession session = request.getSession(true);
			session.setAttribute("error", error);
			url = "register";
		}
		response.sendRedirect(url);
	}

	// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
	/**
	 * Handles the HTTP <code>GET</code> method.
	 *
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//register.jsp
		request.getRequestDispatcher("register.jsp").forward(request, response);
	}

	/**
	 * Handles the HTTP <code>POST</code> method.
	 *
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * Returns a short description of the servlet.
	 *
	 * @return a String containing servlet description
	 */
	@Override
	public String getServletInfo() {
		return "Short description";
	}// </editor-fold>

}
