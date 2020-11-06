<%-- 
    Document   : shop
    Created on : Oct 21, 2020, 11:38:37 PM
    Author     : Ninh
--%>

<%@page import="java.util.List"%>
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
    <title>Tìm kiếm: ${param.q} - Super Star Shop - Shop bán giày vui vẻ ahihi</title>
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
        <style>
            .btn-brand{
                width: 12rem;
            }
        </style>
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
                        <li class="nav-item"><a class="nav-link" href="home">Trang Chủ</a></li>
                        <li class="nav-item active"><a class="nav-link" href="shop">Sản Phẩm</a></li>
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
    <jsp:include page="search-bar.jsp"/>
    <!-- End Top Search -->

    <!-- Start All Title Box -->
    <div class="all-title-box">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <h2>Sản Phẩm</h2>
                    <ul class="breadcrumb">
                        <li class="breadcrumb-item"><a href="home">Trang Chủ</a></li>
                        <li class="breadcrumb-item active">Kết quả tìm kiếm cho "${param.q}"</li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <!-- End All Title Box -->

    <!-- Start Shop Page  -->
    <div class="shop-box-inner">
        <div class="container">
            <div class="row">
                <div class="col-xl-12 col-lg-12 col-sm-12 col-xs-12 shop-content-right">
                    <div class="right-product-box">
                        <div class="product-item-filter row">
                            <div class="col-12 col-sm-8 text-center text-sm-left">
                                <div class="toolbar-sorter-right">
                                    <span>Sắp xếp </span>
                                    <select id="sort-mode" class="selectpicker show-tick form-control"
                                        data-placeholder="$ USD">
                                        <option data-display="Select">Mặc Định</option>
                                        <option value="popularity">Độ phổ biến</option>
                                        <option value="priceHigh">Giá cao → thấp</option>
                                        <option value="priceLow">Giá thấp → cao</option>
                                        <option value="bestSelling">Bán chạy nhất</option>
                                    </select>
                                    <script>
                                        document.getElementById('sort-mode').addEventListener("change", function () {
                                            let mode = document.getElementById("sort-mode").value;
											location.href = 'search?&sortby=' + mode +'&q=${param.q}';
                                        });
                                    </script>
                                </div>
                            </div>
                        </div>
                        <div class="row product-categorie-box">
							<c:if test="${not empty requestScope.products}">

								<div class="tab-content">
									<div role="tabpanel" class="tab-pane fade show active" id="grid-view">
										<div class="row">
											<c:forEach var="product" items="${requestScope.products}">
												<div class="col-xs-6 col-sm-6 col-md-4 col-lg-3 col-xl-3 ${product.brand}">
													<div class="products-single fix">
														<div class="box-img-hover">
															<div class="type-lb">
																<p class="${product.state}">${product.state}</p>
															</div>

															<img src="${product.picture}" class="img-fluid show-product"
																 alt="Image">
															<div class="mask-icon">
																<ul>
																	<li><a href="#" data-toggle="tooltip"
																		   data-placement="right" title="View"><i
																				class="fas fa-eye"></i></a></li>
																	<!--<li><a href="#" data-toggle="tooltip" data-placement="right" title="Add to Wishlist"><i class="far fa-heart"></i></a></li>-->
																</ul>
																<a class="cart" href="#">Thêm vào giỏ hàng</a>
															</div>
														</div>
														<div class="why-text">
															<a href="product?id=${product.id}">
																<h4>${product}</h4>
															</a>
															<h5>${product.priceOut}</h5>
														</div>
													</div>
												</div>
											</c:forEach>
										</div>
									</div>
								</div>
							</c:if>
							<c:if test="${empty requestScope.products}">
								<div class="title-all text-center" style="margin: 0 auto;">
									<h1>Không thấy gì hết á!</h1>
									<p>Không tìm thấy sản phẩm nào khớp với lựa chọn của bạn. :(</p>
								</div>
							</c:if>

                            <nav class="col-lg-12" >
                                <ul class="pagination">
									<c:forEach var="page" items="${pages}">
                                    <li class="page-item">
                                        <a class="page-link page"
										   href="search?sortby=${param.sortby}&page=${page}">${page}</a>
                                    </li>
									</c:forEach>
								</ul>
							</nav>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- End Shop Page -->

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
    <script src="js/jquery-ui.js"></script>
    <script src="js/jquery.nicescroll.min.js"></script>
    <script src="js/form-validator.min.js"></script>
    <script src="js/contact-form-script.js"></script>
    <script src="js/custom.js"></script>
	
</body>

</html>