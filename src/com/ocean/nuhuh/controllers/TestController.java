package com.ocean.nuhuh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping(method=RequestMethod.GET, value ="/movie")  
	public @ResponseBody String getMovie(){
	    return "hello world";
	}

}
