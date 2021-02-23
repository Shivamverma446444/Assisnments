package com.src;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController 
{
	@RequestMapping("/login")
	public String display()
	{
		return "display.jsp";
	}
	

	
	

}