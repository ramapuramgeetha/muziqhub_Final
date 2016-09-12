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
	@RequestMapping ("signIn")
	public String LoginPage() {
		return "signIn";
	}
	
	@RequestMapping ("Products")
	public String ProductsPage() {
		return "Products";
	}
	@RequestMapping ("signUp")
	public String signUp() {
		return "signUp";
	}
}
