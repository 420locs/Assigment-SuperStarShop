package controller;

import entity.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.*;

/**
 *
 * @author Ninh
 */
public class ShopServlet extends HttpServlet {

	/**
	 * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
	 *
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BrandDAO brandAccess = new BrandDAO();
		ProductDAO productAccess = new ProductDAO();
		
		//get brand id
		String brandId = request.getParameter("brand");
		brandId = brandId == null ? "" : brandId;
		
		//get sort mode
		String sortMode = request.getParameter("sortby");
		sortMode = sortMode == null ? "" : sortMode;
		
		//get number of page
		int productsAPage = 9;
		List<Integer> listPage = new ArrayList<>();
		for(int i = 1, j = 0; j < productAccess.getCount(brandId); i++, j+=productsAPage){
			listPage.add(i);
		}
		String rPage = request.getParameter("page");
		int page = rPage == null ? 1 : Integer.parseInt(rPage);
		
		
		List<Brand> brandData = brandAccess.getBrands();
		List<Product> productData = productAccess.getProducts(page, productsAPage, brandId, sortMode);
		request.setAttribute("pages", listPage);
		request.setAttribute("brands", brandData);
		request.setAttribute("products", productData);
		request.getRequestDispatcher("shop.jsp").forward(request, response);
		
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
		processRequest(request, response);
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
		try (PrintWriter out = response.getWriter()) {
			/* TODO output your page here. You may use following sample code. */
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet ShopServlet</title>");			
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Servlet ShopServlet at " + request.getContextPath() + " with method POST</h1>");
			out.println("</body>");
			out.println("</html>");
		}
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
