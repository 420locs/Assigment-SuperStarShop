package controller;

import entity.Brand;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.BrandDAO;
import model.ProductDAO;

/**
 *
 * @author Ninh
 */
public class SearchServlet extends HttpServlet {

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
		ProductDAO productAccess = new ProductDAO();
		String keyword = request.getParameter("q");
		if(keyword == null || keyword.isEmpty())
			keyword = "";
		
		//get sort mode
		String sortMode = request.getParameter("sortby");
		sortMode = sortMode == null ? "" : sortMode;
		
		
		//get number of page
		int productsAPage = 12;
		List<Integer> listPage = new ArrayList<>();
		for(int i = 1, j = 0; j < productAccess.getCountSearchResult(keyword); i++, j+=productsAPage){
			listPage.add(i);
		}
		
		String rPage = request.getParameter("page");
		int page = rPage == null ? 1 : Integer.parseInt(rPage);
		
		
		//get data
		List<Product> productData = productAccess.searchByKeyword(keyword, page, productsAPage, sortMode);
		request.setAttribute("pages", listPage);
		request.setAttribute("products", productData);
		request.getRequestDispatcher("search.jsp").forward(request, response);
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
