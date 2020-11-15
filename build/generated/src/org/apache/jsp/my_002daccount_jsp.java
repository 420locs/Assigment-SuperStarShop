package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class my_002daccount_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<!-- Basic -->\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Mobile Metas -->\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Site Metas -->\r\n");
      out.write("    <title>ThewayShop - Ecommerce Bootstrap 4 HTML Template</title>\r\n");
      out.write("    <meta name=\"keywords\" content=\"\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Site Icons -->\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("    <link rel=\"apple-touch-icon\" href=\"images/apple-touch-icon.png\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("    <!-- Site CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("    <!-- Responsive CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/responsive.css\">\r\n");
      out.write("    <!-- Custom CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/custom.css\">\r\n");
      out.write("\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <!-- Start Main Top -->\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header-top.jsp", out, false);
      out.write("\r\n");
      out.write("    <!-- End Main Top -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Start Main Top -->\r\n");
      out.write("    <header class=\"main-header\">\r\n");
      out.write("        <!-- Start Navigation -->\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light navbar-default bootsnav\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <!-- Start Header Navigation -->\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbar-menu\"\r\n");
      out.write("                        aria-controls=\"navbars-rs-food\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                        <i class=\"fa fa-bars\"></i>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"home\"><img src=\"images/logo.png\" class=\"logo\" alt=\"\"></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- End Header Navigation -->\r\n");
      out.write("\r\n");
      out.write("                <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbar-menu\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav ml-auto\" data-in=\"fadeInDown\" data-out=\"fadeOutUp\">\r\n");
      out.write("                        <li class=\"nav-item active\"><a class=\"nav-link\" href=\"home\">Trang Chủ</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"shop\">Sản Phẩm</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"about.jsp\">Liên Hệ</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.navbar-collapse -->\r\n");
      out.write("\r\n");
      out.write("                <!-- Start Atribute Navigation -->\r\n");
      out.write("                <div class=\"attr-nav\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li class=\"side-menu\"><a href=\"#\">\r\n");
      out.write("                                <i class=\"fa fa-shopping-bag\"></i>\r\n");
      out.write("                                <span class=\"badge\">3</span>\r\n");
      out.write("                            </a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- End Atribute Navigation -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Start Side Menu -->\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/silde-cart.jsp", out, false);
      out.write("\r\n");
      out.write("            <!-- End Side Menu -->\r\n");
      out.write("        </nav>\r\n");
      out.write("        <!-- End Navigation -->\r\n");
      out.write("    </header>\r\n");
      out.write("    <!-- End Main Top -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Start All Title Box -->\r\n");
      out.write("    <div class=\"all-title-box\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                    <h2>My Account</h2>\r\n");
      out.write("                    <ul class=\"breadcrumb\">\r\n");
      out.write("                        <li class=\"breadcrumb-item\"><a href=\"#\">Shop</a></li>\r\n");
      out.write("                        <li class=\"breadcrumb-item\">My Account</li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- End All Title Box -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Start My Account  -->\r\n");
      out.write("    <div class=\"my-account-box-main\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"my-account-page\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-4 col-md-12\">\r\n");
      out.write("                        <div class=\"account-box\">\r\n");
      out.write("                            <div class=\"service-box\">\r\n");
      out.write("                                <div class=\"service-icon\">\r\n");
      out.write("                                    <a href=\"#\"> <i class=\"fa fa-gift\"></i> </a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"service-desc\">\r\n");
      out.write("                                    <h4>Your Orders</h4>\r\n");
      out.write("                                    <p>Track, return, or buy things again</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-4 col-md-12\">\r\n");
      out.write("                        <div class=\"account-box\">\r\n");
      out.write("                            <div class=\"service-box\">\r\n");
      out.write("                                <div class=\"service-icon\">\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-lock\"></i> </a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"service-desc\">\r\n");
      out.write("                                    <h4>Login &amp; security</h4>\r\n");
      out.write("                                    <p>Edit login, name, and mobile number</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-4 col-md-12\">\r\n");
      out.write("                        <div class=\"account-box\">\r\n");
      out.write("                            <div class=\"service-box\">\r\n");
      out.write("                                <div class=\"service-icon\">\r\n");
      out.write("                                    <a href=\"#\"> <i class=\"fa fa-location-arrow\"></i> </a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"service-desc\">\r\n");
      out.write("                                    <h4>Your Addresses</h4>\r\n");
      out.write("                                    <p>Edit addresses for orders and gifts</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- End My Account -->\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("    <!-- Start Footer  -->\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("    <!-- End Footer  -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Start copyright  -->\r\n");
      out.write("    <div class=\"footer-copyright\">\r\n");
      out.write("        <p class=\"footer-company\">All Rights Reserved. &copy; 2018 <a href=\"#\">ThewayShop</a> Design By :\r\n");
      out.write("            <a href=\"https://html.design/\">html design</a></p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- End copyright  -->\r\n");
      out.write("\r\n");
      out.write("    <a href=\"#\" id=\"back-to-top\" title=\"Back to top\" style=\"display: none;\">&uarr;</a>\r\n");
      out.write("\r\n");
      out.write("    <!-- ALL JS FILES -->\r\n");
      out.write("    <script src=\"js/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("    <script src=\"js/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- ALL PLUGINS -->\r\n");
      out.write("    <script src=\"js/jquery.superslides.min.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap-select.js\"></script>\r\n");
      out.write("    <script src=\"js/inewsticker.js\"></script>\r\n");
      out.write("    <script src=\"js/bootsnav.js\"></script>\r\n");
      out.write("    <script src=\"js/images-loded.min.js\"></script>\r\n");
      out.write("    <script src=\"js/isotope.min.js\"></script>\r\n");
      out.write("    <script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("    <script src=\"js/baguetteBox.min.js\"></script>\r\n");
      out.write("    <script src=\"js/form-validator.min.js\"></script>\r\n");
      out.write("    <script src=\"js/contact-form-script.js\"></script>\r\n");
      out.write("    <script src=\"js/custom.js\"></script>\r\n");
      out.write("</body>\r\n");
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
}
