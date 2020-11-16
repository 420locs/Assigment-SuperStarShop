package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_remove_var_scope_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_remove_var_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_remove_var_scope_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\t<!-- Basic -->\r\n");
      out.write("\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"utf-8\">\r\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Mobile Metas -->\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Site Metas -->\r\n");
      out.write("\t\t<title>Đăng ký thành viên - Super Star Shop - Shop bán giày vui vẻ ahihi</title>\r\n");
      out.write("\t\t<meta name=\"keywords\" content=\"\">\r\n");
      out.write("\t\t<meta name=\"description\" content=\"\">\r\n");
      out.write("\t\t<meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Site Icons -->\r\n");
      out.write("\t\t<link rel=\"shortcut icon\" href=\"images/favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("\t\t<link rel=\"apple-touch-icon\" href=\"images/apple-touch-icon.png\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Bootstrap CSS -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("\t\t<!-- Site CSS -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\t\t<!-- Responsive CSS -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/responsive.css\">\r\n");
      out.write("\t\t<!-- Custom CSS -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/custom.css\">\r\n");
      out.write("\t\t<!--===============================================================================================-->\r\n");
      out.write("\t\t<link rel=\"icon\" type=\"image/png\" href=\"images/icons/favicon.ico\" />\r\n");
      out.write("\t\t<!--===============================================================================================-->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\t\t<!--===============================================================================================-->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">\r\n");
      out.write("\t\t<!--===============================================================================================-->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/css-hamburgers/hamburgers.min.css\">\r\n");
      out.write("\t\t<!--===============================================================================================-->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\">\r\n");
      out.write("\t\t<!--===============================================================================================-->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/login-form.css\">\r\n");
      out.write("\t\t<!--===============================================================================================-->\r\n");
      out.write("\t\t<!--[if lt IE 9]>\r\n");
      out.write("\t\t\t  <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("\t\t\t  <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("\t\t\t<![endif]-->\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Start Main Top -->\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header-top.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t<!-- End Main Top -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Start Main Top -->\r\n");
      out.write("\t\t<header class=\"main-header\">\r\n");
      out.write("\t\t\t<!-- Start Navigation -->\r\n");
      out.write("\t\t\t<nav class=\"navbar navbar-expand-lg navbar-light bg-light navbar-default bootsnav\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<!-- Start Header Navigation -->\r\n");
      out.write("\t\t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbar-menu\"\r\n");
      out.write("\t\t\t\t\t\t\t\taria-controls=\"navbars-rs-food\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-bars\"></i>\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"navbar-brand\" href=\"home\"><img src=\"images/logo.png\" class=\"logo\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- End Header Navigation -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("\t\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"navbar-menu\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav navbar-nav ml-auto\" data-in=\"fadeInDown\" data-out=\"fadeOutUp\">\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item active\"><a class=\"nav-link\" href=\"home\">Trang Chủ</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"shop\">Sản Phẩm</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"about.jsp\">Liên Hệ</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- /.navbar-collapse -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- Start Atribute Navigation -->\r\n");
      out.write("\t\t\t\t\t<div class=\"attr-nav\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"search\"><a href=\"#\"><i class=\"fa fa-search\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"side-menu\"><a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-shopping-bag\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"badge\">3</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- End Atribute Navigation -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- Start Side Menu -->\r\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/silde-cart.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t<!-- End Side Menu -->\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t\t<!-- End Navigation -->\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t\t<!-- End Main Top -->\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Start Top Search -->\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "search-bar.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t<!-- End Top Search -->\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Login Form -->\r\n");
      out.write("\t\t<div class=\"limiter\">\r\n");
      out.write("\t\t\t<div class=\"container-login100\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"wrap-login100\">\r\n");
      out.write("\t\t\t\t\t<!-- Start Error Popup  -->\r\n");
      out.write("\t\t\t\t\t<div class=\"col-12 alert alert-danger alert-dismissible fade show\" role=\"alert\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty sessionScope.error ? \"hidden\" : \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\r\n");
      out.write("\t\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_remove_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- End Error Popup  -->\r\n");
      out.write("\t\t\t\t\t<div class=\"row col-12\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\t\t\tfunction changePic(event, src) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.getElementById(\"picture\").value = 'assets/avatar/' + src + '.png';\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.getElementById(src).style.visibility='visible';\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfor (i = 0; i < 4; i++) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tif (i != src) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tdocument.getElementById(i + '').style.visibility = 'hidden';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"login100-form-title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tChọn Avatar\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"login100-pic js-tilt\" data-tilt>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i id=\"0\" class=\"fas fa-arrow-right hidden\"></i><img src=\"assets/avatar/0.png \" alt=\"IMG\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"changePic(this, 0)\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"login100-pic js-tilt\" data-tilt>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i id=\"1\" class=\"fas fa-arrow-right hidden\"></i><img src=\"assets/avatar/1.png \" alt=\"IMG\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"changePic(this, 1)\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"login100-pic js-tilt\" data-tilt>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i id=\"2\" class=\"fas fa-arrow-right hidden\"></i><img src=\"assets/avatar/2.png \" alt=\"IMG\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"changePic(this, 2)\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"login100-pic js-tilt\" data-tilt>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i id=\"3\" class=\"fas fa-arrow-right hidden\"></i><img src=\"assets/avatar/3.png \" alt=\"IMG\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"changePic(this, 3)\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<form class=\"login100-form validate-form col-8\" action=\"register\" method=\"POST\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"login100-form-title\">\r\n");
      out.write("\t\t\t\t\t\t\t\tĐăng ký thành viên\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"picture\" type=\"text\" name=\"picture\" hidden value=\"images/img-01.png\">\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wrap-input100 validate-input\" data-validate=\"Họ và tên không được để trống\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"input100\" type=\"text\" name=\"name\" placeholder=\"Họ và tên*\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"focus-input100\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"symbol-input100\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fas fa-signature\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wrap-input100 validate-input\" data-validate=\"Username không được để trống\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"input100\" type=\"text\" name=\"username\" placeholder=\"Username*\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"focus-input100\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"symbol-input100\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-user\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wrap-input100 validate-input\"\r\n");
      out.write("\t\t\t\t\t\t\t\t data-validate=\"Mật khẩu phải có ít nhất 1 chữ thường, 1 chữ hoa, 1 chữ số, 1 ký tự đặc biệt và có nhiều hơn hoặc bằng 8 ký tự\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input id=\"pass\" class=\"input100\" type=\"password\" name=\"password\" placeholder=\"Mật khẩu*\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"focus-input100\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"symbol-input100\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-lock\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wrap-input100\" data-validate=\"Mật khẩu nhập lại không khớp\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input id=\"repass\" class=\"input100\" type=\"password\" name=\"re-password\" placeholder=\"Nhập lại mật khẩu*\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"focus-input100\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"symbol-input100\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-lock\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wrap-input100 validate-input\" data-validate=\"Email phải đúng định dạng abc@xyz.blobla\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"input100\" type=\"email\" name=\"email\" placeholder=\"Email\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"focus-input100\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"symbol-input100\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-envelope\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wrap-input100\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"input100\" type=\"tel\" name=\"phone\" placeholder=\"Số điện thoại\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"focus-input100\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"symbol-input100\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-phone\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wrap-input100\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"input100\" type=\"text\" name=\"city\" placeholder=\"Thành phố\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"focus-input100\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"symbol-input100\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-building\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wrap-input100\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"input100\" type=\"text\" name=\"address\" placeholder=\"Địa chỉ chi tiết\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"focus-input100\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"symbol-input100\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-address-card\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"container-login100-form-btn\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"login100-form-btn\" type=\"submit\" value=\"Đăng ký\" onclick=\"return validate()\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\t\t\tfunction validate() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tlet pass = document.getElementById('pass').value;\r\n");
      out.write("\t\t\t\t\t\t\t\t\tlet repass = document.getElementById('repass').value;\r\n");
      out.write("\t\t\t\t\t\t\t\t\tif (pass != repass) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$(\"#repass\").parent().addClass('alert-validate');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\treturn true\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- Remind Passowrd -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<a href=\"#\" id=\"back-to-top\" title=\"Back to top\" style=\"display: none;\">&uarr;</a>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- ALL JS FILES -->\r\n");
      out.write("\t\t<script src=\"js/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/popper.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\t<!-- ALL PLUGINS -->\r\n");
      out.write("\t\t<script src=\"js/jquery.superslides.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/bootstrap-select.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/inewsticker.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/bootsnav.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/images-loded.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/isotope.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/baguetteBox.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/form-validator.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/contact-form-script.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/custom.js\"></script>\r\n");
      out.write("\t\t<!--===============================================================================================-->\r\n");
      out.write("\t\t<script src=\"vendor/select2/select2.min.js\"></script>\r\n");
      out.write("\t\t<!--===============================================================================================-->\r\n");
      out.write("\t\t<script src=\"vendor/tilt/tilt.jquery.min.js\"></script>\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\t\t\t\t\t\t$('.js-tilt').tilt({\r\n");
      out.write("\t\t\t\t\t\t\t\t\tscale: 1.1\r\n");
      out.write("\t\t\t\t\t\t\t\t})\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t<script src=\"js/main.js\"></script>\r\n");
      out.write("\t</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_remove_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:remove
    org.apache.taglibs.standard.tag.common.core.RemoveTag _jspx_th_c_remove_0 = (org.apache.taglibs.standard.tag.common.core.RemoveTag) _jspx_tagPool_c_remove_var_scope_nobody.get(org.apache.taglibs.standard.tag.common.core.RemoveTag.class);
    _jspx_th_c_remove_0.setPageContext(_jspx_page_context);
    _jspx_th_c_remove_0.setParent(null);
    _jspx_th_c_remove_0.setVar("error");
    _jspx_th_c_remove_0.setScope("session");
    int _jspx_eval_c_remove_0 = _jspx_th_c_remove_0.doStartTag();
    if (_jspx_th_c_remove_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_remove_var_scope_nobody.reuse(_jspx_th_c_remove_0);
      return true;
    }
    _jspx_tagPool_c_remove_var_scope_nobody.reuse(_jspx_th_c_remove_0);
    return false;
  }
}
