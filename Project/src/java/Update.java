/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 91706
 */
public class Update extends HttpServlet {

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
         String add1 = request.getParameter("add1");
         
         HttpSession session = request.getSession();
        String fn = request.getParameter("nm");
        String ln = request.getParameter("ln");
        String em = request.getParameter("em");
        String cn = request.getParameter("cm");
        String add = request.getParameter("add");
        String st = request.getParameter("state");
        String ct = request.getParameter("ct");
        String pc = request.getParameter("pc");
        String mn = request.getParameter("mn");
        String bn = request.getParameter("bn");
        String bb = request.getParameter("bb");
        String bbn = request.getParameter("bbn");
        String ac = request.getParameter("ac");
        String ic = request.getParameter("ic");
        String pan = request.getParameter("pan");
        String gst = request.getParameter("gst");
        String cheque = request.getParameter("cheque");
        String cheque1 = request.getParameter("chequephoto");
        String pass = request.getParameter("ps");
         
        try  {
            /* TODO output your page here. You may use following sample code. */
             Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mainproject","root","");
     
            Statement st1 = con.createStatement();
            
            String k =(String) session.getAttribute("email");
            
            st1.executeUpdate("update vendor_register set FirstName='"+fn+"', LastName ='"+ln+"' , `CompanyName`='"+cn+"', `Address`='"+add+"', mobile ='"+mn+"', BankName ='"+bn+"', BankBranch ='"+bb+"', BankBenificialname ='"+bbn+"', AccountNo ='"+ac+"', IFSCCode ='"+ic+"', Bankchequeno ='"+cheque+"',chequephoto = '"+cheque1+"',PassBookphoto = '"+pass+"' where email= '"+k+"'");
            
            
            
            response.sendRedirect("VendorView.jsp");
            
        }
        catch(Exception e)
        {
          out.print(e);
        }
    }

}
