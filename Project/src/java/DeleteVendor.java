/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.email.durgesh.Email;



/**
 *
 * @author 91706
 */
public class DeleteVendor extends HttpServlet {

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
        
     
        
       int id =Integer.parseInt(request.getParameter("id"));
       String nm = request.getParameter("nm");
       String ln = request.getParameter("ln");
       String em = request.getParameter("em");
       String email1 = request.getParameter("email");
//            final String from = "12108105.gvp@gujaratvidyapith.org";
//            final String pass = "Kunal@105";
//            //final String em1 = request.getParameter("email");
//            String host = "smtp.gmail.com";
//            String port="587";
            
            
            
        try  {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mainproject","root","");
            
            
            Statement st = con.createStatement();
       
           
            
            ResultSet rs1 = st.executeQuery("select * from vendor_register where user_id = '"+id+"' ");
            
            rs1.next();
            
            final String message = " "+rs1.getString(2)+" "+rs1.getString(3)+"You are dismissed from the vendor project ";
            
            String useremail = rs1.getString("Email");
            
                Email email=new Email("12108105.gvp@gujaratvidyapith.org", "Kunal@105");
       
       
                email.setFrom("12108105.gvp@gujaratvidyapith.org", "Kunal Hinduja");

                email.setSubject("Vendor dissmissal");

                email.setContent(message,"text/html");

                email.addRecipient(useremail);

                email.send();

               st.executeUpdate("DELETE FROM `vendor_register` WHERE user_id = '"+id+"'");

            
           response.sendRedirect("VendorView.jsp");
            
        }catch(Exception e)
        {
        //out.print("erro");
        out.println("Could not send email.");
        out.print(e);
        
        }
    }

}
