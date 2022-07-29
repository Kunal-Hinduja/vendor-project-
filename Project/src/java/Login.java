/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 91706
 */
public class Login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
       HttpSession session = request.getSession();
       
       String em = request.getParameter("em");
       String pas = request.getParameter("ps");
      
//       out.print(em);
//       out.print(pas);
       
       session.setAttribute("email", em);
       
       
        try{
              Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mainproject","root","");
            
            
            Statement st = con.createStatement();
            
            ResultSet rs = st.executeQuery("select * from vendor_register where Email='"+em+"'and Password='"+pas+"' and status = 1");
          //  rs.next();
           
           if(rs.next())
           {
                session.setAttribute("usert" , rs.getString(6));
                 session.setAttribute("userid", rs.getInt(1));
                  session.setAttribute("email", em);
         
               if(rs.getString("Email").equals("12108105.gvp@gujaratvidyapith.org") || rs.getString("Email").equals("12108114.gvp@gujaratvidyapith.org")){
               
                response.sendRedirect("VendorView.jsp");
             
               
               }
               else
               {

                            if(rs.getString(7)==null)
                        {
                            response.sendRedirect("Vendor_details.jsp");
                        }
                        else 
                        {
                              response.sendRedirect("VendorView.jsp");
                        }

               }
    
           }
           else
           {
             
              // response.sendRedirect("Login.html");
          out.print("<h1 style='color:red'>");     out.print("Worng id and password");  out.print("</h1>"); 
               RequestDispatcher d= request.getRequestDispatcher("Login.html");
               d.include(request, response);
               
               
           }
         

         
            
        }
        catch(Exception e)
        {
            out.print(e);
        }
     }
}