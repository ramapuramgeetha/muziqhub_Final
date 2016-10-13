package com.musicrecords.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musicrecords.dao.UserDAO;
import com.musicrecords.model.User;
import com.musicrecords.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDAO;
	
	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public List<User> list() {
			return userDAO.list();
	}
	@Override
	public User get(String usrId) {
		return userDAO.get(usrId);
	}
	@Override
	public void saveOrUpdate(User user) {
		userDAO.saveOrUpdate(user);
		
	}
	@Override
	public void delete(String usrId) {
		userDAO.delete(usrId);
		
	}

}
