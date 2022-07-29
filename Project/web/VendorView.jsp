<%-- 
    Document   : VendorView
    Created on : 9 Jun, 2022, 6:59:10 PM
    Author     : 91706
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="Vendorviewcss.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="http://cdn.datatables.net/1.10.2/css/jquery.dataTables.min.css"></style>
        <script type="text/javascript" src="http://cdn.datatables.net/1.10.2/js/jquery.dataTables.min.js"></script>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
        <script src="Status.js" type="text/javascript"></script>
        <script src="Update.js" type="text/javascript"></script>
        <script src="Export.js" type="text/javascript"></script>
        <script src="Pagination.js" type="text/javascript"></script>
        <script src="Inputvalidate.js" type="text/javascript"></script>
     
    </head>
    <body>
        <div class="header">
       <a  href="#default" class="logo">Welcome</a>
       
       <div class="header-right">
      
      <a class="active" href="Logout.jsp">Log Out</a>
       <% 
           try
           {
           if(session.getAttribute("email")==null){response.sendRedirect("Login.html");}
           }
           catch(Exception e)
           {
               e.printStackTrace();
           }
       
       %>
       
  </div>
  
</div>
        
        <%  
            try
            {
               
            if(session.getAttribute("email").equals("12108105.gvp@gujaratvidyapith.org") || session.getAttribute("email").equals("12108114.gvp@gujaratvidyapith.org"))
            { %>
        <center><h1>Vendor Information</h1></center>
        
        
       
         <input type="text" class="form-outline" style="align:left"  id="myInput" placeholder="search" /> 
        <nav aria-label="Page navigation example" align="right">
            <button onclick="exportTableToCSV('vendor.csv')">Export HTML Table To CSV File</button>
         
               
            
</nav>
         
        
      <% }
}
catch(Exception e)
{
e.printStackTrace();
}
        %>
        
        
        <% 
//             int total =0,pgno=0,pageNo=0;
//             int start =1;
//              int recordcount = request.getParameter("recordcount")==null? 6: Integer.parseInt(request.getParameter("recordcount"));   

             String add = request.getParameter("add");
            try
            {
           
//            pgno = request.getParameter("pgno")==null?0 :Integer.parseInt(request.getParameter("pgno"));
//            start = pgno*recordcount;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mainproject","root","");
            Statement stmt=con.createStatement();
            
           
            if(session.getAttribute("email").equals("12108105.gvp@gujaratvidyapith.org") || session.getAttribute("email").equals("12108114.gvp@gujaratvidyapith.org"))
            {
                
           
            String sql = "select * from vendor_register";
            
            PreparedStatement smt = con.prepareStatement(sql);
//            smt.setInt(1,start);
//            smt.setInt(2,recordcount);
            ResultSet rs=smt.executeQuery();
            rs.next();
           
            
           
            
                    
            
            
        %>
     
        <form action="VendorView.jsp" id="form1">  
          Select Number of recorde in page  <select name="state"  id="maxRows" onchange="mxrow()" >

          <option value="10000">All</option>
          <option value="5">5</option>
          <option value="10">10</option>
          <option value="100">100</option>

      </select>
        </form>
            <table class="table table-striped" id="myTable" >
                <tr>
                 
                    <th>user_id</th>
                    <th>FirstName</th>
                    <th>LastName</th>
                    <th style="text-align: center">Email</th>
                    
                    <th>usertype</th>
                    <th>CompanyName</th>
                    <th>TypeOfFirm</th>
                    <th>StatusOfCompany</th>
                    <th>Address</th>
                    <th>StateID</th>
                    <th>CityID</th>
                    <th>PinCode</th>
                     <th>Mobile No:</th>
                    <th>BankName</th>
                    <th>BankBranch</th>
                    <th>banificialname</th>
                    <th>AccountNo</th>
                    <th>IFSCcode</th>
                    <th>PanNo</th>
                    <th>GstNo</th>
                    <th>Bank Cheque no.</th>
                    <th>PanPhoto</th>
                    <th>chequephoto</th>
                    <th>PassBookphoto</th>
                    <th>Gstnop</th>
                    <th>Action</th>
                    <th>Status</th>
                    
                    
                </tr>
                <% while(rs.next()){%>
                
                <tr id="<%out.print(rs.getInt("user_id"));%>">
                    <td data-target="user_id"><%out.print(rs.getInt("user_id"));%></td>
                    <td data-target="FirstName"><%out.print(rs.getString("FirstName"));%></td>
                    <td data-target="LastName"><%out.print(rs.getString("LastName"));%></td>
                    <td data-target="Email"><%out.print(rs.getString("Email"));%></td>
                    <td data-target="usertype"><%out.print(rs.getString("usertype"));%></td>
                    <td data-target="CompanyName"><%out.print(rs.getString("CompanyName"));%></td>
                    <td data-target="TypeOfFirm"><%out.print(rs.getString("TypeOfFirm"));%></td>
                    <td data-target="StatusOfCompany"><%out.print(rs.getString("StatusOfCompany"));%></td>
                    <td data-target="Address"><%out.print(rs.getString("Address"));%></td>
                    <td data-target="StateID"><%out.print(rs.getString(10));%></td>
                    <td data-target="CityID"><%out.print(rs.getString(11));%></td>
                    <td data-target="PinCode"><%out.print(rs.getInt("PinCode"));%></td>
                    <td data-target="mobile"><%out.print(rs.getString("mobile"));%></td>
                    <td data-target="BankName"><%out.print(rs.getString("BankName"));%></td>
                    <td data-target="BankBranch"><%out.print(rs.getString("BankBranch"));%></td>
                    <td data-target="BankBenificialname"><%out.print(rs.getString("BankBenificialname"));%></td>
                    <td data-target="AccountNo"><%out.print(rs.getString("AccountNo"));%></td>
                    <td data-target="IFSCCode"><%out.print(rs.getString("IFSCCode"));%></td>
                    <td data-target="PanNo"><%out.print(rs.getString("PanNo"));%></td>
                    <td data-target="GstNo"><%out.print(rs.getString("GstNo"));%></td>
                    <td data-target="Bankchequeno"><%out.print(rs.getString("Bankchequeno"));%></td>
                    <td><button type="button"
                                
                                                     class="btn btn-primary "
                                                     data-toggle="modal"
                                                    data-target="#img1<%out.print(rs.getInt(1));%>"
                                                     >
                                                      view image
                                                     </button>
                                                    <div class="modal fade"
                                                     id="img1<%out.print(rs.getInt(1));%>"
                                                     tabindex="-1"  
                                                     role="dialog"
                                                     aria-labelledby="exampleModalLabel"
                                                     aria-hidden="true">
    
                                                        <div class="modal-dialog" role="document">
                                                         <div class="modal-content">
                                                         <!-- Add image inside the body of modal -->
                                                          <div class="modal-body">
                                                              <!--<img id="image" src="File/<%out.print(rs.getString(24));%>" style="height:300px;width:300px" alt="Click on button" />-->
                                                                               <img id="image" src="File/<%out.print(rs.getString("PanPhoto"));%>" style="height:300px;width:300px" alt="Click on button" />       
                                                                </div>
                                                              <div class="modal-footer">
<!--                                                                  <button type="button"
                                                                           class="btn btn-secondary"
                                                                        data-dismiss="modal">      Download
                                                                    </button>-->
                                                                    <a id="download_image" href="File/<%out.print(rs.getString("PanPhoto"));%>" download="<%out.print(rs.getString("PanPhoto"));%>">Download</a>
                                                              
                                                                      
                                                                      <button type="button"
                                                                           class="btn btn-secondary"
                                                              data-dismiss="modal">      Close
                                                                    </button>
                                                                           
                                                                </div>  
                                                                </div> 
                                                                </div>
                                                                </div></td>
                    <td><button type="button"
                                                     class="btn btn-primary "
                                                     data-toggle="modal"
                                                    data-target="#img2<%out.print(rs.getInt(1));%>"
                                                     >
                                                      view image
                                                     </button>
                                                    <div class="modal fade"
                                                     id="img2<%out.print(rs.getInt(1));%>"
                                                     tabindex="-1"  
                                                     role="dialog"
                                                     aria-labelledby="exampleModalLabel"
                                                     aria-hidden="true">
    
                                                        <div class="modal-dialog" role="document">
                                                         <div class="modal-content">
                                                         <!-- Add image inside the body of modal -->
                                                          <div class="modal-body">
                                                              <img id="image" src="File/<%out.print(rs.getString(24));%>" style="height:300px;width:300px" alt="Click on button" />
                                                                                   
                                                                </div>
                                                                      <div class="modal-footer">
                                                                          <a id="download_image" href="File/<%out.print(rs.getString(24));%>" download="<%out.print(rs.getString(24));%>">Download</a>
                                                                      <button type="button"
                                                                           class="btn btn-secondary"
                                                              data-dismiss="modal">      Close
                                                                    </button>
                                                                </div>  
                                                                </div> 
                                                                </div>
                                                                </div></td>
                    <td><button type="button"
                                                     class="btn btn-primary "
                                                     data-toggle="modal"
                                                    data-target="#img3<%out.print(rs.getInt(1));%>"
                                                     >
                                                      view image
                                                     </button>
                                                    <div class="modal fade"
                                                     id="img3<%out.print(rs.getInt(1));%>"
                                                     tabindex="-1"  
                                                     role="dialog"
                                                     aria-labelledby="exampleModalLabel"
                                                     aria-hidden="true">
    
                                                        <div class="modal-dialog" role="document">
                                                         <div class="modal-content">
                                                         <!-- Add image inside the body of modal -->
                                                          <div class="modal-body">
                                                              <img id="image" src="File/<%out.print(rs.getString(25));%>" style="height:300px;width:300px" alt="Click on button" />
                                                                                   
                                                                </div>
                                                                      <div class="modal-footer">
                                                                          <a id="download_image" href="File/<%out.print(rs.getString(25));%>" download="<%out.print(rs.getString(25));%>">Download</a>
                                                                      <button type="button"
                                                                           class="btn btn-secondary"
                                                              data-dismiss="modal">      Close
                                                                    </button>
                                                                </div>  
                                                                </div> 
                                                                </div>
                                                                </div>  </td>
                    <td><button type="button"
                                                     class="btn btn-primary "
                                                     data-toggle="modal"
                                                    data-target="#img4<%out.print(rs.getInt(1));%>"
                                                     >
                                                      view image
                                                     </button>
                                                    <div class="modal fade"
                                                     id="img4<%out.print(rs.getInt(1));%>"
                                                     tabindex="-1"  
                                                     role="dialog"
                                                     aria-labelledby="exampleModalLabel"
                                                     aria-hidden="true">
    
                                                        <div class="modal-dialog" role="document">
                                                         <div class="modal-content">
                                                         <!-- Add image inside the body of modal -->
                                                          <div class="modal-body">
                                                              <img id="image" src="File/<%out.print(rs.getString(26));%>" style="height:300px;width:300px" alt="Click on button" />
                                                                                   
                                                                </div>
                                                             
                                                                      <div class="modal-footer">
                                                                     <a id="download_image" href="File/<%out.print(rs.getString(26));%>" download="<%out.print(rs.getString(26));%>">Download</a>
                                                                      <button type="button"
                                                                           class="btn btn-secondary"
                                                              data-dismiss="modal">      Close
                                                                    </button>
                                                                </div>  
                                                                </div> 
                                                                </div>
                                                                </div>
                        
                    </td>
                    
                    
                    
                    
                    <td><a href="#" data-role="delete" data-id="<%out.print(rs.getInt("user_id"));%>" onclick="deletedata(<%out.print(rs.getInt("user_id"));%>)">Delete</a></div></td>
                    <td>
                        
                      <%  if(rs.getInt(27)==0) 
                        {%>
                        
                        <button type="button" data-role="update" data-id="<%out.print(rs.getInt("user_id"));%>" style="background-color: lightgreen " onclick="update(<%out.print(rs.getInt("user_id"));%>)" >Active</button>
                     <%   }
                    else
                        {%>
                        <button type="button" data-role="update" data-id="<%out.print(rs.getInt("user_id"));%>" style="background-color: lightcoral " onclick="update(<%out.print(rs.getInt("user_id"));%>)" >Deactivate</button>
                     <% } %>
                    </td>
                       
                       

                   
                </tr>
               
            
                    
                <%} %>
                <%
//                        String sql1 = "select count(*) from vendor_register";
//                        PreparedStatement smt2 = con.prepareStatement(sql1);
//                        ResultSet rs1= smt2.executeQuery();
//                        rs1.next();
//                        total =rs1.getInt(1);
                        
                        
                        
                %>
                      
              
                       
            </table>         
                       
                 <div class="pagination-container">
                            <nav>
                                <ul class="pagination"></ul>
                                </nav>
                            
                        </div>   
                        
                   
                   <script>
                     
  
                   </script>
                    
          
         
                            
                            
                            
                <%
                 }
            
             
                  else
                        { 
                    
                     ResultSet rs=stmt.executeQuery("select * from vendor_register where email ='"+session.getAttribute("email")+"'");
                     rs.next();
                    %>
                      
                    <center><h1>Hello  <%out.print(rs.getString(2));%></h1></center>
                    
                     <center>
            <div class="container">
             <style>
                 .container{
                        height: 500px;
                        width: 800px;
                     
                 } 
                 
             </style>
            <table class="table table-striped" border="2">
               
                   <tr><th>user_id:</th><td><%out.print(rs.getInt(1));%></td></tr>
                   <tr> <th>FirstName:</th><td><%out.print(rs.getString(2));%></td></tr>
                   <tr><th>LastName:</th><td><%out.print(rs.getString(3));%></td></tr>
                   <tr> <th>Email:</th><td><%out.print(rs.getString(4));%></td></tr>
                  
                   <tr> <th>usertype:</th><td><%out.print(rs.getString(6));%></td></tr>
                   <tr><th>CompanyName:</th><td><%out.print(rs.getString(7));%></td></tr>
                   <tr> <th>TypeOfFirm:</th><td><%out.print(rs.getString(8));%></td></tr>
                   <tr> <th>StatusOfCompany:</th><td><%out.print(rs.getString(9));%></td></tr>
                   <tr> <th>Address:</th><td><%out.print(rs.getString(10));%></td></tr>
                   <tr> <th>StateID:</th><td><%out.print(rs.getString(11));%></td></tr>
                   <tr> <th>CityID:</th><td><%out.print(rs.getInt(12));%></td></tr>
                   <tr> <th>PinCode:</th><td><%out.print(rs.getString(13));%></td></tr>
                   <tr> <th>MobileNo:</th><td><%out.print(rs.getString(14));%></td></tr>
                   <tr> <th>BankName:</th><td><%out.print(rs.getString(15));%></td></tr>
                   <tr> <th>BankBranch:</th><td><%out.print(rs.getString(16));%></td></tr>
                   <tr> <th>Bankbeneficiary:</th><td><%out.print(rs.getString(17));%></td></tr>
                  
                   <tr> <th>AccountNo:</th><td><%out.print(rs.getString(18));%></td></tr>
                   <tr> <th>IFSCcode:</th><td><%out.print(rs.getString(19));%></td></tr>
                    <tr> <th>PanNo:</th><td><%out.print(rs.getString(20));%></td></tr>
                    <tr> <th>GstNo:</th><td><%out.print(rs.getString(21));%></td></tr>
                  
                   
                   <tr> <th>Bankchequeno:</th><td><%out.print(rs.getString(22));%></td></tr>
                   
                                        <tr> <th>PanPhoto:</th><td>
                                                    <button type="button"
                                                     class="btn btn-primary "
                                                     data-toggle="modal"
                                                    data-target="#exampleModal"
                                                     >
                                                      view image
                                                     </button>
                                                    <div class="modal fade"
                                                     id="exampleModal"
                                                     tabindex="-1"  
                                                     role="dialog"
                                                     aria-labelledby="exampleModalLabel"
                                                     aria-hidden="true">
    
                                                        <div class="modal-dialog" role="document">
                                                         <div class="modal-content">
                                                         <!-- Add image inside the body of modal -->
                                                          <div class="modal-body">
                                                              <img id="image" src="File/<%out.print(rs.getString("PanPhoto"));%>" style="height:300px;width:300px" alt="Click on button" />
                                                                                   
                                                                </div>
                                                                      <div class="modal-footer">
                                                                      <button type="button"
                                                                           class="btn btn-secondary"
                                                              data-dismiss="modal">      Close
                                                                    </button>
                                                                </div>  
                                                                </div> 
                                                                </div>
                                                                </div>
                        </td></tr>
                   <tr> <th>chequephoto:</th><td>
                                                    <button type="button"
                                                     class="btn btn-primary "
                                                     data-toggle="modal"
                                                    data-target="#p2"
                                                     >
                                                      view image
                                                     </button>
                                                    <div class="modal fade"
                                                     id="p2"
                                                     tabindex="-1"  
                                                     role="dialog"
                                                     aria-labelledby="exampleModalLabel"
                                                     aria-hidden="true">
    
                                                        <div class="modal-dialog" role="document">
                                                         <div class="modal-content">
                                                         <!-- Add image inside the body of modal -->
                                                          <div class="modal-body">
                                                              <img id="image" src="File/<%out.print(rs.getString(24));%>" style="height:300px;width:300px" alt="Click on button" />
                                                                                   
                                                                </div>
                                                                      <div class="modal-footer">
                                                                      <button type="button"
                                                                           class="btn btn-secondary"
                                                              data-dismiss="modal">      Close
                                                                    </button>
                                                                </div>  
                                                                </div> 
                                                                </div>
                                                                </div>
                        
                       </td></tr>
                   
                   <tr> <th>PassBookphoto:</th><td>
                       <button type="button"
                                                     class="btn btn-primary "
                                                     data-toggle="modal"
                                                    data-target="#p3"
                                                     >
                                                      view image
                                                     </button>
                                                    <div class="modal fade"
                                                     id="p3"
                                                     tabindex="-1"  
                                                     role="dialog"
                                                     aria-labelledby="exampleModalLabel"
                                                     aria-hidden="true">
    
                                                        <div class="modal-dialog" role="document">
                                                         <div class="modal-content">
                                                         <!-- Add image inside the body of modal -->
                                                          <div class="modal-body">
                                                              <img id="image" src="File/<%out.print(rs.getString(25));%>" style="height:300px;width:300px" alt="Click on button" />
                                                                                   
                                                                </div>
                                                                      <div class="modal-footer">
                                                                      <button type="button"
                                                                           class="btn btn-secondary"
                                                              data-dismiss="modal">      Close
                                                                    </button>
                                                                </div>  
                                                                </div> 
                                                                </div>
                                                                </div>                                  
                       </td></tr>
                   <tr> <th>Gstnop:</th><td>
                           
                                                     <button type="button"
                                                     class="btn btn-primary "
                                                     data-toggle="modal"
                                                    data-target="#example"
                                                     >
                                                      view image
                                                     </button>
                                                    <div class="modal fade"
                                                     id="example"
                                                     tabindex="-1"  
                                                     role="dialog"
                                                     aria-labelledby="exampleModalLabel"
                                                     aria-hidden="true">
    
                                                        <div class="modal-dialog" role="document">
                                                         <div class="modal-content">
                                                         <!-- Add image inside the body of modal -->
                                                          <div class="modal-body">
                                                              <img id="image" src="File/<%out.print(rs.getString(26));%>" style="height:300px;width:300px" alt="Click on button" />
                                                                                   
                                                                </div>
                                                                      <div class="modal-footer">
                                                                      <button type="button"
                                                                           class="btn btn-secondary"
                                                              data-dismiss="modal">      Close
                                                                    </button>
                                                                </div>  
                                                                </div> 
                                                                </div>
                                                                </div>
                   </td></tr>
                  
                   
             
            </table>                    
                         <div class="container">
                        
                        <!-- Trigger the modal with a button -->
                        
                         <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal" style="height:50px;width:150px;background-color:lightblue;font-size:20px;font-color:white">Update</button>
                        <!-- Modal -->
                        <div class="modal fade" id="myModal" role="dialog">
                          <div class="modal-dialog">

                            <!-- Modal content-->
                            <div class="modal-content">
                              <div class="modal-header">
                                  
                                <button type="button" class="close" data-dismiss="modal">&times;</button>
                                </div>
                               <form action="Update" method="post">
                                <table class="table table-striped" border="2">
               
                               
                                    <tr> <th>FirstName:</th><td><input type='text' style="border:none; " name="nm"  maxlength="30" onkeypress="return onlyAlphabets(event,this);"  pattern="^[A-Za-z]{2,50}$" value="<%out.print(rs.getString(2));%>"></td></tr>
                                    <tr><th>LastName:</th><td><input type='text' style="border:none; " name="ln"  maxlength="30" onkeypress="return onlyAlphabets(event,this);"  pattern="^[A-Za-z]{2,50}$" value="<%out.print(rs.getString(3));%>"></td></tr>
                                    
                                    <tr><th>CompanyName:</th><td><input type='text' style="border:none;" name="cm"  maxlength="30"  pattern="^[A-Z a-z]{2,50}$" value="<%out.print(rs.getString(7));%>"></td></tr>

                                    <tr> <th>Address:</th><td><input type='text' style="border:none;" name="add"  value="<%out.print(rs.getString(10));%>"></td></tr>
                                   <tr> <th>MobileNo:</th><td><input type='text' style="border:none; " name="mn" onkeypress="return onlyNos(event,this);" pattern="[0-9]{10}" maxlength="10" value="<%out.print(rs.getString(14));%>"></td></tr>
                                    <tr> <th>BankName:</th><td><input type='text' style="border:none; " name="bn" pattern="^[A-Z a-z]{5,50}$" value="<%out.print(rs.getString(15));%>"></td></tr>
                                    <tr> <th>BankBranch:</th><td><input type='text' style="border:none; " name="bb"  maxlength="20"  pattern="^[A-Z a-z]{5,50}$" value="<%out.print(rs.getString(16));%>"></td></tr>
                                    <tr> <th>Bankbeneficiary:</th><td><input type='text' style="border:none;"name="bbn"  maxlength="30" onkeypress="return onlyNos(event,this);" pattern="^[A-Z a-z]{5,50}$" value="<%out.print(rs.getString(17));%>"></td></tr>

                                    <tr> <th>AccountNo:</th><td><input type='text' style="border:none; " name="ac" value="<%out.print(rs.getString(18));%>"></td></tr>
                                    <tr> <th>IFSCcode:</th><td><input type='text' style="border:none; " name="ic"  maxlength="11" pattern="^[A-Z]{4}[0][A-Z0-9]{6}$" value="<%out.print(rs.getString(19));%>"></td></tr>
                                    
                                     <tr> <th>Bankchequeno:</th><td><input type='text' style="border:none; " maxlength="20" name="cheque" value="<%out.print(rs.getString(22));%>"></td></tr>
                                     <tr> <th>chequephoto:</th><td> <input type="file"  name="chequephoto"  value="File/<%out.print(rs.getString(24));%>"></td>
                                      <tr><th>Pass Book photo:</th><td> <input type="file"  name="ps" value="File/<%out.print(rs.getString(25));%>"></td>
                                                   </table>
                    <input type="submit" class="btn btn-default" value="Save">
                                </form> 
                              
                              <div class="modal-body">
                                
                              </div>
                              <div class="modal-footer">
                                 
                                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                              </div>
                            </div>

                          </div>
                        </div>

                      </div>

                   
            </div>    
                        
                        
                        
                        
                            <% }
                    }
                    catch(Exception e)
                    {
                      out.print(e);
                    }
                    %>
                

            </table>
        </center>
                    <script src="searching.js" type="text/javascript"></script>
                    <script>
                       function deletedata(id){
                        $(document).ready(function(){
                           
                            $(document).on('click','a[data-role=delete]',function(){
                                
                                
                                
                               $.ajax({
                                   
                                   url: 'DeleteVendor',
                                   
                                   type: 'POST',
                                   data:{
                                       id :id,
                                       action:"delete"
                                  
                                   },
                                  
                                   success:function(response)
                                   {
                                       console.log(response);
                                       alert("Vendor dismished successfully ");
                                        location.reload(true);
                                    //   document.getElementById("user_id").style.display = "none";
//                                       if(response==1)
//                                       {
//                                           alert("Vendor dismished successfully ");
//                                          
//                                           
//                                       }
//                                       else if(response == 0)
//                                       {
//                                            alert("Vendor can't  be dismished  ");
//                                        //   document.getElementById("user_id").style.display = "none";
//                                           
//                                       }
                                     }
                                 })    
                 
                            })
                            
                        });
                    }
                    
                    </script>
                    
 </body>
</html>