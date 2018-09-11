package com.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.bean.User;

@Controller
@RequestMapping(value = "/param")
public class ParamController {
	
	@RequestMapping("/String")
	public void StringTest(String name){
	    System.out.println(name);
	}
	
	@RequestMapping("/int")
	public void intTest(int age){
	    System.out.println(age);
	}
	
	@RequestMapping("/request")
	public void request(HttpServletRequest request){
	  String name = (String) request.getParameter("name");
	  System.out.println(name);
	}
	
	@RequestMapping("/obj")
    public void obj(User user){
        System.err.println(user.getUserName());
        System.err.println(user.getAge());
    }
	
	@RequestMapping("/restful/{name}")
	public void restful(@PathVariable String name){
		System.out.println(name);
	}

}
