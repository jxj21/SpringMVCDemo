package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/test")
public class TestController {
	
	@RequestMapping(value = "/test", method=RequestMethod.POST)
	public void test(){
	    System.out.println("½øÀ´ÁË");
	}
	
	@RequestMapping(value="/restful/{id}")
	public void restful(@PathVariable("id") int userId){
		System.out.println(userId);
		
	}

}
