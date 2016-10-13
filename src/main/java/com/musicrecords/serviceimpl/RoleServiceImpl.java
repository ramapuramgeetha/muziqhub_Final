package com.musicrecords.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musicrecords.dao.RoleDAO;
import com.musicrecords.model.Role;
import com.musicrecords.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	private RoleDAO roleDAO;
	
	public RoleServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Role> list() {
	return roleDAO.list();
	}

	@Override
	public Role get(String userName) {
		return roleDAO.get(userName);
	}

	@Override
	public void saveOrUpdate(Role role) {
		roleDAO.saveOrUpdate(role);
		
		
	}

	@Override
	public void delete(String userName) {
	roleDAO.delete(userName);
		
	}

}
