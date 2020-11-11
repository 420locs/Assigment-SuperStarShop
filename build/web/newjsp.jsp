<%-- 
    Document   : newjsp
    Created on : Nov 10, 2020, 5:27:59 PM
    Author     : Ninh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
</head>
<body>
	<form class="login100-form validate-form col-8" action="register" method="POST">
						<span class="login100-form-title">
							Đăng ký thành viên
						</span>

						<div class="wrap-input100 validate-input" data-validate = "Tên không được để trống">
							<input class="input100" type="file" name="first-name" placeholder="Tên*">
							<span class="focus-input100"></span>
							<span class="symbol-input100">
								<i class="fas fa-signature"></i>
							</span>
						</div>

						<div class="wrap-input100 " >
							<input class="input100" type="text" name="last-name" placeholder="Họ">
							<span class="focus-input100"></span>
							<span class="symbol-input100">
								<i class="fas fa-signature"></i>
							</span>
						</div>

						<div class="wrap-input100 validate-input" data-validate = "Tên người dùng không được để trống">
							<input class="input100" type="text" name="username" placeholder="Tên người dùng*">
							<span class="focus-input100"></span>
							<span class="symbol-input100">
								<i class="fa fa-user" aria-hidden="true"></i>
							</span>
						</div>
						
						<div class="wrap-input100 validate-input" data-validate = "Mật khẩu không được để trống">
							<input class="input100" type="password" name="password" placeholder="Mật khẩu*">
							<span class="focus-input100"></span>
							<span class="symbol-input100">
								<i class="fa fa-lock" aria-hidden="true"></i>
							</span>
						</div>

						<div class="wrap-input100 validate-input" data-validate = "Mật khẩu không được để trống">
							<input class="input100" type="password" name="re-password" placeholder="Nhập lại mật khẩu*">
							<span class="focus-input100"></span>
							<span class="symbol-input100">
								<i class="fa fa-lock" aria-hidden="true"></i>
							</span>
						</div>
						
						<div class="wrap-input100">
							<input class="input100" type="text" name="email" placeholder="Email">
							<span class="focus-input100"></span>
							<span class="symbol-input100">
								<i class="fa fa-envelope" aria-hidden="true"></i>
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
						
						<div class="wrap-input100">
							<input class="input100" type="tel" name="phone" placeholder="Số điện thoại">
							<span class="focus-input100"></span>
							<span class="symbol-input100">
								<i class="fa fa-phone" aria-hidden="true"></i>
							</span>
						</div>
						<div class="container-login100-form-btn">
							<button class="login100-form-btn">
								Login
							</button>
						</div>

					</form>
</body>
</html>