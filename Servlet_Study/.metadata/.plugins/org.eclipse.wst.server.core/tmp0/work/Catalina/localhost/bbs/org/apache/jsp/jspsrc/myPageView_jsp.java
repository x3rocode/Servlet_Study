/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.56
 * Generated at: 2022-01-10 06:02:15 UTC
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

public final class myPageView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("	<link rel=\"stylesheet\" href = \"");
      out.print( request.getContextPath() );
      out.write("/css/forum2.css\">\n");
      out.write("	<link rel=\"stylesheet\" href = \"");
      out.print( request.getContextPath() );
      out.write("/css/text2.css\">\n");
      out.write("	<link rel=\"stylesheet\" href = \"");
      out.print( request.getContextPath() );
      out.write("/css/search.css\">\n");
      out.write("	<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("	<div class=\"navbar\">\n");
      out.write("		<div class=\"inner_navbar\">\n");
      out.write("				<div class=\"logo\">\n");
      out.write("				<a href=\"#\">BL<span>IND</span></a>\n");
      out.write("					");

				String name = "Guest";
				boolean islogin = false;
				int isadmin = 0;
				MemberVO vo = (MemberVO)session.getAttribute("logininfo") ;
				if(vo == null){
					name = "Guest";
				}else{
					name = vo.getMem_name();
					islogin = true;
					if(vo.getMem_isadmin() == 1){
						isadmin = 1;
					}
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
      out.write("              		<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/jspsrc/aboutUsView.jsp\">About Us</a></li>\n");
      out.write("           	  		<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/content?action=getalllist\">Forum</a></li>\n");
      out.write("					<li><a href=\"#\" class = \"active\">My Page</a></li>\n");
      out.write("					<li>              \n");
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
      out.write("			<div class=\"s003\">\n");
      out.write("				<form method = \"get\" action =\"/bbs/content\" id = \"searc\">\n");
      out.write("				        <div class=\"inner-form\">\n");
      out.write("				          <div class=\"input-field first-wrap\">\n");
      out.write("				            <div class=\"input-select\">\n");
      out.write("				              <select data-trigger=\"\" name=\"sername\">\n");
      out.write("				                <option placeholder=\"\">검색 필터</option>\n");
      out.write("				                <option value=\"회사명\">회사명검색</option>\n");
      out.write("				                <option value=\"한줄평\">한줄평검색</option>\n");
      out.write("				                <option value=\"장단점\">내용검색</option>\n");
      out.write("				              </select>\n");
      out.write("				            </div>\n");
      out.write("				          </div>\n");
      out.write("				          <div class=\"input-field second-wrap\">\n");
      out.write("				            <input id=\"search\" type=\"search\" name = \"keyword\" placeholder=\"검색어를 입력하세요!\" />\n");
      out.write("				          </div>\n");
      out.write("				          <div class=\"input-field third-wrap\" >\n");
      out.write("				           <button class=\"btn-search\" type=\"button|submit\">\n");
      out.write("				              <svg class=\"svg-inline--fa fa-search fa-w-16\" aria-hidden=\"true\" data-prefix=\"fas\" data-icon=\"search\" role=\"img\" xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 512 512\" >\n");
      out.write("				                <path fill=\"currentColor\" d=\"M505 442.7L405.3 343c-4.5-4.5-10.6-7-17-7H372c27.6-35.3 44-79.7 44-128C416 93.1 322.9 0 208 0S0 93.1 0 208s93.1 208 208 208c48.3 0 92.7-16.4 128-44v16.3c0 6.4 2.5 12.5 7 17l99.7 99.7c9.4 9.4 24.6 9.4 33.9 0l28.3-28.3c9.4-9.4 9.4-24.6.1-34zM208 336c-70.7 0-128-57.2-128-128 0-70.7 57.2-128 128-128 70.7 0 128 57.2 128 128 0 70.7-57.2 128-128 128z\"></path>\n");
      out.write("				              </svg>\n");
      out.write("				            </button>\n");
      out.write("				          </div>\n");
      out.write("				        </div>\n");
      out.write("				      </form>\n");
      out.write("				  </div>\n");
      out.write("	</div>	\n");
      out.write("	<div class=\"limiter\" >\n");
      out.write("		<div class=\"container-table100\">\n");
      out.write("				<div class=\"wrap-table100\">\n");
      out.write("					<div class=\"table100\">\n");
      out.write("						\n");
      out.write("				");
 
					ArrayList<ContentVO> list =(ArrayList<ContentVO>)session.getAttribute("forumlist");
				   if(list !=null){
				
      out.write(" \n");
      out.write("				<table>\n");
      out.write("					<thead>\n");
      out.write("						<tr class=\"table100-head\">\n");
      out.write("							<th class=\"column1\">회사명</th>\n");
      out.write("							<th class=\"column2\">한줄평</th>\n");
      out.write("							<th class=\"column3\">작성시간</th>\n");
      out.write("							<th class=\"column4\">조회수</th>\n");
      out.write("						</tr>\n");
      out.write("					</thead>\n");
      out.write("				<tbody>\n");
      out.write("					");
for(ContentVO cvo:list){
      out.write("\n");
      out.write("				  <tr class = tble>\n");
      out.write("				      <td class=\"column1\">");
      out.print( cvo.getCon_company() );
      out.write("</td>\n");
      out.write("              		  <td class=\"column2\"><a href = \"/bbs/content?num=");
      out.print(cvo.getNum());
      out.write("&action=read\">");
      out.print( cvo.getCon_title() );
      out.write("</a></td>\n");
      out.write("				      <td class=\"column3\">");
      out.print( cvo.getCon_date() );
      out.write("</td>\n");
      out.write("				      <td class=\"column4\">");
      out.print( cvo.getCon_cnt() );
      out.write("</td>\n");
      out.write("				   </tr>\n");
      out.write("				   ");
} 
      out.write("\n");
      out.write("				 \n");
      out.write("				  </tbody>\n");
      out.write("			   </table>\n");
      out.write("			    <div class = \"paging\">\n");
      out.write("			   	<nav>\n");
      out.write("					<ul class=\"pagination pagination-seperated \"></ul>\n");
      out.write("				</nav>\n");
      out.write("			   </div>\n");
      out.write("				   ");
}else{ 
      out.write("\n");
      out.write("				      <h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("				   ");

				   }
				   
      out.write(" \n");
      out.write("\n");
      out.write("					");

              		if(islogin){
      out.write("\n");
      out.write("              	   <div class=\"container-contact100-form-btn\" >\n");
      out.write("						<input class=\"contact100-form-btn\" type = \"submit\" name = \"action\" value=\"write\"  onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/jspsrc/writeView.jsp'\" >\n");
      out.write("						");
if(isadmin == 1){
      out.write("\n");
      out.write("						<input class=\"contact100-form-btn\" type = \"submit\" value=\"파일 내보내기\" onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/memberset?action=getallmemlist'\">\n");
      out.write("              			");
 	}
      out.write("\n");
      out.write("\n");
      out.write("					</div>\n");
      out.write("              ");
 	}
      out.write("\n");
      out.write("              \n");
      out.write("\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("				\n");
      out.write("		</div>\n");
      out.write("	\n");
      out.write("	</div>\n");
      out.write("</div>\n");
      out.write("	\n");
      out.write("<script src=\"js/extention/choices.js\"></script>\n");
      out.write("<script src=\"");
      out.print( request.getContextPath() );
      out.write("/js/main.js\"></script>\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("const choices = new Choices('[data-trigger]',\n");
      out.write("	      {\n");
      out.write("	        searchEnabled: false,\n");
      out.write("	        itemSelectText: '',\n");
      out.write("	      });\n");
      out.write("	      \n");
      out.write("	     \n");
      out.write("function pagination() {\n");
      out.write("	var req_num_row = 10; \n");
      out.write("	var $tr = jQuery('.tble'); \n");
      out.write("	var total_num_row = $tr.length;\n");
      out.write("	var num_pages = 0;\n");
      out.write("	if (total_num_row % req_num_row == 0) {\n");
      out.write("		num_pages = total_num_row / req_num_row;\n");
      out.write("	}\n");
      out.write("	if (total_num_row % req_num_row >= 1) {\n");
      out.write("		num_pages = total_num_row / req_num_row;\n");
      out.write("		num_pages++;\n");
      out.write("		num_pages = Math.floor(num_pages++);\n");
      out.write("	}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("	for (var i = 1; i <= num_pages; i++) {\n");
      out.write("		jQuery('.pagination').append('<li class=\"page-item \"><a class=\"page-link\" href=\"#\">' + i + '</a></li>');\n");
      out.write("		jQuery('.pagination li:nth-child(2)').addClass(\"active\");\n");
      out.write("		jQuery('.pagination a').addClass(\"pagination-link\");\n");
      out.write("	}\n");
      out.write("\n");
      out.write("\n");
      out.write("	$tr.each(function(i) {\n");
      out.write("		jQuery(this).hide();\n");
      out.write("		if (i + 1 <= req_num_row) {\n");
      out.write("			$tr.eq(i).show();\n");
      out.write("		}\n");
      out.write("	});\n");
      out.write("\n");
      out.write("	jQuery('.pagination a').click('.pagination-link', function(e) {\n");
      out.write("		e.preventDefault();\n");
      out.write("		$tr.hide();\n");
      out.write("		var page = jQuery(this).text();\n");
      out.write("		var temp = page - 1;\n");
      out.write("		var start = temp * req_num_row;\n");
      out.write("		var current_link = temp;\n");
      out.write("\n");
      out.write("		jQuery('.pagination li').removeClass(\"active\");\n");
      out.write("		jQuery(this).parent().addClass(\"active\");\n");
      out.write("\n");
      out.write("		for (var i = 0; i < req_num_row; i++) {\n");
      out.write("			$tr.eq(start + i).show();\n");
      out.write("		}\n");
      out.write("\n");
      out.write("		if (temp >= 1) {\n");
      out.write("			jQuery('.pagination li:first-child').removeClass(\"disabled\");\n");
      out.write("		} else {\n");
      out.write("			jQuery('.pagination li:first-child').addClass(\"disabled\");\n");
      out.write("		}\n");
      out.write("\n");
      out.write("	});\n");
      out.write("\n");
      out.write("	jQuery('.prev').click(function(e) {\n");
      out.write("		e.preventDefault();\n");
      out.write("		jQuery('.pagination li:first-child').removeClass(\"active\");\n");
      out.write("	});\n");
      out.write("\n");
      out.write("	jQuery('.next').click(function(e) {\n");
      out.write("		e.preventDefault();\n");
      out.write("		jQuery('.pagination li:last-child').removeClass(\"active\");\n");
      out.write("	});\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("jQuery('document').ready(function() {\n");
      out.write("	pagination();\n");
      out.write("\n");
      out.write("	jQuery('.pagination li:first-child').addClass(\"disabled\");\n");
      out.write("\n");
      out.write("});\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("	\n");
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