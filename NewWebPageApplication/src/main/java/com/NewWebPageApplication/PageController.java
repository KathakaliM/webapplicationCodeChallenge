package com.NewWebPageApplication;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class PageController  {
  
	@RequestMapping("/web")
	public String home()
	{
		return "web";
	}
	 @RequestMapping("/test")
	    public  void handler2 () {
	       throw new RuntimeException("exception from handler");
	    }
}
