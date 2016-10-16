package com.musicrecords.controller;


import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.musicrecords.dao.UserDAO;
import com.musicrecords.model.Address;
import com.musicrecords.model.Login;
import com.musicrecords.model.User;
import com.musicrecords.model.UserData;
import com.musicrecords.service.AddressService;
import com.musicrecords.service.LoginService;
import com.musicrecords.service.UserService;

@Controller
public class SignUpController {

	@Autowired
	private UserService userDao;


	 
	    @RequestMapping(value="/signUp", method = RequestMethod.GET)
	    public String viewUser() {
	        //UserData userForm = new UserData();    
	        //model.put("userForm", userForm);
	         return "signUp";
	    }
	     @ModelAttribute("userForm")
	     public UserData newuserdata()
	     {
	    	 return new UserData();
	     }
	    @RequestMapping(value="save", method = RequestMethod.POST)
	    public String processRegistration(@Valid @ModelAttribute("userForm") UserData userdata,Model  model,BindingResult result) {
	    	if(result.hasErrors()){
	    		return "signUp";
	    	}
	    	User saveUser=new User();
	    	saveUser.setUsrId(userdata.getUId());
	    	saveUser.setUsrName(userdata.getName());
	    	saveUser.setUsrEmail(userdata.getEmail());
	    	saveUser.setUsrBillAdd("stn01B");
	    	saveUser.setUsrShipAdd("stn01S");
	    	saveUser.setUsrStatus("C"); 	
	    	//saveUser.setUsrCreditCard(usrCreditCard);
	    	userDao.saveOrUpdate(saveUser);
	         
	        // for testing purpose:
	        System.out.println("username: " + userdata.getName());
	        System.out.println("id: " + userdata.getUId());
	        System.out.println("email: " + userdata.getEmail());

	         
	        return "signIn";
	    }
	
	
	/*
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView saveUser(@ModelAttribute UserData  userdata, BindingResult result) 
    {
    	User saveUser=new User();
    	saveUser.setUsrId(userdata.getUname());
    	saveUser.setUsrName(userdata.getName());
    	saveUser.setUsrEmail(userdata.getEmail());
    	saveUser.setUsrBillAdd("stn01B");
    	saveUser.setUsrShipAdd("stn01S");
    	saveUser.setUsrPhone(userdata.getPhone());
    	//saveUser.setUsrCreditCard(0123-4567-8901-1111);
    	saveUser.setUsrStatus("C");
    	
    	;
    	
    	
    	userDao.saveOrUpdate(saveUser);
    	//addressDao.saveOrUpdate(add);
    	//loginDao.saveOrUpdate(login);
    	ModelAndView modelAndView = new ModelAndView();        
        return new ModelAndView("redirect:/");
    }
	
    @RequestMapping("/")
    public ModelAndView handleRequest() throws Exception {
        List<User> listUsers = userDao.list();
        ModelAndView model = new ModelAndView("UserList");
        model.addObject("userList", listUsers);
        return model;
    }
    */
    	
}
