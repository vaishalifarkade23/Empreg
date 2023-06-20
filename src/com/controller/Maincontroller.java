package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Maincontroller 
{
	@RequestMapping("reg")
	public String getRegForm()
	{
		return "Reg_form";
	}

}
