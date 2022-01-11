/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.56
 * Generated at: 2022-01-08 19:27:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jspsrc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.vo.*;
import java.util.ArrayList;

public final class writeView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("model.vo");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.ArrayList");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("	<meta charset=\"UTF-8\">\n");
      out.write("	<title>Responsive Navigation Bar</title>\n");
      out.write("	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("	<script src=\"https://kit.fontawesome.com/b99e675b6e.js\"></script>\n");
      out.write("	<link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/css/header.css\">\n");
      out.write("	<link rel=\"stylesheet\" href = \"");
      out.print( request.getContextPath() );
      out.write("/css/common.css\">\n");
      out.write("	   <link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/css/text2.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("	<div class=\"navbar\">\n");
      out.write("		<div class=\"inner_navbar\">\n");
      out.write("			<div class=\"logo\">\n");
      out.write("				<a href=\"#\">BL<span>IND</span></a>\n");
      out.write("					");

					String name = "Guest";
					boolean islogin = false;
					MemberVO vo = (MemberVO)session.getAttribute("logininfo") ;
					if(vo == null){
						name = "Guest";
					}else{
						name = vo.getMem_name();
						islogin = true;
					}
				
      out.write("\n");
      out.write("				<p>");
      out.print(name );
      out.write("님 안녕하세요!</p>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"menu\">\n");
      out.write("				<ul>\n");
      out.write("					<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/jspsrc/homeView.jsp\" >Home</a></li>\n");
      out.write("		            <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/jspsrc/aboutUsView.jsp\">About Us</a></li>\n");
      out.write("					<li><a href=\"#\" class = \"active\">Forum</a></li>\n");
      out.write("					<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/content?action=getmylist\">My Page</a></li>\n");
      out.write("									<li>              \n");
      out.write("			  ");

              		if(islogin){
      out.write("\n");
      out.write("              			<a href=\"/bbs/memberset?action=logout\">Logout</a>\n");
      out.write("              ");
 	}else{ 
      out.write("\n");
      out.write("              			<a href=\"");
      out.print( request.getContextPath() );
      out.write("/jspsrc/loginView.jsp\">Login</a>\n");
      out.write("            	  	\n");
      out.write("              ");
  }
              
      out.write("\n");
      out.write("            	</li>\n");
      out.write("				</ul>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("		<div class=\"hamburger\">\n");
      out.write("			<i class=\"fas fa-bars\"></i>\n");
      out.write("		</div>\n");
      out.write("        <div class=\"wrap-contact100\">\n");
      out.write("            <form class=\"contact100-form validate-form\" method=\"post\" action=\"/bbs/content\">\n");
      out.write("                <div class=\"wrap-input100 validate-input\" data-validate=\"Please enter your name\">\n");
      out.write("                    <input class=\"input100\" type=\"text\" name=\"title\" placeholder=\"한줄평을 적어주세요!\" required>\n");
      out.write("                    <span class=\"focus-input100\"></span>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"wrap-input100 validate-input\" data-validate = \"Please enter your message\">\n");
      out.write("                    <textarea class=\"input100\" name=\"advan\" placeholder=\"이 기업의 장점을 적어주세요\" required></textarea>\n");
      out.write("                    <span class=\"focus-input100\"></span>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"wrap-input100 validate-input\" data-validate = \"Please enter your message\">\n");
      out.write("                    <textarea class=\"input100\" name=\"disadvan\" placeholder=\"이 기업의 단점을 적어주세요\" required></textarea>\n");
      out.write("                    <span class=\"focus-input100\"></span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"star-ratings\">                    \n");
      out.write("                    <div class=\"star-rating space-x-4 mx-auto\">\n");
      out.write("                        <input type=\"radio\" id=\"5-stars\" name=\"rating\" value=\"5\" v-model=\"ratings\"/>\n");
      out.write("                        <label for=\"5-stars\" class=\"star pr-4\">★</label>\n");
      out.write("                        <input type=\"radio\" id=\"4-stars\" name=\"rating\" value=\"4\" v-model=\"ratings\"/>\n");
      out.write("                        <label for=\"4-stars\" class=\"star\">★</label>\n");
      out.write("                        <input type=\"radio\" id=\"3-stars\" name=\"rating\" value=\"3\" v-model=\"ratings\"/>\n");
      out.write("                        <label for=\"3-stars\" class=\"star\">★</label>\n");
      out.write("                        <input type=\"radio\" id=\"2-stars\" name=\"rating\" value=\"2\" v-model=\"ratings\"/>\n");
      out.write("                        <label for=\"2-stars\" class=\"star\">★</label>\n");
      out.write("                        <input type=\"radio\" id=\"1-star\" name=\"rating\" value=\"1\" v-model=\"ratings\" />\n");
      out.write("                        <label for=\"1-star\" class=\"star\">★</label>\n");
      out.write("                    </div>\n");
      out.write("                <div class=\"container-contact100-form-btn\">\n");
      out.write("                    <input class=\"contact100-form-btn\" type = \"hidden\" name = \"star\" value=script.rate>\n");
      out.write("                    <input class=\"contact100-form-btn\" type = \"hidden\" name = \"action\" value=\"write\">\n");
      out.write("                    <input class=\"contact100-form-btn\" type=\"submit\" value=\"upload\">\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("	</div>\n");
      out.write("</div>\n");
      out.write("<script src=\"http://code.jquery.com/jquery-latest.js\">\n");
      out.write("\n");
      out.write("        \n");
      out.write("	var $starEls = $('#star span.star');\n");
      out.write("	var rate = 0;\n");
      out.write("	\n");
      out.write("	$starEls.each(function (index, el) {\n");
      out.write("	    $(el).on('click', function () {\n");
      out.write("	        rating(index);\n");
      out.write("	    });\n");
      out.write("	});\n");
      out.write("	\n");
      out.write("	function rating(score) {\n");
      out.write("	    $starEls.each(function (i, el) {\n");
      out.write("	        if (i <= score) {\n");
      out.write("	            $(el).addClass('on');\n");
      out.write("	        } else {\n");
      out.write("	            $(el).removeClass('on');\n");
      out.write("	        }\n");
      out.write("	    });\n");
      out.write("	\n");
      out.write("	    rate = score + 1;\n");
      out.write("	}\n");
      out.write("    </script>\n");
      out.write("    <script src=\"");
      out.print( request.getContextPath() );
      out.write("/js/main.js\"></script>\n");
      out.write("</body>\n");
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