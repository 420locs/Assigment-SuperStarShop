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
				<jsp:include page="silde-cart.jsp" />
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
						<h2>Chi tiết sản phẩm</h2>
						<ul class="breadcrumb">
							<li class="breadcrumb-item"><a href="home">Trang chủ</a></li>
							<li class="breadcrumb-item"><a href="shop">Sản phẩm</a></li>
							<li class="breadcrumb-item active">${product.brand} </li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<!-- End All Title Box -->

		<!-- Start Shop Detail  -->
		<div class="shop-detail-box-main">
			<div class="container">
				<div class="row">
					<div class="col-xl-5 col-lg-5 col-md-6">
						<img class="d-block w-100" src="${product.picture}" alt="Third slide">
					</div>
					<div class="col-xl-7 col-lg-7 col-md-6">
						<div class="single-product-details">
							<h2>${product.name}</h2> 
							<h5> <del><fmt:formatNumber value="${product.price}"  type="number" pattern="###,###,### VND"/></del><fmt:formatNumber value="${product.priceOut}"  type="number" pattern="###,###,### VND"/></h5>
							<p class="available-stock"><span> Hơn ${product.unitsInStock} đôi còn hàng / <a href="#">${product.orderLevel} đôi đã bán </a></span>
                            <p>
							<h4>Về sản phẩm:</h4>
							<p id="summary">${product.summaryDescription}<span class="show-more" onclick="show()"> xem thêm </span></p>
							<p id="more">${product.description}<span class="show-more" onclick="show()"> thu gọn </span></p>	
							<script>
								function show(){
									if(document.getElementById("summary").style.display !== 'none'){
										document.getElementById("summary").style.display = 'none';
										document.getElementById("more").style.display = 'block';
									} else {
										document.getElementById("summary").style.display = 'block';
										document.getElementById("more").style.display = 'none';
									}
								}
							</script>
							<ul>
								<li>
									<div class="form-group size-st">
										<label class="size-label">Size</label>
										<select id="basic" class="selectpicker show-tick form-control">
											<c:forEach var="size" items="${sizes}">
												<option value="${size}">${size}</option>
											</c:forEach>
										</select>
									</div>
								</li>
								<li>
									<div class="form-group quantity-box">
										<label class="control-label">Số lượng</label>
										<input id="quantity" class="form-control" value="1" min="1" max="10" type="number">
									</div>
								</li>
							</ul>

							<div class="price-box-bar">
								<div class="cart-and-bay-btn">
									<button id="add-to-cart" class="btn hvr-hover white-text" onclick="addToCart()" data-fancybox-close="" >Mua ngay</button> 

									<script>
										function addToCart() {
											if (${empty sessionScope.user}) {
												alert("Hold up! Bạn phải đăng nhập trước đã.");
												location.href = 'login';
												return;
											}
											let size = document.getElementById("basic").value;
											let quantity = document.getElementById("quantity").value;
											location.href = 'add?product_id=${product.id}&size=' + size + '&quantity=' + quantity + '&goto=cart';

										}
									</script>
									<!--<a class="btn hvr-hover" data-fancybox-close="" href="#">Add to cart</a>-->
								</div>
							</div>

							<div class="add-to-btn">
								<div class="add-comp"> 
									<a class="btn white-text" href="add?product_id=${product.id}&quantity=1&goto=home"><i class="fas fa-cart-plus"></i> Thêm vào giỏ hàng</a>
								</div>
								<div class="share-bar">
									<a class="btn hvr-hover" href="https://www.fb.com/zekk01/"><i class="fab fa-facebook" aria-hidden="true" target="_blank"></i></a>
									<a class="btn hvr-hover" href="#"><i class="fab fa-google-plus" aria-hidden="true"></i></a>
									<a class="btn hvr-hover" href="#"><i class="fab fa-twitter" aria-hidden="true"></i></a>
									<a class="btn hvr-hover" href="#"><i class="fab fa-pinterest-p" aria-hidden="true"></i></a>
									<a class="btn hvr-hover" href="#"><i class="fab fa-whatsapp" aria-hidden="true"></i></a>
								</div>
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