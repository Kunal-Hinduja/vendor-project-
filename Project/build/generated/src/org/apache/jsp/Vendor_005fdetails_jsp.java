package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.connection.*;
import java.sql.*;

public final class Vendor_005fdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    \n");
      out.write("  \n");
      out.write("     \n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <link href=\"Detailscss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("  <script>\n");
      out.write("\n");
      out.write("             $(document).ready(function() {\n");
      out.write("\n");
      out.write("        $(\"#state\").on(\"change\", function() {\n");
      out.write("\n");
      out.write("            var id = $(\"#state\").val();\n");
      out.write("\n");
      out.write("            if (id === \"\") {\n");
      out.write("                $(\"#error\").html(\"required\");\n");
      out.write("\n");
      out.write("                return false;\n");
      out.write("            }  else {\n");
      out.write("                $(\"#error\").html(\"\");\n");
      out.write("\n");
      out.write("                $.ajax({\n");
      out.write("\n");
      out.write("                    url: \"city.jsp\",\n");
      out.write("\n");
      out.write("                    data: {state: id},\n");
      out.write("\n");
      out.write("                    method: \"POST\",\n");
      out.write("\n");
      out.write("                    success: function(data)\n");
      out.write("\n");
      out.write("                    {\n");
      out.write("\n");
      out.write("                        $(\"#msg\").html(data);}});}}); });\n");
      out.write("\n");
      out.write("         \n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    <title>Vendor details Regisration Form </title> \n");
      out.write("</head>\n");
      out.write("<body onload=\" return disableSubmit();\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h1>Registration</h1>\n");
      out.write("\n");
      out.write("        <form action=\"Detailes\" method=\"post\" enctype='multipart/form-data' name=\"add1\" multiple=webkitdirectory=''>\n");
      out.write("            <div class=\"form first\">\n");
      out.write("                <div class=\"details personal\">\n");
      out.write("                    <span class=\"title\">Vendor Details</span>\n");
      out.write("\n");
      out.write("                    <div class=\"fields\">\n");
      out.write("                        <div class=\"input-field\">\n");
      out.write("                            <label>Company Name</label>\n");
      out.write("                            <input type=\"text\" placeholder=\"Enter your Company Name\" name=\"cm\" pattern=\"^[A-Z a-z]{2,50}$\" required >\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"input-field\" >\n");
      out.write("                            <label>Type of Company</label>\n");
      out.write("                            <select id=\"toc\" name=\"toc\" required>\n");
      out.write("                                <option disabled selected value=\"\">Select Company Type</option>\n");
      out.write("                                <option value=\"Public Limited co\">Public Limited co</option>\n");
      out.write("                                <option value=\"Partnership Co\">Partnership Co</option>\n");
      out.write("                                <option value=\"Proprietorship\">Proprietorship</option>\n");
      out.write("                                <option value=\"Proprietorship\">Proprietorship</option>\n");
      out.write("                                <option value=\"Govt. Sector\"> Govt. Sector</option>\n");
      out.write("                                <option value=\"others\"> others</option>\n");
      out.write("                            </select>\n");
      out.write("                           \n");
      out.write("                                    <script type=\"text/javascript\">\n");
      out.write("                                        function ddlValidate() {\n");
      out.write("                                            var e = document.getElementById(\"toc\");\n");
      out.write("                                            var e1 = document.getElementById(\"soc\");\n");
      out.write("                                            var e2 = document.getElementById(\"state\");\n");
      out.write("                                            var e3 = document.getElementById(\"ct\");\n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("                                            var optionSelIndex = e.options[e.selectedIndex].value;\n");
      out.write("                                            var optionSelIndex1 = e1.options[e1.selectedIndex].value;\n");
      out.write("                                            var optionSelIndex2 = e2.options[e2.selectedIndex].value;\n");
      out.write("                                            var optionSelIndex3 = e3.options[e3.selectedIndex].value;\n");
      out.write("                                            \n");
      out.write("                                           // var optionSelectedText = e.options[e.selectedIndex].text;\n");
      out.write("                                            if (optionSelIndex == 0) {\n");
      out.write("                                                alert(\"Please select a Type of Company\");\n");
      out.write("                                                return false;\n");
      out.write("                                            }\n");
      out.write("                                            else if(optionSelIndex1 == 0)\n");
      out.write("                                            {\n");
      out.write("                                                alert(\"Please select a Status of Company \");\n");
      out.write("                                                return false;\n");
      out.write("                                            }\n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("                                            else if(optionSelIndex2 == 0)\n");
      out.write("                                            {\n");
      out.write("                                                alert(\"Please select a state\");\n");
      out.write("                                                return false;\n");
      out.write("                                            }\n");
      out.write("                                            else if(optionSelIndex3 == 0)\n");
      out.write("                                            {\n");
      out.write("                                                alert(\"Please select a city\");\n");
      out.write("                                                return false;\n");
      out.write("                                            }\n");
      out.write("                                             \n");
      out.write("                                        }\n");
      out.write("                            \n");
      out.write("                            </script> \n");
      out.write("                                \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                         <div class=\"input-field\" >\n");
      out.write("                            <label>Status of Company</label>\n");
      out.write("                            <select required name=\"soc\" required>\n");
      out.write("                                <option disabled selected value=\"\">Select Company Type</option>\n");
      out.write("                                <option value=\"MANUFACTURER\">MANUFACTURER</option>\n");
      out.write("                                <option value=\"AUTHORISED DEALER\">AUTHORISED DEALER</option>\n");
      out.write("                                <option value=\"STOCKIST/TRADER\">STOCKIST/TRADER</option>\n");
      out.write("                                <option value=\"IMPORTER/INDIAN AGENT\">IMPORTER/INDIAN AGENT</option>\n");
      out.write("                                <option value=\"SERVICE PROVIDER\">SERVICE PROVIDER</option>\n");
      out.write("                                \n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"input-field\">\n");
      out.write("                            <label>Address</label>\n");
      out.write("                            <textarea id=\"add\" name=\"add\" rows=\"2\" cols=\"20\" required=\"required\">\n");
      out.write("                           \n");
      out.write("                            </textarea>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"input-field\" >\n");
      out.write("                            <label>State</label>\n");
      out.write("                            <select   id=\"state\" name=\"state\" >\n");
      out.write("                                <option value=\"\">select state</option>\n");
      out.write("                                ");

                                    
                         ResultSet rs = DatabaseConnection.getResultFromSqlQuery("select * from state_master where active = 1");
                                
      out.write("\n");
      out.write("                               ");
try{
      out.write("\n");
      out.write("                              ");
while(rs.next()){
      out.write("\n");
      out.write("                              <option value=\"");
out.print(rs.getInt(1));
      out.write('"');
      out.write('>');
out.print(rs.getString(2));
      out.write("</option>\n");
      out.write("                              ");
}}catch(Exception e){out.print(e);}
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"input-field\" id=\"msg\">\n");
      out.write("                            <label>City</label>\n");
      out.write("                             <select required name=\"ct\" id=\"ct\">\n");
      out.write("                                 <option value=\"\">select city</option>\n");
      out.write("                               \n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"input-field\">\n");
      out.write("                            <label>Pin code</label>\n");
      out.write("                            <input type=\"text\" placeholder=\"Enter your area pin code\" pattern=\"[0-9]{6}\" maxlength=\"6\" required name=\"pc\">\n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("                          <div class=\"input-field\">\n");
      out.write("                            <label>Mobile Number</label>\n");
      out.write("                            <input type=\"tel\" placeholder=\"Enter mobile number\" pattern=\"[0-9]{10}\" maxlength=\"10\" name=\"mn\" title=\"enter digit\" required>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                      \n");
      out.write("                <div class=\"details ID\">\n");
      out.write("                    <span class=\"title\">Bank Details</span>\n");
      out.write("\n");
      out.write("                    <div class=\"fields\">\n");
      out.write("                        <div class=\"input-field\">\n");
      out.write("                            <label>Bank Name:</label>\n");
      out.write("                            <input type=\"text\" placeholder=\"Enter Bank Name\" name=\"bn\" pattern=\"^[A-Z a-z]{5,50}$\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"input-field\">\n");
      out.write("                            <label>Bank Branch:</label>\n");
      out.write("                            <input type=\"text\" placeholder=\"Enter Bank Branch\" name=\"bb\" pattern=\"^[A-Za-z]{2,50}$\" required>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <div class=\"input-field\">\n");
      out.write("                            <label>Bank Benificial Name:</label>\n");
      out.write("                            <input type=\"tel\" placeholder=\"Enter Bank Benificial Name\" name=\"bbn\" pattern=\"^[A-Za-z]{2,50}$\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"input-field\">\n");
      out.write("                            <label>Account No:</label>\n");
      out.write("                            <input type=\"tel\" placeholder=\"Enter Account Number\" name=\"ac\" required>\n");
      out.write("                        </div>\n");
      out.write("                            \n");
      out.write("                        \n");
      out.write("\n");
      out.write("                      <div class=\"input-field\">\n");
      out.write("                            <label>IFSC Code:</label>\n");
      out.write("                            <input type=\"text\" placeholder=\"Enter Bank account IFSC code\" id=\"ifsc\" name=\"ic\" pattern=\"^[A-Z]{4}[0][A-Z0-9]{6}$\" required>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                         <div class=\"input-field\">\n");
      out.write("                            <label>PanCard no:</label>\n");
      out.write("                            <input type=\"tel\" placeholder=\"Enter Pan card no\" name=\"pan\" id=\"pan\" pattern=\"^[0-9]{10}$\" required>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"input-field\">\n");
      out.write("                            <label>GST no:</label>\n");
      out.write("                            <input type=\"tel\" placeholder=\"Enter GST no\" name=\"gst\" id=\"gst\" pattern=\"^[0-9]{10}$\" required>\n");
      out.write("                        </div>\n");
      out.write("                          <div class=\"input-field\">\n");
      out.write("                            <label>Bank cheque no:</label>\n");
      out.write("                            <input type=\"tel\" placeholder=\"Enter GST no\" name=\"cheque\" id=\"cheque\" pattern=\"^[0-9]{10}$\" required>\n");
      out.write("                        </div>\n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"details ID\">\n");
      out.write("                    <span class=\"title\">Document</span>\n");
      out.write("\n");
      out.write("                    <div class=\"fields\">\n");
      out.write("                        <div class=\"Button-field\">\n");
      out.write("                            <label>Pand card:</label>\n");
      out.write("                            <input type=\"File\" placeholder=\"Enter Bank Name\" name=\"panp\" required>\n");
      out.write("                        </div>\n");
      out.write("                            \n");
      out.write("                        <div class=\"Button-field\">\n");
      out.write("                            <label>Bank cheque :</label>\n");
      out.write("                            <input type=\"file\" placeholder=\"Enter Bank Branch\" name=\"chequep\" required>\n");
      out.write("                        </div>\n");
      out.write("                                                          \n");
      out.write("                        <div class=\"Button-field\">\n");
      out.write("                            <label>Pass Book:</label>\n");
      out.write("                            <input type=\"file\" placeholder=\"Enter Account Number\" name=\"passp\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"Button-field\">\n");
      out.write("                            <label>Gst no:</label>\n");
      out.write("                            <input type=\"file\" required name=\"gstp\">\n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("                    <br/>\n");
      out.write("                    \n");
      out.write("                    <script>\n");
      out.write("                         function callrt()\n");
      out.write("                       {\n");
      out.write("                           \n");
      out.write("                            if(document.getElementById(\"terms\").checked==true)\n");
      out.write("                            {\n");
      out.write("                                \n");
      out.write("                                   document.getElementById(\"btn\").disabled = false;\n");
      out.write("                            }\n");
      out.write("                            else\n");
      out.write("                            {\n");
      out.write("                               document.getElementById(\"btn\").disabled = true;\n");
      out.write("                            }\n");
      out.write("                         \n");
      out.write("                          \n");
      out.write("                       }\n");
      out.write("                         function disableSubmit() {\n");
      out.write("                                document.getElementById(\"submit\").disabled = true;\n");
      out.write("                               }\n");
      out.write("                        \n");
      out.write("                        </script>\n");
      out.write("                        <input type=\"checkbox\" name=\"terms\" id=\"terms\" onchange=\"return callrt()\">  I Agree Terms & Coditions \n");
      out.write("                    <br/>\n");
      out.write("                    <br/>\n");
      out.write("                    \n");
      out.write("                    <input type=\"submit\" style=\"height:50px;width:150px;background-color:red;font-size:20px;color:lightwhite\"  id=\"btn\" disabled=\"disabled\">\n");
      out.write("                       \n");
      out.write("                         <span class=\"btnText\"  onclick=\" return ddlValidate();\" > </span>\n");
      out.write("                    \n");
      out.write("                  <i class=\"uil uil-navigator\"></i>\n");
      out.write("                  \n");
      out.write("                        \n");
      out.write("                       \n");
      out.write("\n");
      out.write("                    \n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("\n");
      out.write("          \n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("   \n");
      out.write("</body>\n");
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
