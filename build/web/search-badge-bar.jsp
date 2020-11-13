<%-- 
    Document   : search-badge-bar
    Created on : Nov 12, 2020, 8:07:54 AM
    Author     : Ninh
--%>

<%@page import="entity.ProductInCart"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="entity.Customer"%>
<%@page import="model.CartDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
	CartDAO cartAccess = new CartDAO();
	Customer user = (Customer) session.getAttribute("user");
	List<ProductInCart> data = new ArrayList<>();
	if (user != null) {
		data = cartAccess.getProductsInCart(user.getId());
		request.setAttribute("productsInCart", data);
	}
%>

<!-- Start Atribute Navigation -->
<div class="attr-nav">
	<ul>
		<li class="search"><a href="#"><i class="fa fa-search"></i></a></li>
		<li class="side-menu"><a href="#">
				<i class="fa fa-shopping-bag"></i>
				<span class="badge"><%= data.size() %></span>
			</a></li>
	</ul>
</div>
<!-- End Atribute Navigation -->
