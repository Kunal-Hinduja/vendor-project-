/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.ProcessBuilder.Redirect.to;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Multipart;
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
import java.util.*;

/**
 *
 * @author 91706
 */
public class Signup extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String nm = request.getParameter("nm");
        String ln = request.getParameter("ln");
        String em = request.getParameter("em");
        String ps = request.getParameter("ps");
        
        HttpSession session = request.getSession();
        session.setAttribute("email", em);
        session.setAttribute("pass", ps);
          
            final String from = "12108105.gvp@gujaratvidyapith.org";
            final String pass = "Kunal@105";
            //final String em1 = request.getParameter("email");
            String host = "smtp.gmail.com";
            String port="587";
            
            final String message = "Welcome "+nm+" "+ln+" " +"Your Are Successfully Signup";
            //String message="your original password";
        
        try  {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mainproject","root","");
            
            
            Statement st = con.createStatement();
           
           
            
            ResultSet rs = st.executeQuery("select * from vendor_register where Email = '"+em+"' ");
            
            
            
            if(rs.next()==true)
            {
               
                
               // out.print("<h1 style='color:red'>");     out.print();  out.print("</h1>");
                response.sendRedirect("Singup.html");
            }
            else
            {
             st.executeUpdate("insert into vendor_register(FirstName,LastName,Email,Password) values('"+nm+"','"+ln+"','"+em+"','"+ps+"')");    
            
            
            
            Properties properties = new Properties();
            properties.put("mail.smtp.host", host);
            properties.put("mail.smtp.port", port);
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.user",from);
            properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
            properties.put("mail.password", pass);
            
            
             Authenticator auth = new Authenticator() {
                 
                    public PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(from,pass);
                    }
                };

                Session session1 = Session.getInstance(properties, auth);

                // creates a new e-mail message
                Message msg = new MimeMessage(session1);
                msg.setSubject("Vendor Detailes");
                msg.setFrom(new InternetAddress(from));
                InternetAddress[] toAddresses = { new InternetAddress(em) };
                msg.setRecipients(Message.RecipientType.TO, toAddresses);
                //msg.setSubject(subject);
                msg.setSentDate(new Date());
               // msg.setText(message);
               
                MimeBodyPart messageBodyPart = new MimeBodyPart();
                messageBodyPart.setContent(message, "text/html");

                // creates multi-part
                Multipart multipart = new MimeMultipart();
                multipart.addBodyPart(messageBodyPart);

                msg.setContent(multipart);
                
                
                // sends the e-mail
                Transport.send(msg);
                
                out.println("Email sent.");
            }
            
            response.sendRedirect("Login.html");
           
        }
        catch(Exception e)
        {
            out.println("Could not send email.");
            out.print(e);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
