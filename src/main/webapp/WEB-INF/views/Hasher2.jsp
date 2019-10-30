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
             <!-- 
            <li><a href="https://aws.amazon.com/what-is-cloud-computing/">About</a></li>
            <li><a href="https://aws.amazon.com/solutions/">Services</a></li>
            <li><a href="https://aws.amazon.com/contact-us/">Contact</a></li>
          	 ---> 
          </ul>
        </nav>
      </header>
      
     <h1>Congratulations!</h1>
     <h2>You just created a Java Spring web application.</h2>
      
		
		<form action = "/Hasher2" method="POST" class="form-style-6">
 	 		First name:<br>
  			<input type="text" name="firstname"><br>
  			Last name:<br>
  			<input type="text" name="lastname">
  			<input type="submit" value="Submit">
		</form> 
	

      

  
    	

   

  </body>
</html>
