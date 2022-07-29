/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static com.sun.org.apache.xerces.internal.util.FeatureState.is;
import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import java.io.*;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author 91706
 */
@MultipartConfig
public class Detailes extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String cn = request.getParameter("cm");
        String toc = request.getParameter("toc");
        String soc = request.getParameter("soc");
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
//        String panp = request.getParameter("panp");
//        String chequep = request.getParameter("chequep");
//        String passp = request.getParameter("passp");
//        String gstp = request.getParameter("gstp");

        Part part1 = request.getPart("panp");
        Part part2 = request.getPart("chequep");
        Part part3 = request.getPart("passp");
        Part part4 = request.getPart("gstp");
        
        String panp = part1.getSubmittedFileName();
        String chequep = part2.getSubmittedFileName();
        String passp = part3.getSubmittedFileName();
        String gstp = part4.getSubmittedFileName();
        
         try  {
        InputStream im1 = part1.getInputStream();
        InputStream im2 = part2.getInputStream();
        InputStream im3 = part3.getInputStream();
        InputStream im4 = part4.getInputStream();
        
        byte []data1= new byte[im1.available()];
        byte []data2= new byte[im2.available()];
        byte []data3= new byte[im3.available()];
        byte []data4= new byte[im4.available()];
        
        im1.read(data1);
        im2.read(data2);
        im3.read(data3);
        im4.read(data4);
        
        String path1="C:\\Users\\91706\\OneDrive\\Desktop\\Project\\Project\\web\\File"+File.separator+panp;
        String path2="C:\\Users\\91706\\OneDrive\\Desktop\\Project\\Project\\web\\File"+File.separator+chequep;
        String path3="C:\\Users\\91706\\OneDrive\\Desktop\\Project\\Project\\web\\File"+File.separator+passp;
        String path4="C:\\Users\\91706\\OneDrive\\Desktop\\Project\\Project\\web\\File"+File.separator+gstp;
        
        FileOutputStream ops1=new FileOutputStream(path1);
        FileOutputStream ops2=new FileOutputStream(path2);
        FileOutputStream ops3=new FileOutputStream(path3);
        FileOutputStream ops4=new FileOutputStream(path4);
        
        ops1.write(data1);
        ops2.write(data2);
        ops3.write(data3);
        ops4.write(data4);
        
        HttpSession session = request.getSession();
        
        out.print(mn);
        
       
            
             Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mainproject","root","");
     
            Statement st1 = con.createStatement();
            
            st1.executeUpdate("update vendor_register set `CompanyName`='"+cn+"', `TypeOfFirm`='"+toc+"', `StatusOfCompany`='"+soc+"', `Address`='"+add+"', `StateID`='"+st+"', `CityID`='"+ct+"', `PinCode`='"+pc+"', mobile ='"+mn+"', BankName ='"+bn+"', BankBranch ='"+bb+"', BankBenificialname ='"+bbn+"', AccountNo ='"+ac+"', IFSCCode ='"+ic+"', PanNo ='"+pan+"', GstNo ='"+gst+"', Bankchequeno ='"+cheque+"',PanPhoto = '"+panp+"',chequephoto = '"+chequep+"',PassBookphoto = '"+passp+"',Gstnop = '"+gstp+"' where email='"+session.getAttribute("email")+"'");
                  
            response.sendRedirect("VendorView.jsp");
        }
        catch(Exception e){
     
           out.print(e);
        
        }
    }

}