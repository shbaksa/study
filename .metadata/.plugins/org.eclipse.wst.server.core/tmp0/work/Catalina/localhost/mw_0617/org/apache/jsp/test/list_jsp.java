/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.1
 * Generated at: 2022-06-17 08:27:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.test;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
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
      out.write("\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");

		// DB연결
		Class.forName("com.mysql.jdbc.Driver");
  		String db="jdbc:mysql://localhost:3306/first";
  		Connection conn=DriverManager.getConnection(db,"root","1234");
		
  		String sql = "set @count=0";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.executeUpdate();
		
		sql = "update gesipan set id=@count:=@count+1";
		pstmt = conn.prepareStatement(sql);
		pstmt.executeUpdate();
  		
		// 쿼리생성
		sql = "select * from gesipan";
		pstmt = conn.prepareStatement(sql);
		// 쿼리실행
		ResultSet rs = pstmt.executeQuery();
		
		
		
		
	
	
      out.write("\r\n");
      out.write("\t<style>\r\n");
      out.write("\ttable {\r\n");
      out.write("\t\tborder-top : 1px solid black;\r\n");
      out.write("\t\tfont-size : 13px;\r\n");
      out.write("\t\tborder-left : none;\r\n");
      out.write("\t\tborder-right : none;\r\n");
      out.write("\t\tborder-bottom : none;\r\n");
      out.write("\t}\r\n");
      out.write("\ttd {\r\n");
      out.write("\t\tborder-right : 1px solid black;\r\n");
      out.write("\t\tborder-top : 1px solid black;\r\n");
      out.write("\t}\r\n");
      out.write("\ttd:last-child {\r\n");
      out.write("\t\tborder-right : none;\r\n");
      out.write("\t}\r\n");
      out.write("\ttr {\r\n");
      out.write("\t\tborder-top : 1px solid black;\r\n");
      out.write("\t\tborder-bottom : 1px solid black;\r\n");
      out.write("\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<table width=\"800\" height=\"500\" align=\"center\">\r\n");
      out.write("\t<caption> <h1>게시판목록</h1> </caption>\r\n");
      out.write("\t<tr align=\"center\" style=\"background:lightgray;\">\r\n");
      out.write("\t<td style=\"border-top:none;\" width=\"100\"><b>작성자</b></td>\r\n");
      out.write("\t<td style=\"border-top:none;\" width=\"500\"><b>제 목</b></td>\r\n");
      out.write("\t<td style=\"border-top:none;\" width=\"80\"><b>조회수</b></td>\r\n");
      out.write("\t<td style=\"border-top:none;\" width=\"120\"><b>작성일</b></td>\t\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t");
while(rs.next()) { 
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>");
      out.print(rs.getString("name") );
      out.write("</td>\r\n");
      out.write("\t<td onclick=\"location='readnum.jsp?id=");
      out.print(rs.getInt("id"));
      out.write('\'');
      out.write('"');
      out.write('>');
      out.print(rs.getString("title") );
      out.write("</td>\r\n");
      out.write("\t<td align=\"center\">");
      out.print(rs.getString("readnum") );
      out.write("</td>\r\n");
      out.write("\t<td align=\"center\">");
      out.print(rs.getString("writeday") );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td colspan=\"4\" align=\"center\"><form method=\"post\" action=\"write.jsp\"> <input type=\"submit\" value=\"글쓰기\"> </form></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
 
rs.close();
pstmt.close();
conn.close();

      out.write('\r');
      out.write('\n');
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
