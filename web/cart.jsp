<%-- 
    Document   : index.jsp
    Created on : Oct 21, 2020, 11:38:37 PM
    Author     : Ninh
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page import="entity.Product"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<!-- Basic -->

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">

		<!-- Mobile Metas -->
		<meta name="viewport" content="width=device-width, initial-scale=1">

		<!-- Site Metas -->
		<title>ThewayShop - Ecommerce Bootstrap 4 HTML Template</title>
		<meta name="keywords" content="">
		<meta name="description" content="">
		<meta name="author" content="">

		<!-- Site Icons -->
		<link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon">
		<link rel="apple-touch-icon" href="images/apple-touch-icon.png">

		<!-- Bootstrap CSS -->
		<link rel="stylesheet" href="css/bootstrap.min.css">
		<!-- Site CSS -->
		<link rel="stylesheet" href="css/style.css">
		<!-- Responsive CSS -->
		<link rel="stylesheet" href="css/responsive.css">
		<!-- Custom CSS -->
		<link rel="stylesheet" href="css/custom.css">

		<!--[if lt IE 9]>
		  <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
		  <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
		<![endif]-->

	</head>

	<body>


		<!-- Start Main Top -->
		<jsp:include page="header-top.jsp"/>
		<!-- End Main Top -->

		<!-- Start Main Top -->
		<header class="main-header">
			<!-- Start Navigation -->
			<nav class="navbar navbar-expand-lg navbar-light bg-light navbar-default bootsnav">
				<div class="container">
					<!-- Start Header Navigation -->
					<div class="navbar-header">
						<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbar-menu"
								aria-controls="navbars-rs-food" aria-expanded="false" aria-label="Toggle navigation">
							<i class="fa fa-bars"></i>
						</button>
						<a class="navbar-brand" href="home"><img src="images/logo.png" class="logo" alt=""></a>
					</div>
					<!-- End Header Navigation -->

					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse" id="navbar-menu">
						<ul class="nav navbar-nav ml-auto" data-in="fadeInDown" data-out="fadeOutUp">
							<li class="nav-item"><a class="nav-link" href="home">Trang Chủ</a></li>
							<li class="nav-item active"><a class="nav-link" href="shop">Sản Phẩm</a></li>
							<li class="nav-item"><a class="nav-link" href="about.jsp">Liên Hệ</a></li>
						</ul>
					</div>
					<!-- /.navbar-collapse -->


					<!-- Start Atribute Navigation -->
					<jsp:include page="search-badge-bar.jsp"/>
					<!-- End Atribute Navigation -->
				</div>
				<!-- Start Side Menu -->
				<jsp:include page="/silde-cart.jsp" />
				<!-- End Side Menu -->
			</nav>
			<!-- End Navigation -->
		</header>
		<!-- End Main Top -->

		<!-- Start Top Search -->
		<jsp:include page="search-bar.jsp"/>
		<!-- End Top Search -->

		<!-- Start All Title Box -->
		<div class="all-title-box">
			<div class="container">
				<div class="row">
					<div class="col-lg-12">
						<h2>Giỏ Hàng</h2>
						<ul class="breadcrumb">
							<li class="breadcrumb-item"><a href="home">Shop</a></li>
							<li class="breadcrumb-item active">Giỏ hàng</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<!-- End All Title Box -->

		<!-- Start Cart  -->
		<div class="cart-box-main">
			<div class="container">
				<div class="row">
					<div class="col-lg-12">
						<div class="table-main table-responsive">
							<table class="table">
								<thead>
									<tr>
										<th>Ảnh</th>
										<th>Tên sản phẩm</th>
										<th>Size</th>
										<th>Giá</th>
										<th>Số Lượng</th>
										<th>Tổng</th>
										<th>Xóa</th>
									</tr>
								</thead>
								<tbody>
								<script>
									function updateCart(productId, quantity, size) {
										if (quantity <= 0) {
											location.href = 'remove?product_id=' + productId + '&size=' + size + '&goto=cart';
										} else {
											location.href = 'update?product_id=' + productId + '&quantity=' + quantity + '&size=' + size + '&goto=cart';
										}
									}
								</script>
								<c:set var="total" scope="request" value="${0}" />
								<c:forEach var="product" items="${productsInCart}">

									<tr>
										<td class="thumbnail-img">
											<a href="product?id=${product.id}">
												<img class="img-fluid" src="${product.picture}" alt="" />
											</a>
										</td>
										<td class="name-pr">
											<a href="product?id=${product.id}">
												${product}
											</a>
										</td>
										<td class="remove-pr">
											${product.size}
										</td>
										<td class="price-pr">
											<p><fmt:formatNumber value="${product.priceOut}"  type="number" pattern="###,###,### VND"/></p>
										</td>
										<td class="quantity-box"><input type="number" onchange="updateCart(${product.id}, this.value, ${product.size})" size="4" value="${product.quantity}" min="0" step="1" class="c-input-text qty text"></td>
										<td class="total-pr">
											<p id="priceOut"><fmt:formatNumber value="${product.priceOut * product.quantity}"  type="number" pattern="###,###,### VND"/></p> 
										</td>
										<td class="remove-pr">
											<a href="remove?product_id=${product.id}&size=${product.size}&goto=cart">
												<i class="fas fa-times"></i>
											</a>
										</td>
									</tr>
									<c:set var="total" scope="request" value="${total + product.priceOut * product.quantity}" />
								</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
				<!--<div class="row my-5 " >
					<div class="col-lg-6 col-sm-6"></div>
					<div class="col-lg-6 col-sm-6">
						<div class="coupon-box">
							<div class="input-group input-group-sm">
								<input onchange="applyVoucher(this)" style="text-transform:uppercase" class="form-control" placeholder="Nhập mã giảm giá" aria-label="Coupon code" type="text">
								
								<script>
									function applyVoucher(tag){
										let voucher = tag.value;
										if(voucher != "ANHTTV20"){
											document.getElementById("error").innerHTML="Voucher không tồn tại!";
											tag.style.borderColor = "red";
											tag.value = "";
											return;
										} 
										document.getElementById("error").innerHTML="";
										tag.style.borderColor = "green";
									}
								</script>
							</div>
						</div>
						<p id="error"></p>
					</div>
				</div>-->
				<div class="row my-5">
					<div class="col-lg-8 col-sm-12"></div>
					<div class="col-lg-4 col-sm-12">
						<div class="order-box">
							<h3>Tổng kết hóa đơn</h3>
							<div class="d-flex">
								<h4>Tạm tính</h4>
								<div class="ml-auto font-weight-bold"> <fmt:formatNumber value="${total}"  type="number" pattern="###,###,### VND"/> </div>
							</div>
							<div class="d-flex">
								<h4>Phí ship</h4>
								<div class="ml-auto font-weight-bold"> Free </div>
							</div>
							<hr>
							<div class="d-flex gr-total">
								<h5>Tổng tiền</h5>
								<div class="ml-auto h5"> <fmt:formatNumber value="${total}"  type="number" pattern="###,###,### VND"/></div>
							</div>
							<hr> </div>
					</div>
					<div class="col-12 d-flex shopping-box"><a href="checkout" class="ml-auto btn hvr-hover">Checkout</a> </div>
				</div>

			</div>
		</div>
		<!-- End Cart -->

		<!-- Start Instagram Feed  -->
		<div class="instagram-box">
			<div class="main-instagram owl-carousel owl-theme">
				<div class="item">
					<div class="ins-inner-box">
						<img src="images/instagram-img-01.jpg" alt="" />
						<div class="hov-in">
							<a href="#"><i class="fab fa-instagram"></i></a>
						</div>
					</div>
				</div>
				<div class="item">
					<div class="ins-inner-box">
						<img src="images/instagram-img-02.jpg" alt="" />
						<div class="hov-in">
							<a href="#"><i class="fab fa-instagram"></i></a>
						</div>
					</div>
				</div>
				<div class="item">
					<div class="ins-inner-box">
						<img src="images/instagram-img-03.jpg" alt="" />
						<div class="hov-in">
							<a href="#"><i class="fab fa-instagram"></i></a>
						</div>
					</div>
				</div>
				<div class="item">
					<div class="ins-inner-box">
						<img src="images/instagram-img-04.jpg" alt="" />
						<div class="hov-in">
							<a href="#"><i class="fab fa-instagram"></i></a>
						</div>
					</div>
				</div>
				<div class="item">
					<div class="ins-inner-box">
						<img src="images/instagram-img-05.jpg" alt="" />
						<div class="hov-in">
							<a href="#"><i class="fab fa-instagram"></i></a>
						</div>
					</div>
				</div>
				<div class="item">
					<div class="ins-inner-box">
						<img src="images/instagram-img-06.jpg" alt="" />
						<div class="hov-in">
							<a href="#"><i class="fab fa-instagram"></i></a>
						</div>
					</div>
				</div>
				<div class="item">
					<div class="ins-inner-box">
						<img src="images/instagram-img-07.jpg" alt="" />
						<div class="hov-in">
							<a href="#"><i class="fab fa-instagram"></i></a>
						</div>
					</div>
				</div>
				<div class="item">
					<div class="ins-inner-box">
						<img src="images/instagram-img-08.jpg" alt="" />
						<div class="hov-in">
							<a href="#"><i class="fab fa-instagram"></i></a>
						</div>
					</div>
				</div>
				<div class="item">
					<div class="ins-inner-box">
						<img src="images/instagram-img-09.jpg" alt="" />
						<div class="hov-in">
							<a href="#"><i class="fab fa-instagram"></i></a>
						</div>
					</div>
				</div>
				<div class="item">
					<div class="ins-inner-box">
						<img src="images/instagram-img-05.jpg" alt="" />
						<div class="hov-in">
							<a href="#"><i class="fab fa-instagram"></i></a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- End Instagram Feed  -->



		<jsp:include page="footer.jsp" />

		<a href="#" id="back-to-top" title="Back to top" style="display: none;">&uarr;</a>

		<!-- ALL JS FILES -->
		<script src="js/jquery-3.2.1.min.js"></script>
		<script src="js/popper.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<!-- ALL PLUGINS -->
		<script src="js/jquery.superslides.min.js"></script>
		<script src="js/bootstrap-select.js"></script>
		<script src="js/inewsticker.js"></script>
		<script src="js/bootsnav.js"></script>
		<script src="js/images-loded.min.js"></script>
		<script src="js/isotope.min.js"></script>
		<script src="js/owl.carousel.min.js"></script>
		<script src="js/baguetteBox.min.js"></script>
		<script src="js/form-validator.min.js"></script>
		<script src="js/contact-form-script.js"></script>
		<script src="js/custom.js"></script>
	</body>

</html>