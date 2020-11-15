<%-- 
    Document   : index.jsp
    Created on : Oct 21, 2020, 11:38:37 PM
    Author     : Ninh
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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

		<c:set var="user" scope="request" value="${sessionScope.user}"/>
		<!-- Start Main Top -->
		<jsp:include page="header-top.jsp" />
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
							<li class="nav-item active"><a class="nav-link" href="home">Trang Chủ</a></li>
							<li class="nav-item"><a class="nav-link" href="shop">Sản Phẩm</a></li>
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
		<div class="top-search">
			<div class="container">
				<div class="input-group">
					<span class="input-group-addon"><i class="fa fa-search"></i></span>
					<input type="text" class="form-control" placeholder="Search">
					<span class="input-group-addon close-search"><i class="fa fa-times"></i></span>
				</div>
			</div>
		</div>
		<!-- End Top Search -->

		<!-- Start All Title Box -->
		<div class="all-title-box">
			<div class="container">
				<div class="row">
					<div class="col-lg-12">
						<h2>Checkout</h2>
						<ul class="breadcrumb">
							<li class="breadcrumb-item"><a href="home">Trang chủ</a></li>
							<li class="breadcrumb-item"><a href="cart">Giỏ hàng</a></li>
							<li class="breadcrumb-item active">Đơn hàng của <b class="white-text">${user.name}</b></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<!-- End All Title Box -->

		<!-- Start Cart  -->
		<div class="alert alert-danger alert-dismissible fade show" role="alert" ${empty error ? "hidden" : ""}>
			${error}
			<button type="button" class="close" data-dismiss="alert" aria-label="Close">
				<span aria-hidden="true">&times;</span>
			</button>
		</div>
		<!-- End Error Popup  -->

		<!-- Start Cart  -->
		<div class="cart-box-main">
			<div class="container">
				<div class="row">
					<div class="col-sm-6 col-lg-6 mb-3">
						<div class="checkout-address">
							<div class="title-left">
								<h3>Thông tin hóa đơn </h3>
							</div>
							<form class="needs-validation"  action="checkout" method="post" novalidate>
								<div class="mb-3">
									<label for="phone">Số điện thoại *</label>
									<input type="text" class="form-control" id="phone" name="phone" placeholder="" value="${user.phone}" required>
									<div class="invalid-feedback"> phone number is required </div>
								</div>
								<div class="mb-3">
									<label for="email">Email</label>
									<input type="email" class="form-control" id="email" name="email" placeholder="" value="${user.email}">
								</div>

								<div class="mb-3">
									<label for="address">Thành phố *</label>
									<input type="text" class="form-control" id="city" name="city" placeholder="" value="${user.city}" required>
									<div class="invalid-feedback"> Xin hãy nhập thành phố của bạn. </div>
								</div>

								<div class="mb-3">
									<label for="address">Địa chỉ chi tiết *</label>
									<input type="text" class="form-control" id="address" name="address"  placeholder=""  value="${user.address}" required>
									<div class="invalid-feedback"> Xin hãy nhập địa chỉ chi tiết. </div>
								</div>

								<div class="mb-3">
									<label for="note">Note</label>
									<textarea class="form-control" rows="6" id="note" name="note" placeholder="Ghi chú..." style="resize: none;"></textarea>
								</div>

								<hr class="mb-4">
								<input type="submit" id="checkout" hidden>
							</form>
						</div>
					</div>
					<div class="col-sm-6 col-lg-6 mb-3">
						<div class="row">
							<div class="col-md-12 col-lg-12">
								<div class="odr-box">
									<div class="title-left">
										<h3>Giỏ hàng</h3>
									</div>
									<div class="rounded p-2 bg-light">
										<c:set var="total" scope="request" value="${0}"/>
										<c:forEach var="product" items="${productsInCart}">
											<div class="media mb-2 border-bottom">
												<div class="media-body"> <a href="product?id=${product.id}"> ${product}</a>
													<div class="small text-muted">Size: ${product.size} <span class="mx-2">|</span>Giá: <fmt:formatNumber value="${product.priceOut}"  type="number" pattern="###,###,### VND"/> <span class="mx-2">|</span> SL:
														${product.quantity} <span class="mx-2">|</span> Thành tiền: <fmt:formatNumber value="${product.priceOut * product.quantity}"  type="number" pattern="###,###,### VND"/></div>
												</div>
											</div>
											<c:set var="total" scope="request" value="${total + product.priceOut*product.quantity}"/>
										</c:forEach>
									</div>
								</div>
							</div>
							<div class="col-md-12 col-lg-12">
								<div class="order-box">
									<br/>
									<div class="title-left">
										<h3>Thanh toán</h3>
									</div>
									<div class="d-flex">
										<h4>Tạm tính</h4>
										<div class="ml-auto font-weight-bold"> <fmt:formatNumber value="${total}"  type="number" pattern="###,###,### VND"/> </div>
									</div>
									<!--<div class="d-flex">
										<h4>Mã giảm giá</h4>
										<div class="ml-auto font-weight-bold"> $ 40 </div>
									</div>-->
									<div class="d-flex">
										<h4>Phí ship</h4>
										<div class="ml-auto font-weight-bold"> Miễn phí </div>
									</div>
									<hr class="my-1">

									<div class="d-flex gr-total">
										<h5>Tổng hóa đơn:</h5>
										<div class="ml-auto h5"> <fmt:formatNumber value="${total}"  type="number" pattern="###,###,### VND"/> </div> 
									</div>
									<hr class="my-1">
								</div>
							</div>
							<div class="col-12 d-flex shopping-box"> 
								<button onclick="checkout()" class="ml-auto btn hvr-hover white-text" >Hoàn tất thanh toán</button> 
								<script>
									function checkout(){
										if(${empty productsInCart}){
											alert("Giỏ hàng của bạn chưa có gì cả!")
											return;
										} 
										document.getElementById('checkout').click();
									}
																									
								</script>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- End Cart -->

		<!-- Start Instagram Feed  -->
		<jsp:include page="instagram-feed.jsp"/>
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