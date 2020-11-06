package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;

public final class shop_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("    <title>Super Star Shop - Shop bán giày vui vẻ ahihi</title>\r\n");
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
      out.write("        <style>\r\n");
      out.write("            .btn-brand{\r\n");
      out.write("                width: 12rem;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Start Main Top -->\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header-top.jsp", out, false);
      out.write("\r\n");
      out.write("    <!-- End Main Top -->\r\n");
      out.write("\r\n");
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
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"home\">Trang Chủ</a></li>\r\n");
      out.write("                        <li class=\"dropdown active\">\r\n");
      out.write("                            <a href=\"#\" class=\"nav-link dropdown-toggle arrow\" data-toggle=\"dropdown\">SHOP</a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li><a href=\"shop\">Sản Phẩm</a></li>\r\n");
      out.write("                                <li><a href=\"my-account.jsp\">My Account</a></li>\r\n");
      out.write("                                <li><a href=\"wishlist.jsp\">Wishlist</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"about.jsp\">About Us</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.navbar-collapse -->\r\n");
      out.write("\r\n");
      out.write("                <!-- Start Atribute Navigation -->\r\n");
      out.write("                <div class=\"attr-nav\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li class=\"search\"><a href=\"#\"><i class=\"fa fa-search\"></i></a></li>\r\n");
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
      out.write("    <!-- Start Top Search -->\r\n");
      out.write("    <div class=\"top-search\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"input-group\">\r\n");
      out.write("                <span class=\"input-group-addon\"><i class=\"fa fa-search\"></i></span>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\r\n");
      out.write("                <span class=\"input-group-addon close-search\"><i class=\"fa fa-times\"></i></span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- End Top Search -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Start All Title Box -->\r\n");
      out.write("    <div class=\"all-title-box\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                    <h2>Shop</h2>\r\n");
      out.write("                    <ul class=\"breadcrumb\">\r\n");
      out.write("                        <li class=\"breadcrumb-item\"><a href=\"home\">Home</a></li>\r\n");
      out.write("                        <li class=\"breadcrumb-item active\">Shop</li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- End All Title Box -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Start Shop Page  -->\r\n");
      out.write("    <div class=\"shop-box-inner\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-xl-3 col-lg-3 col-sm-12 col-xs-12 sidebar-shop-left\">\r\n");
      out.write("                    <div class=\"product-categori\">\r\n");
      out.write("                        <div class=\"search-product\">\r\n");
      out.write("                            <form action=\"#\">\r\n");
      out.write("                                <input class=\"form-control\" placeholder=\"Bạn tìm gì...\" type=\"text\">\r\n");
      out.write("                                <button type=\"submit\"> <i class=\"fa fa-search\"></i> </button>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"filter-brand-left\">\r\n");
      out.write("                            <div class=\"title-left\">\r\n");
      out.write("                                <h3>Thương Hiệu</h3>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"brand-box\">\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-xl-9 col-lg-9 col-sm-12 col-xs-12 shop-content-right\">\r\n");
      out.write("                    <div class=\"right-product-box\">\r\n");
      out.write("                        <div class=\"product-item-filter row\">\r\n");
      out.write("                            <div class=\"col-12 col-sm-8 text-center text-sm-left\">\r\n");
      out.write("                                <div class=\"toolbar-sorter-right\">\r\n");
      out.write("                                    <span>Sort by </span>\r\n");
      out.write("                                    <select id=\"sort-mode\" class=\"selectpicker show-tick form-control\"\r\n");
      out.write("                                        data-placeholder=\"$ USD\">\r\n");
      out.write("                                        <option data-display=\"Select\">Nothing</option>\r\n");
      out.write("                                        <option value=\"popularity\">Popularity</option>\r\n");
      out.write("                                        <option value=\"priceHigh\">High Price → High Price</option>\r\n");
      out.write("                                        <option value=\"priceLow\">Low Price → High Price</option>\r\n");
      out.write("                                        <option value=\"bestSelling\">Best Selling</option>\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                    <script>\r\n");
      out.write("                                        document.getElementById('sort-mode').addEventListener(\"change\", function () {\r\n");
      out.write("                                            let mode = document.getElementById(\"sort-mode\").value;\r\n");
      out.write("                                            location.href = 'shop?sortby=' + mode;\r\n");
      out.write("                                        });\r\n");
      out.write("                                    </script>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"row product-categorie-box\">\r\n");
      out.write("                            <div class=\"tab-content\">\r\n");
      out.write("                                <div role=\"tabpanel\" class=\"tab-pane fade show active\" id=\"grid-view\">\r\n");
      out.write("                                    <div class=\"row\">\r\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <nav class=\"col-lg-12\">\r\n");
      out.write("                                <ul class=\"pagination\">\r\n");
      out.write("                                    <li class=\"page-item\">\r\n");
      out.write("                                        <a class=\"page-link\" href=\"#\" aria-label=\"Previous\">\r\n");
      out.write("                                            <span aria-hidden=\"true\">&laquo;</span>\r\n");
      out.write("                                            <span class=\"sr-only\">Previous</span>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    ");
for (Integer pageItem : (List<Integer>) request.getAttribute("pages")) {
      out.write("\r\n");
      out.write("                                    <li class=\"page-item\">\r\n");
      out.write("                                        <a class=\"page-link page\"\r\n");
      out.write("                                            href=\"");
      out.print(request.getParameter("sortby") == null ? "shop?page="+pageItem : "shop?sortby=" + request.getParameter("sortby") + "&page="+pageItem);
      out.write('"');
      out.write('>');
      out.print(pageItem);
      out.write("</a>\r\n");
      out.write("                                        <a class=\"page-link page\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t   href=\"shop?sortby=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.sortby}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&brand=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.brand}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&page=");
      out.print(pageItem);
      out.write('"');
      out.write('>');
      out.print(pageItem);
      out.write("</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"page-item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"page-link\" href=\"#\" aria-label=\"Next\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span aria-hidden=\"true\">&raquo;</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"sr-only\">Next</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</nav>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- End Shop Page -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Start Instagram Feed  -->\r\n");
      out.write("    <div class=\"instagram-box\">\r\n");
      out.write("        <div class=\"main-instagram owl-carousel owl-theme\">\r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <div class=\"ins-inner-box\">\r\n");
      out.write("                    <img src=\"images/instagram-img-01.jpg\" alt=\"\" />\r\n");
      out.write("                    <div class=\"hov-in\">\r\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <div class=\"ins-inner-box\">\r\n");
      out.write("                    <img src=\"images/instagram-img-02.jpg\" alt=\"\" />\r\n");
      out.write("                    <div class=\"hov-in\">\r\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <div class=\"ins-inner-box\">\r\n");
      out.write("                    <img src=\"images/instagram-img-03.jpg\" alt=\"\" />\r\n");
      out.write("                    <div class=\"hov-in\">\r\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <div class=\"ins-inner-box\">\r\n");
      out.write("                    <img src=\"images/instagram-img-04.jpg\" alt=\"\" />\r\n");
      out.write("                    <div class=\"hov-in\">\r\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <div class=\"ins-inner-box\">\r\n");
      out.write("                    <img src=\"images/instagram-img-05.jpg\" alt=\"\" />\r\n");
      out.write("                    <div class=\"hov-in\">\r\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <div class=\"ins-inner-box\">\r\n");
      out.write("                    <img src=\"images/instagram-img-06.jpg\" alt=\"\" />\r\n");
      out.write("                    <div class=\"hov-in\">\r\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <div class=\"ins-inner-box\">\r\n");
      out.write("                    <img src=\"images/instagram-img-07.jpg\" alt=\"\" />\r\n");
      out.write("                    <div class=\"hov-in\">\r\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <div class=\"ins-inner-box\">\r\n");
      out.write("                    <img src=\"images/instagram-img-08.jpg\" alt=\"\" />\r\n");
      out.write("                    <div class=\"hov-in\">\r\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <div class=\"ins-inner-box\">\r\n");
      out.write("                    <img src=\"images/instagram-img-09.jpg\" alt=\"\" />\r\n");
      out.write("                    <div class=\"hov-in\">\r\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <div class=\"ins-inner-box\">\r\n");
      out.write("                    <img src=\"images/instagram-img-05.jpg\" alt=\"\" />\r\n");
      out.write("                    <div class=\"hov-in\">\r\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- End Instagram Feed  -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
      out.write("\r\n");
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
      out.write("    <script src=\"js/jquery-ui.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.nicescroll.min.js\"></script>\r\n");
      out.write("    <script src=\"js/form-validator.min.js\"></script>\r\n");
      out.write("    <script src=\"js/contact-form-script.js\"></script>\r\n");
      out.write("    <script src=\"js/custom.js\"></script>\r\n");
      out.write("\t\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("brand");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.brands}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <li>\r\n");
          out.write("                                            <div class=\"radio radio-danger\">\r\n");
          out.write("                                                <input name=\"survey\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${brand.nameOut}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" type=\"radio\">\r\n");
          out.write("                                                <label> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${brand.nameOut}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </label>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </li>\r\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("product");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.products}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                            <div class=\"col-sm-6 col-md-6 col-lg-4 col-xl-4 ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.brand}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                                <div class=\"products-single fix\">\r\n");
          out.write("                                                    <div class=\"box-img-hover\">\r\n");
          out.write("                                                        <div class=\"type-lb\">\r\n");
          out.write("                                                            <p class=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.state}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.state}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                                                        </div>\r\n");
          out.write("\r\n");
          out.write("                                                        <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.picture}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"img-fluid show-product\"\r\n");
          out.write("                                                            alt=\"Image\">\r\n");
          out.write("                                                        <div class=\"mask-icon\">\r\n");
          out.write("                                                            <ul>\r\n");
          out.write("                                                                <li><a href=\"#\" data-toggle=\"tooltip\"\r\n");
          out.write("                                                                        data-placement=\"right\" title=\"View\"><i\r\n");
          out.write("                                                                            class=\"fas fa-eye\"></i></a></li>\r\n");
          out.write("                                                                <!--<li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Add to Wishlist\"><i class=\"far fa-heart\"></i></a></li>-->\r\n");
          out.write("                                                            </ul>\r\n");
          out.write("                                                            <a class=\"cart\" href=\"#\">Thêm vào giỏ hàng</a>\r\n");
          out.write("                                                        </div>\r\n");
          out.write("                                                    </div>\r\n");
          out.write("                                                    <div class=\"why-text\">\r\n");
          out.write("                                                        <a href=\"product?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                                            <h4>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\r\n");
          out.write("                                                        </a>\r\n");
          out.write("                                                        <h5>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.priceOut}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\r\n");
          out.write("                                                    </div>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
