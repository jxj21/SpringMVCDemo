package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageControler {
	
	@RequestMapping("/index")
	  public String index(){
	      return "index";
	  }
}
