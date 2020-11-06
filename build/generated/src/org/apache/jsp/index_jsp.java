package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import entity.Product;
import model.ProductDAO;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/custom.css\"> <!--vo dung?-->\r\n");
      out.write("    <style>\r\n");
      out.write("        .show-product {\r\n");
      out.write("            width: 16rem;\r\n");
      out.write("            height: 16rem;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .why-text {\r\n");
      out.write("            height: 8rem;\r\n");
      out.write("        }\r\n");
      out.write("    </style> \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <!-- Start Header Top -->\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header-top.jsp", out, false);
      out.write("\r\n");
      out.write("    <!-- End Header Top -->\r\n");
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
      out.write("                    <a class=\"navbar-brand\" href=\"index.jsp\"><img src=\"images/logo.png\" class=\"logo\" alt=\"\"></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- End Header Navigation -->\r\n");
      out.write("\r\n");
      out.write("                <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbar-menu\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav ml-auto\" data-in=\"fadeInDown\" data-out=\"fadeOutUp\">\r\n");
      out.write("                        <li class=\"nav-item active\"><a class=\"nav-link\" href=\"index.jsp\">Trang Chủ</a></li>\r\n");
      out.write("                        <li class=\"dropdown\">\r\n");
      out.write("                            <a href=\"#\" class=\"nav-link dropdown-toggle arrow\" data-toggle=\"dropdown\">SHOP</a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li><a href=\"shop.jsp\">Sản Phẩm</a></li>\r\n");
      out.write("                                <li><a href=\"my-account.jsp\">My Account</a></li>\r\n");
      out.write("                                <li><a href=\"wishlist.jsp\">Wishlist</a></li>\r\n");
      out.write("                                <li><a href=\"shop-detail.jsp\">Shop Detail</a></li>\r\n");
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
      out.write("    <!-- Start Slider -->\r\n");
      out.write("    <div id=\"slides-shop\" class=\"cover-slides\">\r\n");
      out.write("        <ul class=\"slides-container\">\r\n");
      out.write("            <li class=\"text-left\">\r\n");
      out.write("                <img src=\"images/banner-01.jpg\" alt=\"\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-12\">\r\n");
      out.write("                            <h1 class=\"m-b-20\"><strong>Welcome To <br> Super Star Shop</strong></h1>\r\n");
      out.write("                            <p class=\"m-b-40\">See how your users experience your website in realtime or view <br> trends\r\n");
      out.write("                                to see any changes in performance over time.</p>\r\n");
      out.write("                            <p><a class=\"btn hvr-hover\" href=\"shop.jsp\">Xem Ngay</a></p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"text-center\">\r\n");
      out.write("                <img src=\"images/banner-02.jpg\" alt=\"\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-12\">\r\n");
      out.write("                            <h1 class=\"m-b-20\"><strong>Welcome To <br> Super Star Shop</strong></h1>\r\n");
      out.write("                            <p class=\"m-b-40\">See how your users experience your website in realtime or view <br> trends\r\n");
      out.write("                                to see any changes in performance over time.</p>\r\n");
      out.write("                            <p><a class=\"btn hvr-hover\" href=\"shop.jsp\">Xem Ngay</a></p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"text-right\">\r\n");
      out.write("                <img src=\"images/banner-03.jpg\" alt=\"\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-12\">\r\n");
      out.write("                            <h1 class=\"m-b-20\"><strong>Welcome To <br> Super Star Shop</strong></h1>\r\n");
      out.write("                            <p class=\"m-b-40\">See how your users experience your website in realtime or view <br> trends\r\n");
      out.write("                                to see any changes in performance over time.</p>\r\n");
      out.write("                            <p><a class=\"btn hvr-hover\" href=\"shop.jsp\">Xem Ngay</a></p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <div class=\"slides-navigation\">\r\n");
      out.write("            <a href=\"#\" class=\"next\"><i class=\"fa fa-angle-right\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("            <a href=\"#\" class=\"prev\"><i class=\"fa fa-angle-left\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- End Slider -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Start Products  -->\r\n");
      out.write("    <div class=\"products-box\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                    <div class=\"title-all text-center\">\r\n");
      out.write("                        <h1>SẢN PHẨM NỔI BẬT</h1>\r\n");
      out.write("                        <p>Hãy để đôi chân bạn có một sải bước tự tin nhất!</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                    <div class=\"special-menu text-center\">\r\n");
      out.write("                        <div class=\"button-group filter-button-group\">\r\n");
      out.write("                            <button class=\"active\" data-filter=\"*\">Xem Tất Cả</button>\r\n");
      out.write("                            <button data-filter=\".new\">Sản Phẩm Mới</button>\r\n");
      out.write("                            <button data-filter=\".sale\">Sale Off</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            ");

				ProductDAO productAccess = new ProductDAO();
				request.setAttribute("productData", productAccess.getProducts());
			
      out.write("\r\n");
      out.write("            <div class=\"row special-list\">\r\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                    <div class=\"special-menu text-center\">\r\n");
      out.write("                        <div class=\"button-group filter-button-group\">\r\n");
      out.write("                            <p><a class=\"btn hvr-hover white-text\" href=\"shop.jsp\">Xem Thêm</a></p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- End Products  -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Start Partner  -->\r\n");
      out.write("    <div class=\"footer-partner\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-8 offset-sm-2 text-center colorlib-heading colorlib-heading-sm\">\r\n");
      out.write("                    <h2>Trusted Partners</h2>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col partner-col text-center\">\r\n");
      out.write("                    <img src=\"./images/brand-1.jpg\" class=\"img-fluid\" alt=\"adidas\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col partner-col text-center\">\r\n");
      out.write("                    <img src=\"./images/brand-2.jpg\" class=\"img-fluid\" alt=\"nike\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col partner-col text-center\">\r\n");
      out.write("                    <img src=\"./images/brand-3.jpg\" class=\"img-fluid\" alt=\"gucci\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col partner-col text-center\">\r\n");
      out.write("                    <img src=\"./images/brand-4.jpg\" class=\"img-fluid\" alt=\"merrell\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col partner-col text-center\">\r\n");
      out.write("                    <img src=\"./images/brand-5.jpg\" class=\"img-fluid\" alt=\"puma\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- End Blog  -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
      out.write("\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("product");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.productData}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    <div class=\"col-lg-3 col-md-6 special-grid ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.state}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                        <div class=\"products-single fix\">\r\n");
          out.write("                            <div class=\"box-img-hover\">\r\n");
          out.write("                                <div class=\"type-lb\">\r\n");
          out.write("                                    <p class=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.state}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.state}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                                </div>\r\n");
          out.write("                                <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.picture}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"img-fluid show-product\" alt=\"Image\">\r\n");
          out.write("                                <div class=\"mask-icon\">\r\n");
          out.write("                                    <ul>\r\n");
          out.write("                                        <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"View\"><i\r\n");
          out.write("                                                    class=\"fas fa-eye\"></i></a></li>\r\n");
          out.write("                                        <!--                                    <li><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"right\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle=\"Add to Wishlist\"><i class=\"far fa-heart\"></i></a></li>-->\r\n");
          out.write("                                    </ul>\r\n");
          out.write("                                    <a class=\"cart\" href=\"#\">Add to Cart</a>\r\n");
          out.write("                                </div>\r\n");
          out.write("                            </div>\r\n");
          out.write("                            <div class=\"why-text\">\r\n");
          out.write("                                <h4>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.brand}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\r\n");
          out.write("                                <h5>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.priceOut}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    </div>\r\n");
          out.write("                ");
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
}
