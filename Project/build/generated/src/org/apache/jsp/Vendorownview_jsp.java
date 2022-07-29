package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Vendorownview_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"Vendorviewcss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("     \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("       <a  href=\"#default\" class=\"logo\">Welcome</a>\n");
      out.write("       \n");
      out.write("       <div class=\"header-right\">\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    <a class=\"active\" href=\"Logout.jsp\">Log Out</a>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("       \n");
      out.write("        ");
 
            try{
            if(session.getAttribute("email")==null){response.sendRedirect("Login.html");}
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mainproject","root","");
            Statement stmt=cn.createStatement();
            ResultSet rs=stmt.executeQuery("select * from vendor_register where email ='"+session.getAttribute("email")+"'");
            rs.next();
            
            
            
          
        
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <center><h1>Hello  ");
out.print(rs.getString(2));
      out.write("</h1></center>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("     \n");
      out.write("        <center>\n");
      out.write("            <div class=\"container\">\n");
      out.write("             <style>\n");
      out.write("                 .container{\n");
      out.write("                        height: 500px;\n");
      out.write("                        width: 800px;\n");
      out.write("                     \n");
      out.write("                 } \n");
      out.write("                 \n");
      out.write("             </style>\n");
      out.write("            <table class=\"table table-striped\" border=\"2\">\n");
      out.write("               \n");
      out.write("                <tr><th>user_id:</th> <td>");
out.print(rs.getInt(1));
      out.write("</td></tr><td><a href=\"\">update</a></td>\n");
      out.write("                   <tr> <th>FirstName:</th><td>");
out.print(rs.getString(2));
      out.write("</td></tr>\n");
      out.write("                   <tr><th>LastName:</th><td>");
out.print(rs.getString(3));
      out.write("</td></tr>\n");
      out.write("                   <tr> <th>Email:</th><td>");
out.print(rs.getString(4));
      out.write("</td></tr>\n");
      out.write("                   <tr> <th>Password:</th><td>");
out.print(rs.getString(5));
      out.write("</td></tr>\n");
      out.write("                   <tr> <th>usertype:</th><td>");
out.print(rs.getString(6));
      out.write("</td></tr>\n");
      out.write("                   <tr><th>CompanyName:</th><td>");
out.print(rs.getString(7));
      out.write("</td></tr>\n");
      out.write("                   <tr> <th>TypeOfFirm:</th><td>");
out.print(rs.getString(8));
      out.write("</td></tr>\n");
      out.write("                   <tr> <th>StatusOfCompany:</th><td>");
out.print(rs.getString(9));
      out.write("</td></tr>\n");
      out.write("                   <tr> <th>Address:</th><td>");
out.print(rs.getString(10));
      out.write("</td></tr>\n");
      out.write("                   <tr> <th>StateID:</th><td>");
out.print(rs.getString(11));
      out.write("</td></tr>\n");
      out.write("                   <tr> <th>CityID:</th><td>");
out.print(rs.getString(12));
      out.write("</td></tr>\n");
      out.write("                   <tr> <th>PinCode:</th><td>");
out.print(rs.getString(13));
      out.write("</td></tr>\n");
      out.write("                   <tr> <th>BankName:</th><td>");
out.print(rs.getString(14));
      out.write("</td></tr>\n");
      out.write("                   <tr> <th>BankBranch:</th><td>");
out.print(rs.getString(15));
      out.write("</td></tr>\n");
      out.write("                   <tr> <th>AccountNo:</th><td>");
out.print(rs.getString(16));
      out.write("</td></tr>\n");
      out.write("                   <tr> <th>PanNo:</th><td>");
out.print(rs.getString(17));
      out.write("</td></tr>\n");
      out.write("                   <tr> <th>GstNo:</th><td>");
out.print(rs.getString(18));
      out.write("</td></tr>\n");
      out.write("                   <tr> <th>IFSCcode:</th><td>");
out.print(rs.getString(19));
      out.write("</td></tr>\n");
      out.write("                   <tr> <th>MobileNo:</th><td>");
out.print(rs.getString(20));
      out.write("</td></tr>\n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("              \n");
      out.write("            </table>\n");
      out.write("            </div>    \n");
      out.write("                    \n");
      out.write("                ");

                    }
             catch(Exception e)
            {
                out.print(e);
            }
                
      out.write("\n");
      out.write("                \n");
      out.write("\n");
      out.write("        </center>\n");
      out.write("        \n");
      out.write(" </body>\n");
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
