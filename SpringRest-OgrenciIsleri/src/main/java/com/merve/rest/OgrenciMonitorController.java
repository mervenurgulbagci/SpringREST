package com.merve.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/monitor")
public class OgrenciMonitorController {
	
	 @GetMapping("/")
	public String gor()
		{
		        return "1";
		 }
	}

