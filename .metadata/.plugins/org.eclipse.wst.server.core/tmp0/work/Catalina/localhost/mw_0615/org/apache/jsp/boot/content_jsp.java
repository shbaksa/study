/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.1
 * Generated at: 2022-06-15 08:29:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.boot;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write(" <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\r\n");
      out.write("<style>\r\n");
      out.write("\t#del { \r\n");
      out.write("\t\tdisplay : none;\r\n");
      out.write("\t}\r\n");
      out.write("\ttable {\r\n");
      out.write("\t\theight : 100%;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction view(n) {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tdocument.getElementById(\"del\").style.display=\"table-row\";\r\n");
      out.write("\t\tif(n==0){\r\n");
      out.write("\t\t\tdocument.pkc.action=\"update.jsp\";\r\n");
      out.write("\t\t\tdocument.pkc.submit.value=\"수정\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse{\r\n");
      out.write("\t\t\tdocument.pkc.action=\"delete.jsp\";\r\n");
      out.write("\t\t\tdocument.pkc.submit.value=\"삭제\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t");

	if(request.getParameter("chk") != null) // update_ok에서 이동시 chk값이 존재한다.
	{
	
      out.write("\t\t\r\n");
      out.write("\talert(\"비밀번호가 틀렸습니다\");\t\r\n");
      out.write("\t");
		
	}
	
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");

	
	// DB연결
	Class.forName("com.mysql.jdbc.Driver");
	String db = "jdbc:mysql://localhost:3306/first";
	Connection conn = DriverManager.getConnection(db, "root", "1234");
	
	// request
	String id = request.getParameter("id"); // board2테이블의 id값
	
	// 쿼리생성
	String sql = "select * from board2 where id=?";
	
	// 심부름꾼 생성
	PreparedStatement pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, id);
	
	// 쿼리실행 => resultset
	ResultSet rs =  pstmt.executeQuery();
	rs.next();	
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<table class=\"table table-bordered\" width=\"600\" height=\"1000\" >\r\n");
      out.write("\t<thead>\r\n");
      out.write("\t<td colspan=\"4\" align=\"center\"> 자유게시판 </td>\r\n");
      out.write("\t</thead>\r\n");
      out.write("\t<tbody>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<th scope=\"row\" width=\"100\" > <b>제목</b> </th> <!-- 3 -->\r\n");
      out.write("\t<td colspan=\"2\"> ");
      out.print(rs.getString("title") );
      out.write(" </td>\r\n");
      out.write("\t<td align=\"right\"> <button type=\"button\" class=\"btn btn-secondary\" onclick=\"view(0)\" id=\"csh\" >수정</button></td>\t\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<th scope=\"row\" > <b>이름</b> </th> <!-- 4 -->\r\n");
      out.write("\t<td > ");
      out.print(rs.getString("name"));
      out.write(" </td>\r\n");
      out.write("\t<td > <b>지역</b> </td>\t\r\n");
      out.write("\t");
 String area;
	switch(rs.getInt("area")) { 
	case 0 : area="서울"; break; 
	case 1 : area="경기"; break;
	case 2 : area="강원"; break;
	case 3 : area="충청"; break;
	case 4 : area="전라"; break;	
	case 5 : area="경상"; break;	
	case 6 : area="제주"; break;	
	default : area="???";
	} 
      out.write("\r\n");
      out.write("\t<td> ");
      out.print(area );
      out.write("  </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr> <!-- 4 -->\r\n");
      out.write("\t<th scope=\"row\"> <b>조회수</b> </th>\r\n");
      out.write("\t<td > ");
      out.print(rs.getString("readnum") );
      out.write(" </td>\t\r\n");
      out.write("\t<td> <b>작성일</b> </td>\r\n");
      out.write("\t<td > ");
      out.print(rs.getString("writeday") );
      out.write(" </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr height=\"600\"> <!-- 2 -->\r\n");
      out.write("\t<th scope=\"row\"  > <b>내용</b> </th>\r\n");
      out.write("\t<td colspan=\"3\">");
      out.print(rs.getString("content").replace("\r\n","<br>") );
      out.write("/td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<th scope=\"row\" > <b>공개여부</b> </th> <!-- 3 -->\r\n");
      out.write("\t<td colspan=\"2\"> ");
switch(rs.getInt("bimil")){
		case 0 :  
      out.write(" 공개글 ");
 break;
		case 1 :  
      out.write(" 비밀글 ");
 break;	
		}
      out.write(" </td>\r\n");
      out.write("\t<td align=\"right\" > <button type=\"button\" class=\"btn btn-secondary\" onclick=\"view(1)\" id=\"csh\">삭제</button></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</tbody>\r\n");
      out.write("\t<tfoot>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<th scope=\"row\">비고</th>\r\n");
      out.write("\t\r\n");
      out.write("\t<td align=\"right\" colspan=\"3\"> <button type=\"button\" class=\"btn btn-secondary\" >목록</button> </td>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<tr id=\"del\">\t\r\n");
      out.write("\t<td colspan=\"4\" align=\"center\"> <form name=\"pkc\" method=\"post\" action=\"\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"id\" value=\"");
      out.print(id);
      out.write("\">\r\n");
      out.write("\t비밀번호 <input type=\"password\" name=\"pwd\"> <input type=\"submit\" name=\"submit\" value=\"\"></form>  </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t</tfoot>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t<!-- 댓글관련 -->\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<table width=\"600\" class=\"table table-bordered\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\r\n");
      out.write("\t<form method=\"post\" action=\"dat_write_ok.jsp\"> \r\n");
      out.write("\t<input type=\"hidden\" name=\"bid\" value=\"");
      out.print(id );
      out.write("\"> <!-- 댓글을 달 board2 글의 id -->\r\n");
      out.write("\t<td width=\"90\"> <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"닉네임\" size=\"1\"> </td>\r\n");
      out.write("\t \r\n");
      out.write("\t<td><textarea class=\"form-control\" id=\"exampleFormControlTextarea1\" rows=\"3\" placeholder=\"댓글 입력창\"></textarea>\r\n");
      out.write("\t<td width=\"120\"><input type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"Password\" size=\"2\"></td>\r\n");
      out.write("\t<td width=\"90\"><button type=\"submit\" class=\"btn btn-secondary\">입력</button></td></form>\r\n");
      out.write("\t\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");

pstmt.close();
conn.close();
      out.write("\t\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\r\n");
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