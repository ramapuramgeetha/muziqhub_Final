package com.musicrecords.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musicrecords.dao.LoginDAO;
import com.musicrecords.model.Login;
import com.musicrecords.model.LoginPK;
import com.musicrecords.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginDAO loginDAO;
	
	public LoginServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Login> list() {
		return loginDAO.list();
	}

	@Override
	public Login get(LoginPK logId) {
		return loginDAO.get(logId);
	}

	@Override
	public void saveOrUpdate(Login login) {
		loginDAO.saveOrUpdate(login);
		
	}

	@Override
	public void delete(LoginPK logId) {
		loginDAO.delete(logId);
		
	}

}
