/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.1
 * Generated at: 2022-06-21 00:30:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.qna_005fm;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");

	
	Class.forName("com.mysql.jdbc.Driver");
	String db="jdbc:mysql://localhost:3306/first";
	Connection conn=DriverManager.getConnection(db,"root","1234");
	
	String sql ="select * from qna order by grp asc , seq asc";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	ResultSet rs = pstmt.executeQuery();

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>QnA</title>\r\n");
      out.write("<style>\r\n");
      out.write("\tcaption {\r\n");
      out.write("\t\tborder-top : 1px solid black;\r\n");
      out.write("\t\tborder-bottom : 1px solid black;\r\n");
      out.write("\t\tfont-size : 64px;\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\ttr:frist-child > td {\r\n");
      out.write("\t\tborder-bottom : 1px solid black;\r\n");
      out.write("\t}\r\n");
      out.write("\t#tr1  {\r\n");
      out.write("\t\tborder-bottom 1px solid black;\r\n");
      out.write("\t}\r\n");
      out.write("\ttable {\r\n");
      out.write("\t\tfont-size : 13px;\r\n");
      out.write("\t}\r\n");
      out.write("\t/* tr:last-child > td {\r\n");
      out.write("\t\tborder-bottom : 1px solid black;\r\n");
      out.write("\t\tborder-top : 1px solid black;\r\n");
      out.write("\t} */\r\n");
      out.write("\t /* #deldel{\r\n");
      out.write("\t\tvisibility : hidden; \r\n");
      out.write("\t\t}\r\n");
      out.write("\t */\r\n");
      out.write("\t\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction view() {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar pepsii = document.getElementById(\"deldel\").style.visibility;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(pepsii == \"hidden\")\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"deldel\").style.visibility=\"visible\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\telse if(pepsii == \"visible\")\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"deldel\").style.visibility=\"hidden\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tfunction view1(n){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar pepsi = document.getElementById(\"del\"+n).style.visibility;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(pepsi == \"hidden\") {\r\n");
      out.write("\t\t\tdocument.getElementById(\"del\"+n).style.visibility=\"visible\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse if(pepsi == \"visible\") {\r\n");
      out.write("\t\t\tdocument.getElementById(\"del\"+n).style.visibility=\"hidden\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\tadfadsfadsfads\r\n");
      out.write("\t\r\n");
      out.write("\tadfadfasdfdsafad\r\n");
      out.write("\t\r\n");
      out.write("\t<table width=\"1000\" align=\"center\">\r\n");
      out.write("\t<caption  onclick=\"view()\"><b>QnA</b></caption>\r\n");
      out.write("\t<tr id=\"deldel\" style=\"visibility:hidden\">\r\n");
      out.write("\t<form name=\"pkc\" method=\"post\" action=\"write.jsp\">\r\n");
      out.write("\t<td colspan=\"8\" align=\"center\">\r\n");
      out.write("\t<input type=\"text\" name=\"title\" size=\"40\" placeholder=\"제목작성\">\t\r\n");
      out.write("\t<input type=\"text\" name=\"name\" placeholder=\"작성자\">\r\n");
      out.write("\t<input type=\"password\" name=\"pwd\" placeholder=\"비밀번호\">\r\n");
      out.write("\t<input type=\"submit\" value=\"질문글작성\"></td>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr id=\"tr1\">\t\r\n");
      out.write("\t<td width=\"300\" colsapn=\"2\">제목</td>\t\r\n");
      out.write("\t<td>작성자</td>\r\n");
      out.write("\t<td>추천</td>\r\n");
      out.write("\t<td>작성일</td>\t\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t");
while(rs.next()) { 
	String str="";
	if(rs.getInt("depth")!=1){
		for(int i=1;i<rs.getInt("depth");i++){
			str=str+"&nbsp;&nbsp;";
		}
		str=str+"ㄴ";
	}
	
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>");
      out.print(str);
      out.print(rs.getString("title") );
      out.write("</td>\t\r\n");
      out.write("\t<td>");
      out.print(rs.getString("name") );
      out.write("</td>\t\r\n");
      out.write("\t<td>");
      out.print(rs.getString("readnum") );
      out.write("</td>\r\n");
      out.write("\t<td>");
      out.print(rs.getString("writeday") );
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("\t<td><input type=\"button\" onclick=\"view1(");
      out.print(rs.getInt("id"));
      out.write(")\" value=\"댓글달기\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<form method=\"post\" action=\"rewrite.jsp\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"grp\" value=\"");
      out.print(rs.getInt("grp"));
      out.write("\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"depth\" value=\"");
      out.print(rs.getInt("depth"));
      out.write("\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"seq\" value=\"");
      out.print(rs.getInt("seq"));
      out.write("\">\r\n");
      out.write("\t<tr style=\"visibility:hidden\" id=\"del");
      out.print(rs.getInt("id"));
      out.write("\">\t\t\r\n");
      out.write("\t<td colspan=\"2\"><input type=\"text\" name=\"title\" placeholder=\"제목\"></td>\r\n");
      out.write("\t<td><input type=\"text\" name=\"name\" placeholder=\"작성자\"></td>\r\n");
      out.write("\t<td><input type=\"password\" name=\"pwd\" placeholder=\"비밀번호\"></td>\r\n");
      out.write("\t<td><input type=\"submit\" value=\"댓글작성\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
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