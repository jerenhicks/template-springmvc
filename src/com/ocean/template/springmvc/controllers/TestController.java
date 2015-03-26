package com.ocean.template.springmvc.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ocean.template.springmvc.dao.TestDao;
import com.ocean.template.springmvc.model.Test;

@Controller
public class TestController {
	
	private TestDao testDao = new TestDao();
	
	@RequestMapping(method=RequestMethod.GET, value ="/test")  
	public @ResponseBody List<Test> getTest(){
	    return testDao.readAll();
	}
	
	@RequestMapping(method=RequestMethod.GET, value ="/test/{id}")  
	public @ResponseBody String getById(String id) {
		return testDao.read(UUID.fromString(id)).toString();
	}
	

	@RequestMapping(method=RequestMethod.POST, value ="/test")  
	public @ResponseBody Test createTest(@ModelAttribute("test")Test test) {
		return testDao.create(test);
	}

}
