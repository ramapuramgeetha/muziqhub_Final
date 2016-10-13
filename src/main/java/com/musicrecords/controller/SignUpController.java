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

	
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView saveUser(@ModelAttribute User user, 
    		@ModelAttribute Address add, 
    		@ModelAttribute Login login) 
    {
    	User saveUser=new User();
    	saveUser.setUsrId("stn01");
    	saveUser.setUsrName("Nick Klaus");
    	saveUser.setUsrEmail("nick.claus@gmail.com");
    	saveUser.setUsrBillAdd("stn01B");
    	saveUser.setUsrShipAdd("stn01S");
    	saveUser.setUsrPhone("0987654321");
    	//saveUser.setUsrCreditCard(0123-4567-8901-1111);
    	saveUser.setUsrStatus("C");
    	
    	;
    	
    	
    	userDao.saveOrUpdate(saveUser);
    	//addressDao.saveOrUpdate(add);
    	//loginDao.saveOrUpdate(login);
    	       
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
