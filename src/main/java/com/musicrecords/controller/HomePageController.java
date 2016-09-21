package com.musicrecords.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

	@RequestMapping ("/")
	public String HomePageControl() {
		return "index";
		
	}

	@RequestMapping ("/index")
	public String HomePage() {
		return "index";
	}
	
	@RequestMapping ("/about")
	public String AboutPage() {
		return "about";
	}
	
	@RequestMapping ("/contactUs")
	public String contactUs() {
		return "contactUs";
	}
	
	@RequestMapping ("/signIn")
	public String LoginPage() {
		return "signIn";
	}
	

	@RequestMapping ("/signUp")
	public String signUp() {
		return "signUp";
	}
	
	@RequestMapping ("/prodDisplay")
	public String prodDisplay() {
		return "prodDisplay";
	}
	@RequestMapping ("/productDetails")
	public String productDetails() {
		return "productDetails";
	}
	
	@RequestMapping ("/category")
	public String category() {
		return "category";
	}
	
	@RequestMapping ("/vendor")
	public String vendor() {
		return "vendor";
	}
}
