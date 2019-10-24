package com.aws.codestar.projecttemplates.controller;


	
	

import java.io.PrintWriter;
import java.security.*;
import java.util.*;
import javax.*;

public class Hasher2 extends HttpServlet {

	@Override
	protected void doGet(HttpServevlet request, HttpServletResponse response) throws ServletException
	{
	response.setContentType();
	PrintWriter out -  response.getWriter();
	
	String fn = request.getParameter("firstname");
	String ln = request.getParameter("lastname");
	
	out.println(fn + " " + ln);
	
	}
	
	@Override
	protected void doPost(HttpServevlet request, HttpServletResponse response) throws ServletException
	{
	response.setContentType();
	PrintWriter out -  response.getWriter();
	
	String fn = request.getParameter("firstname");
	String ln = request.getParameter("lastname");
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
	
	
}


/*  FOR REFERENCE





import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.web.servlet.ModelAndView;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for {@link HelloWorldController}. Modify the tests in order to support your use case as you build your project.
 
@DisplayName("Tests for HelloWorldController")
public class HelloWorldControllerTest {

    private static final String EXPECTED_SITE_NAME = "home";
    private static final String EXPECTED_VIEW_NAME = "index";

    private HelloWorldController helloWorldController = new HelloWorldController(EXPECTED_SITE_NAME);

    /**
     * Initializing variables before we run the tests.
     * Use @BeforeAll for initializing static variables at the start of the test class execution.
     * Use @BeforeEach for initializing variables before each test is run.
    
    @BeforeAll
    static void setup() {
        // Use as needed.
    }

    /**
     * De-initializing variables after we run the tests.
     * Use @AfterAll for de-initializing static variables at the end of the test class execution.
     * Use @AfterEach for de-initializing variables at the end of each test.
     
    @AfterAll
    static void tearDown() {
        // Use as needed.
    }

    /**
     * Basic test to verify the result obtained when calling {@link HelloWorldController#helloWorld} successfully.
     
    @Test
    @DisplayName("Basic test for controller")
    void testHelloWorld() {
        ModelAndView actualModelAndView = helloWorldController.helloWorld();

        // Verify the result obtained matches the values we expect.
        assertEquals(EXPECTED_VIEW_NAME, actualModelAndView.getViewName());
        assertEquals(EXPECTED_SITE_NAME, String.valueOf(actualModelAndView.getModel().get("siteName")));
    }
}

*/





