<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page import="java.util.ArrayList"%>
<%@page import="entity.ProductInCart"%>
<%@page import="entity.Product"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

<!-- Start Side Menu -->
<div class="side">
	<a href="#" class="close-side"><i class="fa fa-times"></i></a>
	<li class="cart-box">
		<ul class="cart-list">
			<script>
				function removeItem(productId, size){
					location.href='remove?product_id=' + productId + '&size=' + size + '&goto=cart';
				}
			</script>
			<c:set var="total" scope="request" value="${0}"/> 
			<c:forEach var="product" items="${productsInCart}">		
				<li>
					<a href="#" onclick="removeItem(${product.id}, ${product.size})" class="close-side" style="color: black"  ><i class="fa fa-times" ></i></a>
					<a href="product?id=${product.id}" class="photo"><img src="${product.picture}" class="cart-thumb" alt="" /></a>
					<h6><a href="product?id=${product.id}">${product.name} </a></h6>
					<p>${product.quantity}x - <span class="price"><fmt:formatNumber value="${product.priceOut}"  type="number" pattern="###,###,### VND"/></span></p>
				</li>
				<c:set var="total" scope="request" value="${total + product.priceOut*product.quantity}"/>
			</c:forEach>
			<li class="total">
				<a href="cart" class="btn btn-default hvr-hover btn-cart">Xem giỏ hàng</a>
				<div style="margin-top: 10px" ><strong>Tổng tiền</strong>: <fmt:formatNumber value="${total}"  type="number" pattern="###,###,### VND"/></div>
			</li>
		</ul>
	</li>
</div>
<!-- End Side Menu -->