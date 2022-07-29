<%-- 
    Document   : city
    Created on : 9 Jun, 2022, 11:57:23 AM
    Author     : 91706
--%>


<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.connection.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
        
                           
                           <label style="font-size: 20px;">City :</label>
                           <select id="city" name="ct">
                                <option >select city</option>
                                   <%

                int id = Integer.parseInt(request.getParameter("state"));
                ResultSet rs =DatabaseConnection.getResultFromSqlQuery("select * from city_master where state_id='" + id + "'");
                while (rs.next()) {
            %>
            <option value="<%=rs.getInt(1)%>"><%=rs.getString(2)%></option>
            <%
                }
            %>
                               
                        </select>
                                     
                           
    </body>
</html>
