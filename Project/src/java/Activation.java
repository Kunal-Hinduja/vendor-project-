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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.email.durgesh.Email;
/**
 *
 * @author 91706
 */
public class Activation extends HttpServlet {

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
         int id =Integer.parseInt(request.getParameter("id"));
        // out.print(id);
        try{
             Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mainproject","root","");
            
            
            
            Statement st = con.createStatement();
            
            ResultSet rs = st.executeQuery("select * from vendor_register where user_id='"+id+"'");
            rs.next();
            out.print(rs.getInt(27));
            
            final String message = " "+rs.getString(2)+" "+rs.getString(3)+"You are not able to Login to vendor Ragister ";
            
            final String message1 = " "+rs.getString(2)+" "+rs.getString(3)+"You are now active in  vendor Ragister for Ragistration ";
            
            String useremail = rs.getString("Email");
            
            
            if(rs.getInt(27)==1){
             out.print("document.getElementById('but').textContent='Submit';");
              
                Email email=new Email("12108105.gvp@gujaratvidyapith.org", "Kunal@105");
       
       
                email.setFrom("12108105.gvp@gujaratvidyapith.org", "Kunal Hinduja");

                email.setSubject("Vendor status of decativate");

                email.setContent(message,"text/html");

                email.addRecipient(useremail);

                email.send();
            st.executeUpdate("update vendor_register set status = 0 where user_id = '"+id+"' ");
            }
            else 
            {
                 Email email=new Email("12108105.gvp@gujaratvidyapith.org", "Kunal@105");
       
       
                email.setFrom("12108105.gvp@gujaratvidyapith.org", "Kunal Hinduja");

                email.setSubject("Vendor status of activation");

                email.setContent(message1,"text/html");

                email.addRecipient(useremail);

                email.send();
                
                st.executeUpdate("update vendor_register set status = 1 where user_id = '"+id+"'  ");
            
            }
        }
        catch(Exception e)
        {
            out.print(e);
        }
    }

}
