<%-- 
    Document   : index.jsp
    Created on : Oct 21, 2020, 11:38:37 PM
    Author     : Ninh
--%>

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
		<title>${product}</title>
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
							<li class="dropdown active">
								<a href="shop" class="nav-link dropdown-toggle arrow" data-toggle="dropdown">SHOP</a>
								<ul class="dropdown-menu">
									<li><a href="shop">Sản Phẩm</a></li>
									<li><a href="my-account.jsp">My Account</a></li>
									<li><a href="wishlist.jsp">Wishlist</a></li>
								</ul>
							</li>
							<li class="nav-item"><a class="nav-link" href="about.jsp">About Us</a></li>
						</ul>
					</div>
					<!-- /.navbar-collapse -->

					<!-- Start Atribute Navigation -->
					<div class="attr-nav">
						<ul>
							<li class="search"><a href="#"><i class="fa fa-search"></i></a></li>
							<li class="side-menu"><a href="shop">
									<i class="fa fa-shopping-bag"></i>
									<span class="badge">3</span>
								</a></li>
						</ul>
					</div>
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
						<h2>Shop Detail</h2>
						<ul class="breadcrumb">
							<li class="breadcrumb-item"><a href="#">Shop</a></li>
							<li class="breadcrumb-item active">Shop Detail </li>
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
							<h5> <del>${product.priceOutNotSaleOff}</del>${product.priceOut}</h5>
							<p class="available-stock"><span> Hơn ${product.unitsInStock} đôi còn hàng / <a href="#">${product.orderLevel} đôi đã bán </a></span>
                            <p>
							<h4>Về sản phẩm:</h4>
							<p>${product.description}</p>
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
										<input class="form-control" value="0" min="0" max="20" type="number">
									</div>
								</li>
							</ul>

							<div class="price-box-bar">
								<div class="cart-and-bay-btn">
									<a class="btn hvr-hover" data-fancybox-close="" href="#">Mua ngay</a> <!-- CHUA LAM PHAN NAY-->
									<!--<a class="btn hvr-hover" data-fancybox-close="" href="#">Add to cart</a>-->
								</div>
							</div>

							<div class="add-to-btn">
								<div class="add-comp">
									<a class="btn hvr-hover" href="#"><i class="fas fa-heart"></i> Add to wishlist</a>
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