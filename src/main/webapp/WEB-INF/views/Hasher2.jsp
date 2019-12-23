<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Hasher2</title>
    <meta name="description" content="" />

    <spring:url value="/resources/gradients.css" var="gradientsCss" />
    <spring:url value="/resources/styles.css" var="stylesCss" />
    <spring:url value="/resources/set-background.js" var="setBackgroundJs" />
    <spring:url value="/resources/tweet.svg" var="tweetSvg" />

    
      <header>
        <nav class="website-nav">
          <ul>
            <li><a href="http://jarretpiper.com">Home</a></li>
            
          </ul>
        </nav>
      </header>
      </head>
      <body>
       
		<p>New Hasher 2 page</p>
	
		<form action = "/hasher2.jsp" method = "POST" target = "_blank">
         <input type = "checkbox" name = "maths" checked = "checked" /> Maths
         <input type = "checkbox" name = "physics"  /> Physics
         <input type = "checkbox" name = "chemistry" /> Chemistry
         <input type = "submit" value = "Select Subject" />
      </form>




<!-- test for jsp scriptlet -->

<%!
	public int sum(int a, int b)
	{
      return a + b;
	}
%>
4 + 4 = <%= sum(4, 4) %>
  
    	

   

  </body>
</html>
