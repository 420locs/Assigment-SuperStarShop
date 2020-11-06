<%-- 
    Document   : index.jsp
    Created on : Oct 21, 2020, 11:38:37 PM
    Author     : Ninh
--%>

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
		<!--===============================================================================================-->	
		<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
		<!--===============================================================================================-->
		<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
		<!--===============================================================================================-->
		<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
		<!--===============================================================================================-->	
		<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
		<!--===============================================================================================-->
		<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
		<!--===============================================================================================-->
		<link rel="stylesheet" type="text/css" href="css/util.css">
		<link rel="stylesheet" type="text/css" href="css/main.css">
		<!--===============================================================================================-->
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
						<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbar-menu" aria-controls="navbars-rs-food" aria-expanded="false" aria-label="Toggle navigation">
							<i class="fa fa-bars"></i>
						</button>
						<a class="navbar-brand" href="index.jsp"><img src="images/logo.png" class="logo" alt=""></a>
					</div>
					<!-- End Header Navigation -->

					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse" id="navbar-menu">
						<ul class="nav navbar-nav ml-auto" data-in="fadeInDown" data-out="fadeOutUp">
							<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
							<li class="nav-item"><a class="nav-link" href="about.jsp">About Us</a></li>
							<li class="dropdown megamenu-fw">
								<a href="#" class="nav-link dropdown-toggle arrow" data-toggle="dropdown">Product</a>
								<ul class="dropdown-menu megamenu-content" role="menu">
									<li>
										<div class="row">
											<div class="col-menu col-md-3">
												<h6 class="title">Top</h6>
												<div class="content">
													<ul class="menu-col">
														<li><a href="shop.jsp">Jackets</a></li>
														<li><a href="shop.jsp">Shirts</a></li>
														<li><a href="shop.jsp">Sweaters & Cardigans</a></li>
														<li><a href="shop.jsp">T-shirts</a></li>
													</ul>
												</div>
											</div>
											<!-- end col-3 -->
											<div class="col-menu col-md-3">
												<h6 class="title">Bottom</h6>
												<div class="content">
													<ul class="menu-col">
														<li><a href="shop.jsp">Swimwear</a></li>
														<li><a href="shop.jsp">Skirts</a></li>
														<li><a href="shop.jsp">Jeans</a></li>
														<li><a href="shop.jsp">Trousers</a></li>
													</ul>
												</div>
											</div>
											<!-- end col-3 -->
											<div class="col-menu col-md-3">
												<h6 class="title">Clothing</h6>
												<div class="content">
													<ul class="menu-col">
														<li><a href="shop.jsp">Top Wear</a></li>
														<li><a href="shop.jsp">Party wear</a></li>
														<li><a href="shop.jsp">Bottom Wear</a></li>
														<li><a href="shop.jsp">Indian Wear</a></li>
													</ul>
												</div>
											</div>
											<div class="col-menu col-md-3">
												<h6 class="title">Accessories</h6>
												<div class="content">
													<ul class="menu-col">
														<li><a href="shop.jsp">Bags</a></li>
														<li><a href="shop.jsp">Sunglasses</a></li>
														<li><a href="shop.jsp">Fragrances</a></li>
														<li><a href="shop.jsp">Wallets</a></li>
													</ul>
												</div>
											</div>
											<!-- end col-3 -->
										</div>
										<!-- end row -->
									</li>
								</ul>
							</li>
							<li class="dropdown active">
								<a href="#" class="nav-link dropdown-toggle arrow" data-toggle="dropdown">SHOP</a>
								<ul class="dropdown-menu">
									<li><a href="cart.jsp">Cart</a></li>
									<li><a href="checkout.jsp">Checkout</a></li>
									<li><a href="my-account.jsp">My Account</a></li>
									<li><a href="wishlist.jsp">Wishlist</a></li>
									<li><a href="shop-detail.jsp">Shop Detail</a></li>
								</ul>
							</li>
							<li class="nav-item"><a class="nav-link" href="service.jsp">Our Service</a></li>
							<li class="nav-item"><a class="nav-link" href="contact-us.jsp">Contact Us</a></li>
						</ul>
					</div>
					<!-- /.navbar-collapse -->

					<!-- Start Atribute Navigation -->
					<div class="attr-nav">
						<ul>
							<li class="search"><a href="#"><i class="fa fa-search"></i></a></li>
							<li class="side-menu"><a href="#">
									<i class="fa fa-shopping-bag"></i>
									<span class="badge">3</span>
								</a></li>
						</ul>
					</div>
					<!-- End Atribute Navigation -->
				</div>
				<!-- Start Side Menu -->
				<div class="side">
					<a href="#" class="close-side"><i class="fa fa-times"></i></a>
					<li class="cart-box">
						<ul class="cart-list">
							<li>
								<a href="#" class="photo"><img src="images/img-pro-01.jpg" class="cart-thumb" alt="" /></a>
								<h6><a href="#">Delica omtantur </a></h6>
								<p>1x - <span class="price">$80.00</span></p>
							</li>
							<li>
								<a href="#" class="photo"><img src="images/img-pro-02.jpg" class="cart-thumb" alt="" /></a>
								<h6><a href="#">Omnes ocurreret</a></h6>
								<p>1x - <span class="price">$60.00</span></p>
							</li>
							<li>
								<a href="#" class="photo"><img src="images/img-pro-03.jpg" class="cart-thumb" alt="" /></a>
								<h6><a href="#">Agam facilisis</a></h6>
								<p>1x - <span class="price">$40.00</span></p>
							</li>
							<li class="total">
								<a href="#" class="btn btn-default hvr-hover btn-cart">VIEW CART</a>
								<span class="float-right"><strong>Total</strong>: $180.00</span>
							</li>
						</ul>
					</li>
				</div>
				<!-- End Side Menu -->
			</nav>
			<!-- End Navigation -->
		</header>
		<!-- End Main Top -->

		<!-- Start Top Search -->
		<jsp:include page="search-bar.jsp"/>
		<!-- End Top Search -->

		<!-- Login Form -->
		<div class="limiter">
			<div class="container-login100">
				<div class="wrap-login100">
					<div class="login100-pic js-tilt" data-tilt>
						<img src="images/img-01.png" alt="IMG">
					</div>

					<form class="login100-form validate-form">
						<span class="login100-form-title">
							Member Login
						</span>

						<div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
							<input class="input100" type="text" name="email" placeholder="Email">
							<span class="focus-input100"></span>
							<span class="symbol-input100">
								<i class="fa fa-envelope" aria-hidden="true"></i>
							</span>
						</div>

						<div class="wrap-input100 validate-input" data-validate = "Password is required">
							<input class="input100" type="password" name="pass" placeholder="Password">
							<span class="focus-input100"></span>
							<span class="symbol-input100">
								<i class="fa fa-lock" aria-hidden="true"></i>
							</span>
						</div>

						<div class="container-login100-form-btn">
							<button class="login100-form-btn">
								Login
							</button>
						</div>

						<div class="text-center p-t-12">
							<span class="txt1">
								Forgot
							</span>
							<a class="txt2" href="#">
								Username / Password?
							</a>
						</div>

						<div class="text-center p-t-136">
							<a class="txt2" href="#">
								Create your Account
								<i class="fa fa-long-arrow-right m-l-5" aria-hidden="true"></i>
							</a>
						</div>
					</form>
				</div>
			</div>
		</div>
		<!-- Remind Passowrd -->



		<jsp:include page="footer.html" />

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
		<!--===============================================================================================-->
		<script src="vendor/select2/select2.min.js"></script>
		<!--===============================================================================================-->
		<script src="vendor/tilt/tilt.jquery.min.js"></script>
		<script >
			$('.js-tilt').tilt({
				scale: 1.1
			})
		</script>
		<script src="js/main.js"></script>
	</body>

</html>