package com.musicrecords.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

	@RequestMapping ("/")
	public String HomePageController() {
		return "index";
		
	}

	@RequestMapping ("/index")
	public String HomePage() {
		return "index";
	}
	
	@RequestMapping ("/About")
	public String AboutPage() {
		return "About";
	}
	@RequestMapping ("Login")
	public String LoginPage() {
		return "Login";
	}
	
	@RequestMapping ("Products")
	public String ProductsPage() {
		return "Products";
	}
	@RequestMapping ("Register")
	public String RegisterPage() {
		return "index";
	}
}
