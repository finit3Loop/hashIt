package com.aws.codestar.projecttemplates.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Hashing controller Spring MVC controller that handles all GET requests.
 */
@Controller
@RequestMapping("/Hasher2")
public class Hasher2Controller {

    private final String siteName2;

    public Hasher2Controller(final String siteName2) {
        this.siteName2 = siteName2;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView helloWorld() {
        ModelAndView mav = new ModelAndView("Hasher2");
        mav.addObject("siteName", this.siteName2);
        return mav;
    }

}
