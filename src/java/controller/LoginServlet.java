package controller;

import entity.Customer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.CustomerDAO;

/**
 *
 * @author Ninh
 */
public class LoginServlet extends HttpServlet {

	/**
	 * Processes requests for  <code>POST</code> methods.
	 *
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String rememberMe = request.getParameter("remember-me");
		CustomerDAO customerAccess = new CustomerDAO();
		Customer user = customerAccess.getAccount(username, password);
		if(user == null){
			String ms = username + " and " + password + " is incorrect!";
			request.setAttribute("error", ms);
			request.getRequestDispatcher("login").forward(request, response);
		} else {
			
			if(rememberMe != null){
				Cookie usernameCookie = new Cookie("username", username);
				Cookie passwordCookie = new Cookie("password", password);
				// life = 20 min
				usernameCookie.setMaxAge(20 * 60);
				passwordCookie.setMaxAge(20 * 60);
				response.addCookie(usernameCookie);
				response.addCookie(passwordCookie);
			} else {
				Cookie usernameCookie = new Cookie("username", username);
				Cookie passwordCookie = new Cookie("password", password);
				usernameCookie.setMaxAge(0);
				passwordCookie.setMaxAge(0);
				response.addCookie(usernameCookie);
				response.addCookie(passwordCookie);
			}

			HttpSession session = request.getSession(true);
			session.setAttribute("user", user);
			response.sendRedirect("home");
		}
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
		// get check data
		
		// goto login form
		request.getRequestDispatcher("login.jsp").forward(request, response);
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
