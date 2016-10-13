package com.musicrecords.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.musicrecords.model.Address;
import com.musicrecords.model.Login;
import com.musicrecords.model.User;
import com.musicrecords.service.AddressService;
import com.musicrecords.service.LoginService;
import com.musicrecords.service.UserService;

@Controller
public class SignUpController {

	@Autowired
	private UserService userDao;
	private AddressService addressDao;
	private LoginService loginDao;
	
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView saveUser(@ModelAttribute User user, 
    		@ModelAttribute Address add, 
    		@ModelAttribute Login login) 
    {
    	userDao.saveOrUpdate(user);
    	addressDao.saveOrUpdate(add);
    	loginDao.saveOrUpdate(login);
    	       
        return new ModelAndView("redirect:/");
    }
	
    /*
    @RequestMapping("/")
    public ModelAndView handleRequest() throws Exception {
        List<User> listUsers = userDao.list();
        ModelAndView model = new ModelAndView("UserList");
        model.addObject("userList", listUsers);
        return model;
    }
    */
    
	public SignUpController() {
		// TODO Auto-generated constructor stub
	}

}
