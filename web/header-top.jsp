
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="main-top">
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
				<div class="text-slid-box">
					<div id="offer-box" class="carouselTicker">
						<ul class="offer-box">
							<li>
								<i class="fab fa-opencart"></i> Off 10%! Shop Now Man
							</li>
							<li>
								<i class="fab fa-opencart"></i> 50% - 80% off on Fashion
							</li>
							<li>
								<i class="fab fa-opencart"></i> 20% off Entire Purchase Promo code: offT20
							</li>
							<li>
								<i class="fab fa-opencart"></i> Off 50%! Shop Now
							</li>
							<li>
								<i class="fab fa-opencart"></i> Off 10%! Shop Now Man
							</li>
							<li>
								<i class="fab fa-opencart"></i> 50% - 80% off on Fashion
							</li>
							<li>
								<i class="fab fa-opencart"></i> 20% off Entire Purchase Promo code: offT20
							</li>
							<li>
								<i class="fab fa-opencart"></i> Off 50%! Shop Now
							</li>
						</ul>
					</div>
				</div>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
				<div class="right-phone-box">
					<p>Call US :<a href="tel:+84369543469"> +84 369 543 469</a></p>
				</div>
				<div class="our-link">
					<ul>
						<% if (session.getAttribute("user") == null) { %>
						<li>
							<a href="login">Đăng Nhập</a>
						</li>
						<%} else {%>
						<li class="dropdown">
                            <a href="#" class="nav-link" data-toggle="dropdown">${sessionScope.user}  </a>
							<div class="dropdown-menu" aria-labelledby="dropdownMenuLink" style="background-color: black">
								<a class="dropdown-item" href="profile" style="background-color: black">Profile</a>
								<a class="dropdown-item" href="logout" style="background-color: black">Logout</a>
							</div>
						<%}%>
						<li><a href="https://fb.com/zekk01" target="_blank">Liên Hệ</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</div>