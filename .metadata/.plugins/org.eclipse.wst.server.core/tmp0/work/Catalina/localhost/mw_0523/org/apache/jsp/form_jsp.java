/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.1
 * Generated at: 2022-05-23 07:36:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body> <!-- form.jsp  -->\r\n");
      out.write("\t<!-- 사용자로부터 키보드,마우스로 값을 입력받는 태크  -->\r\n");
      out.write("\t<form>\r\n");
      out.write("\t<!-- 키보드로 입력하는 양식  -->\r\n");
      out.write("\t<input type=\"text\"> <p>\r\n");
      out.write("\t<input type=\"password\"> <p>\r\n");
      out.write("\t<textarea cols=\"30\" rows=\"4\"></textarea><p>\r\n");
      out.write("\t<!-- 마우스로 선택하는 양식  -->\r\n");
      out.write("\t<input type=\"radio\" name=\"food\"> <!-- 동일한 이름을 가진 라디오는 하나만 선택가능  -->\r\n");
      out.write("\t<input type=\"radio\" name=\"food\"> \r\n");
      out.write("\t<input type=\"radio\" name=\"food\"> \r\n");
      out.write("\t<input type=\"radio\" name=\"food\"> \r\n");
      out.write("\t<p>\r\n");
      out.write("\t<input type=\"checkbox\" name=\"hobby\"> <!-- 복수 선택 가능  -->\r\n");
      out.write("\t<input type=\"checkbox\" name=\"hobby\">\r\n");
      out.write("\t<input type=\"checkbox\" name=\"hobby\">\r\n");
      out.write("\t<input type=\"checkbox\" name=\"hobby\">\r\n");
      out.write("\t<p>\r\n");
      out.write("\t<select >\r\n");
      out.write("\t\t<option> 선 택 </option>\r\n");
      out.write("\t\t<option> 짜장면 </option>\r\n");
      out.write("\t\t<option> 우동 </option>\r\n");
      out.write("\t\t<option> 탕수욕 </option>\r\n");
      out.write("\t\t<option> 팔보채 </option>\t\t\r\n");
      out.write("\t</select>\r\n");
      out.write("\t<p>\r\n");
      out.write("\t<!-- 파일선택 -->\r\n");
      out.write("\t<input type=\"file\"> <p>\r\n");
      out.write("\t<!-- 버튼 모양  -->\r\n");
      out.write("\t<input type=\"button\" value=\"클릭\"><p>\r\n");
      out.write("\t<!-- 주로 자바스크립트 함수호출 -->\r\n");
      out.write("\t<input type=\"submit\" value=\"전송\"><p>\r\n");
      out.write("\t<input type=\"image\" src=\"1.jpg\" width=\"90\"><p>  <!-- image, reset 은 요즘 잘안쓴다 스타일시트가 너무 잘되있어서  -->\r\n");
      out.write("\t<!-- 현재 사용자가 입력한 내용 서버로 전송하는 역할 -->\r\n");
      out.write("\t<input type=\"reset\" value=\"취소\"><p> \r\n");
      out.write("\t<!-- 현재 폼에 입력된 값들을 초기화 -->\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 브라우저에 표시 되지 않는 양식 -->\r\n");
      out.write("\t<input type=\"hidden\" value=\"ddd\">\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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