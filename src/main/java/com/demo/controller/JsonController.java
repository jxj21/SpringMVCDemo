package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.demo.bean.User;

@Controller
@RequestMapping(value = "/json")
public class JsonController {
	
	@RequestMapping(value = "/test")
	@ResponseBody
	public String jsonTest(){
		
		User user = new User(1,"dayaoguai");
		String text = JSON.toJSONString(user);
		return text;
		
	}
	
	@RequestMapping(value = "/test1")
	public String jsonTest1(){
		
		User user = new User(1,"dayaoguai11");
		String text = JSON.toJSONString(user);
		return text;
		
	}
	
	@RequestMapping(value = "/jsonParam",method = RequestMethod.POST)
	public void jsonParam(@RequestBody String name){
	    System.out.println(name);
	}
	
	

}
