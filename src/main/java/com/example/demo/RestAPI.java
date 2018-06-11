package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/rest")
public class RestAPI {
	
	@RequestMapping(path="/arg", method=RequestMethod.GET)
	public String getArg() {
		return "ARG";
	}
	
	@RequestMapping(path="/args", method=RequestMethod.GET)
	public String[] getArgs() {
		return new String[] {"ARG1","ARG2"};
	}
	
	@RequestMapping(path="/random", method=RequestMethod.GET)
	public int getRandom() {
		return (int)(Math.random()*100+1);
	}

}
