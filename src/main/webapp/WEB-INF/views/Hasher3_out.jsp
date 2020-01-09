 <%@ page import="demo.Demo,java.io.* ,javax.xml.parsers.*,javax.xml.transform.*, javax.xml.transform.dom.*,javax.xml.transform.stream.*,javax.xml.*,org.w3c.dom.*,demo.Demo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>
   
    
  
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="demo" class="demo.Demo" scope="session"/> 

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>hiiiii</h1>
 <%
 String name = request.getParameter("user"); 
 String pass =request.getParameter("password");
 Demo fb = new Demo(); 
 fb.setUser(name);
 fb.setPassword(pass);
 %>
 Name:<%out.print(fb.getUser());%> 
 password:<% out.print(fb.getPassword()); %>  
     
</body>
</html>