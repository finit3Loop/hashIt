package com.aws.codestar.projecttemplates.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Hashing controller Spring MVC controller that handles all GET requests.
 */
@Controller

public class Hasher3Controller {

	@RequestMapping("/Hasher3_index")
	@ResponseBody
	public String HasherController3() {
		System.out.println("Hasher 3 controller");
		return "Hasher3";
    }

}
