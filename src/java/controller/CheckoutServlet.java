package controller;

import entity.Customer;
import entity.ProductInCart;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CartDAO;

/**
 *
 * @author Ninh
 */
public class CheckoutServlet extends HttpServlet {

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
		CartDAO cartAccess = new CartDAO();
		Customer user = (Customer) request.getSession().getAttribute("user");
		List<ProductInCart> data = cartAccess.getProductsInCart(user.getId());
		String phone = request.getParameter("phone");
		String city = request.getParameter("city");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String note = request.getParameter("note");
		String voucher = "";
		boolean r = cartAccess.order(data, user.getId(), address, city, phone, email ,note, voucher);
		String url;
		if(r){
			url = "thanks.jsp";
			for (ProductInCart p : data) {
				cartAccess.removeItem(user.getId(), p.getId(), p.getSize());
			}
		} else {
			url = "checkout.jsp";
			request.setAttribute("error", "Đặt hàng không thành công, :(");
		}
		request.getRequestDispatcher(url).forward(request, response);
		
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
		CartDAO cartAccess = new CartDAO();
		Customer user = (Customer) request.getSession().getAttribute("user");
		if (user == null) {
			response.sendRedirect("login");
			return;
		}
		List<ProductInCart> data;
		data = cartAccess.getProductsInCart(user.getId());
		request.setAttribute("productsInCart", data);
		request.getRequestDispatcher("checkout.jsp").forward(request, response);
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
