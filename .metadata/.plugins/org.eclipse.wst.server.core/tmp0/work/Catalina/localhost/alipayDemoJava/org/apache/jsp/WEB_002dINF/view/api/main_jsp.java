/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.48
 * Generated at: 2019-01-24 13:04:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.api;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/view/api/../base/common.jsp", Long.valueOf(1529551060000L));
    _jspx_dependants.put("/WEB-INF/view/api/../base/head.jsp", Long.valueOf(1535375424000L));
    _jspx_dependants.put("/WEB-INF/view/api/../base/foot.jsp", Long.valueOf(1529551060000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zh-CN\">\n");
      out.write("  <head>\n");
      out.write("  \t");
      out.write('\r');
      out.write('\n');

	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath();

      out.write("\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"");
      out.print(basePath);
      out.write("/static/js/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"");
      out.print(basePath);
      out.write("/static/js/jquery-3.2.1.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(basePath);
      out.write("/static/js/bootstrap/js/bootstrap.min.js\"></script>");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->\n");
      out.write("    <title>开发者工具</title>\n");
      out.write("    <link href=\"static/css/main.css\" rel=\"stylesheet\">\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".header{\r\n");
      out.write("  background-image: url('static/images/header.png');\r\n");
      out.write("  height:100px;\r\n");
      out.write("}\r\n");
      out.write(".header p:nth-child(1){\r\n");
      out.write("  color:#fff;\r\n");
      out.write("  font-size: 18px;\r\n");
      out.write("  position: relative;\r\n");
      out.write("  top: 36px;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("}\r\n");
      out.write(".header p:nth-child(2){\r\n");
      out.write("  font-size: 14px;\r\n");
      out.write("  position: relative;\r\n");
      out.write("  top: 36px;\r\n");
      out.write("  left: 75%;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("    <p>开发者工具</p>\r\n");
      out.write("    <p><a href=\"https://docs.open.alipay.com/api\" target=\"_blank\" style=\"color:#fff;\">查看文档</a></p>\r\n");
      out.write("    <p></p>\r\n");
      out.write("</div>");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <!-- body begin -->\n");
      out.write("      <div class=\"container-body\">\n");
      out.write("        <!-- Tabs -->\n");
      out.write("        <div id=\"tabs\">\n");
      out.write("          <!-- Nav tabs -->\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- footer begin -->\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".footer {\r\n");
      out.write("  background-color: #f4f4f4;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height: 100px;\r\n");
      out.write("}\r\n");
      out.write(".footer:before,.footer:after{\r\n");
      out.write("  clear: both;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".foot-link {\r\n");
      out.write("  padding-top:40px;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("    <p class=\"foot-link\">\r\n");
      out.write("        <span>蚂蚁金服集团</span> | <span>支付宝</span> | <span>招财宝</span>\r\n");
      out.write("          | <span>蚂蚁商家中心</span> | <span>芝麻信用</span> | <span>蚂蚁微贷</span> | <span>网商银行</span>\r\n");
      out.write("          | <span>开放平台</span> | <span>诚征英才</span> | <span>联系我们</span>\r\n");
      out.write("    </p>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("\t// 加载时\r\n");
      out.write("\twindow.onload = function() {\r\n");
      out.write("\t\tfootSize()\r\n");
      out.write("\t}\r\n");
      out.write("\t// 屏幕改变大小\r\n");
      out.write("\t$(window).resize(function() {\r\n");
      out.write("\t\tfootSize()\r\n");
      out.write("\t})\r\n");
      out.write("\t// 页面点击事件\r\n");
      out.write("\t$('body').on('click', function() {\r\n");
      out.write("\t\tfootSize()\r\n");
      out.write("\t})\r\n");
      out.write("\r\n");
      out.write("\tfunction footSize() {\r\n");
      out.write("\t\tvar screenHeight = $(window).height()\r\n");
      out.write("\t\tvar otherHeight = $('.head').height() + $('.content').height()\r\n");
      out.write("\r\n");
      out.write("\t\tvar footMarginHeight = 40\r\n");
      out.write("\t\tif (screenHeight - 140 > otherHeight) {\r\n");
      out.write("\t\t\tfootMarginHeight = screenHeight - otherHeight - 100\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t$('.foot').css('margin-top', footMarginHeight)\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("  <script src=\"static/js/main.js\"></script>\n");
      out.write("  <script src=\"static/js/tabPanel.js\"></script>\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("    var url = \"getApiInfo.json\";\n");
      out.write("    $.post(url,function(json){\n");
      out.write("      $('#tabs').tabPanel({\n");
      out.write("        data:json\n");
      out.write("      })\n");
      out.write("    });\n");
      out.write("\n");
      out.write("  </script>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
