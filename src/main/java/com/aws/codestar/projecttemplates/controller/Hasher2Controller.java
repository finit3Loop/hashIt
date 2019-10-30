package com.aws.codestar.projecttemplates.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Hashing controller Spring MVC controller that handles all GET requests.
 */
@Controller

public class Hasher2Controller {

	@RequestMapping("/Hasher2")
	public String HasherController2() {
		System.out.println("Hasher 2 controller");
		return "Hasher2.jsp";
    }

}
