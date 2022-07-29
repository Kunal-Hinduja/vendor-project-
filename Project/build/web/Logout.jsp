<%-- 
    Document   : Logout
    Created on : 10 Jun, 2022, 8:17:56 PM
    Author     : 91706
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
    session.invalidate();
    response.sendRedirect("Login.html");

%>
