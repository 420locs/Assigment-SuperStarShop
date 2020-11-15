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
		<title>Super Star Shop - Shop bán giày vui vẻ ahihi</title>
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
                        <li class="nav-item"><a class="nav-link" href="shop">Sản Phẩm</a></li>
                        <li class="nav-item active"><a class="nav-link" href="about.jsp">Liên Hệ</a></li>
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
						<h2>Liên Hệ Với Chúng Tôi</h2>
						<ul class="breadcrumb">
							<li class="breadcrumb-item"><a href="home">Trang Chủ</a></li>
							<li class="breadcrumb-item active">ABOUT US</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<!-- End All Title Box -->

		<!-- Start About Page  -->
		<div class="about-box-main">
			<div class="container">
				<div class="row">
					<div class="col-lg-6">
						<h2 class="noo-sh-title">We are <span>Superstarshop</span></h2>
						<p>Đây là sản phẩm Assignment của môn PRJ321 về dự án Web bán hàng online(SuperStarShop) với mặt hàng là giày.
						<p>Lời cám ơn chân thành cho team developer với một chiếc Template sử dụng Bootstrap4 rất đẹp <3.</p>
					</div>
					<div class="col-lg-6">
						<div class="banner-frame"> <img class="img-thumbnail img-fluid" src="images/about-img.jpg" alt="" />
						</div>
					</div>
				</div>
				<div class="row my-5">
					<div class="col-sm-6 col-lg-4">
						<div class="service-block-inner">
							<h3>Tin cậy</h3>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
						</div>
					</div>
					<div class="col-sm-6 col-lg-4">
						<div class="service-block-inner">
							<h3>Chuyên nghiệp</h3>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
						</div>
					</div>
					<div class="col-sm-6 col-lg-4">
						<div class="service-block-inner">
							<h3>Chất lượng</h3>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
						</div>
					</div>
				</div>

                <div class="row my-4">
                    <div class="contact-form-right">
                        <h2>LIÊN HỆ VỚI CHÚNG TÔI</h2>
                        <form id="contactForm">
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <input type="text" class="form-control" id="name" name="name" placeholder="Tên" required data-error="Xin hãy cho biết quý danh ạ :3">
                                        <div class="help-block with-errors"></div>
                                    </div>
                                </div>
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <input type="text" placeholder="Email" id="email" class="form-control" name="name" required data-error="Email không được bỏ trống">
                                        <div class="help-block with-errors"></div>
                                    </div>
                                </div>
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <input type="text" class="form-control" id="subject" name="name" placeholder="Tiêu đề" required data-error="Tiêu đề không được bỏ trống">
                                        <div class="help-block with-errors"></div>
                                    </div>
                                </div>
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <textarea class="form-control" id="message" placeholder="Hãy nói lên suy nghĩ của bạn..." rows="4" data-error="Nội dung không thể bỏ trống" required></textarea>
                                        <div class="help-block with-errors"></div>
                                    </div>
                                    <div class="submit-button text-center">
                                        <button class="btn hvr-hover" id="submit" type="submit">Gửi</button>
                                        <div id="msgSubmit" class="h3 text-center hidden"></div>
                                        <div class="clearfix"></div>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
			</div>
		</div>
		<!-- End About Page -->

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