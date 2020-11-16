<%-- 
    Document   : register.jsp
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
		<title>Đăng ký thành viên - Super Star Shop - Shop bán giày vui vẻ ahihi</title>
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
		<link rel="icon" type="image/png" href="images/icons/favicon.ico" />
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
		<link rel="stylesheet" type="text/css" href="css/login-form.css">
		<!--===============================================================================================-->
		<!--[if lt IE 9]>
			  <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
			  <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
			<![endif]-->
	</head>

	<body>


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
		<jsp:include page="search-bar.jsp" />
		<!-- End Top Search -->

		<!-- Login Form -->
		<div class="limiter">
			<div class="container-login100">

				<div class="wrap-login100">
					<!-- Start Error Popup  -->
					<div class="col-12 alert alert-danger alert-dismissible fade show" role="alert" ${empty sessionScope.error ? "hidden" : ""}>
						${sessionScope.error}
						<button type="button" class="close" data-dismiss="alert" aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<c:remove var="error" scope="session" />
					<!-- End Error Popup  -->
					<div class="row col-12">
						<div class="col-4">
							<script>
								function changePic(event, src) {
									document.getElementById("picture").value = 'assets/avatar/' + src + '.png';
									document.getElementById(src).style.visibility='visible';
									for (i = 0; i < 4; i++) {
										if (i != src) {
											document.getElementById(i + '').style.visibility = 'hidden';
										}
									}
								}
							</script>
							<div class="row">
								<span class="login100-form-title">
									Chọn Avatar
								</span>
								<div class="login100-pic js-tilt" data-tilt>
									<i id="0" class="fas fa-arrow-right hidden"></i><img src="assets/avatar/0.png " alt="IMG"
										onclick="changePic(this, 0)">
								</div>
								<div class="login100-pic js-tilt" data-tilt>
									<i id="1" class="fas fa-arrow-right hidden"></i><img src="assets/avatar/1.png " alt="IMG"
										onclick="changePic(this, 1)">
								</div>
								<div class="login100-pic js-tilt" data-tilt>
									<i id="2" class="fas fa-arrow-right hidden"></i><img src="assets/avatar/2.png " alt="IMG"
										onclick="changePic(this, 2)">
								</div>
								<div class="login100-pic js-tilt" data-tilt>
									<i id="3" class="fas fa-arrow-right hidden"></i><img src="assets/avatar/3.png " alt="IMG"
										onclick="changePic(this, 3)">
								</div>
							</div>
						</div>
						<form class="login100-form validate-form col-8" action="register" method="POST">
							<span class="login100-form-title">
								Đăng ký thành viên
							</span>
	
							<input id="picture" type="text" name="picture" hidden value="images/img-01.png">
	
	
							<div class="wrap-input100 validate-input" data-validate="Họ và tên không được để trống">
								<input class="input100" type="text" name="name" placeholder="Họ và tên*">
								<span class="focus-input100"></span>
								<span class="symbol-input100">
									<i class="fas fa-signature"></i>
								</span>
							</div>


							<div class="wrap-input100 validate-input" data-validate="Username không được để trống">
								<input class="input100" type="text" name="username" placeholder="Username*">
								<span class="focus-input100"></span>
								<span class="symbol-input100">
									<i class="fa fa-user" aria-hidden="true"></i>
								</span>
							</div>

							<div class="wrap-input100 validate-input"
								 data-validate="Mật khẩu phải có ít nhất 1 chữ thường, 1 chữ hoa, 1 chữ số, 1 ký tự đặc biệt và có nhiều hơn hoặc bằng 8 ký tự">
								<input id="pass" class="input100" type="password" name="password" placeholder="Mật khẩu*">
								<span class="focus-input100"></span>
								<span class="symbol-input100">
									<i class="fa fa-lock" aria-hidden="true"></i>
								</span>
							</div>

							<div class="wrap-input100" data-validate="Mật khẩu nhập lại không khớp">
								<input id="repass" class="input100" type="password" name="re-password" placeholder="Nhập lại mật khẩu*">
								<span class="focus-input100"></span>
								<span class="symbol-input100">
									<i class="fa fa-lock" aria-hidden="true"></i>
								</span>
							</div>

							<div class="wrap-input100 validate-input" data-validate="Email phải đúng định dạng abc@xyz.blobla">
								<input class="input100" type="email" name="email" placeholder="Email">
								<span class="focus-input100"></span>
								<span class="symbol-input100">
									<i class="fa fa-envelope" aria-hidden="true"></i>
								</span>
							</div>
							<div class="wrap-input100">
								<input class="input100" type="tel" name="phone" placeholder="Số điện thoại">
								<span class="focus-input100"></span>
								<span class="symbol-input100">
									<i class="fa fa-phone" aria-hidden="true"></i>
								</span>
							</div>


							<div class="wrap-input100">
								<input class="input100" type="text" name="city" placeholder="Thành phố">
								<span class="focus-input100"></span>
								<span class="symbol-input100">
									<i class="fa fa-building"></i>
								</span>
							</div>

							<div class="wrap-input100">
								<input class="input100" type="text" name="address" placeholder="Địa chỉ chi tiết">
								<span class="focus-input100"></span>
								<span class="symbol-input100">
									<i class="fa fa-address-card" aria-hidden="true"></i>
								</span>
							</div>

							<div class="container-login100-form-btn">
								<input class="login100-form-btn" type="submit" value="Đăng ký" onclick="return validate()">
							</div>
							<script>
								function validate() {
									let pass = document.getElementById('pass').value;
									let repass = document.getElementById('repass').value;
									if (pass != repass) {
										$("#repass").parent().addClass('alert-validate');
										return false;
									}
									return true
								}
							</script>
						</form>
					</div>
				</div>
			</div>
		</div>
		<!-- Remind Passowrd -->



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
		<!--===============================================================================================-->
		<script src="vendor/select2/select2.min.js"></script>
		<!--===============================================================================================-->
		<script src="vendor/tilt/tilt.jquery.min.js"></script>
		<script>
								$('.js-tilt').tilt({
									scale: 1.1
								})
		</script>
		<script src="js/main.js"></script>
	</body>

</html>