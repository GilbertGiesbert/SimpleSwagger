package de.joern.playground.simple_swagger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MyController {
 
    @RequestMapping(method = RequestMethod.GET)
    public String sayHi(ModelMap model) {
        model.addAttribute("greeting", "hi, here's joern");
        return "welcome";
    }
 
    @RequestMapping(value = "/hiagain", method = RequestMethod.GET)
    public String sayHiAgain(ModelMap model) {
    	model.addAttribute("greeting", "hi, here's joern again");
        return "welcome";
    }
 
}