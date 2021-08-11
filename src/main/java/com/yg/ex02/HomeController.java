package com.yg.ex02;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/4", method = RequestMethod.GET)
	public String home(HttpServletRequest request) {
		request.setAttribute("hello", "hello world2");
		
		
		return "result4";
	}
	@RequestMapping(value = "/5", method = RequestMethod.GET)
	public String home2(HttpServletRequest request,Model model) {
		model.addAttribute("hello", "hello ");
		request.setAttribute("world", "world 2");
		return "result5";
	}
	
}
