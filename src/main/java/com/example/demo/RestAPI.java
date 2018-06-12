package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPI {
	
	@RequestMapping(path="/arg")
	public String getArg() {
		return "ARG";
	}
	
	@RequestMapping(path="/args")
	public String[] getArgs() {
		return new String[] {"ARG1","ARG2"};
	}
	
	@RequestMapping(path="/random")
	public int getRandom() {
		return (int)(Math.random()*100+1);
	}

}
//test