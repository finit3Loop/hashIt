package com.hasher.resources;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Hasher extends HttpServlet {

	protected void doGet(HttpServlet request, HttpServletResponse response) throws ServletException, Exception
	{
	response.setContentType(null);
	PrintWriter out =  response.getWriter();
	
	String fn = request.getInitParameter("firstname");
	String ln = request.getInitParameter("lastname");
	
	out.println(fn + " " + ln);
	
	}
	
	protected void doPost(HttpServlet request, HttpServletResponse response) throws ServletException, IOException
	{
	response.setContentType(null);
	PrintWriter out =  response.getWriter();
	
	String fn = request.getInitParameter("firstname");
	String ln = request.getInitParameter("lastname");
	out.println(fn + " " + ln);
	}
	private String hash(String password) {
		String generatedPassword = null;
		try {
			// Create MessageDigest instance for MD5
			MessageDigest md = MessageDigest.getInstance("MD5");
			
			// Add password bytes to digest
			md.update(password.getBytes());
			
			// Get the hash's bytes
			byte[] bytes = md.digest();
			
			// Convert byte[] to hex string
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < bytes.length; i++) {
				sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
			}
			
			// Get complete hashed password in hex format
			generatedPassword = sb.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		System.out.println(generatedPassword);

		return generatedPassword;
	}

}