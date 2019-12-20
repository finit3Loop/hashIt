package com.aws.codestar.projecttemplates.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

/**
 * Basic Spring MVC controller that handles all GET requests.
 */
@Controller

@RequestMapping("/")
public class HelloWorldController {

    private final String siteName;

    public HelloWorldController(final String siteName) {
        this.siteName = siteName;
    }

    @GetMapping("/")
    public ModelAndView helloWorld() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("siteName", this.siteName);
        return mav;
    }
    
//    @PostMapping("/")
//    public String hasherSubmit(@ModelAttribute Hash "newHash") {
//    	
//    	return "result";
//    	
//    }
//   
	@RequestMapping("/Hasher2")
	
	
	
	public String HasherController2() {
		System.out.println("Hasher 2 controller");
		return "Hasher2";
    }
	
}