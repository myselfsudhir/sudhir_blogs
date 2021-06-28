package com.te.blogs.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogsMVCController {

	@GetMapping("/movie")
	public String getMovie(HttpServletRequest request, ModelMap map) {
		String name = request.getParameter("name");
		map.addAttribute("name", name);
		return "movie";
	}
	
	@GetMapping("/sports")
	public String getSports(HttpServletRequest request, ModelMap map) {
		String name = request.getParameter("name");
		map.addAttribute("name", name);
		return "sports";
	}
	
	@GetMapping("/food")
	public String getFood(HttpServletRequest request, ModelMap map) {
		String name = request.getParameter("name");
		map.addAttribute("name", name);
		return "food";
	}
	
}
