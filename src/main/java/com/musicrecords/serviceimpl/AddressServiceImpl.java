package com.musicrecords.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musicrecords.dao.AddressDAO;
import com.musicrecords.daoimpl.AddressDAOImpl;
import com.musicrecords.model.Address;
import com.musicrecords.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService{
	
@Autowired
private AddressDAOImpl addressdao;
	

@Override
public List<Address> list() {
	return addressdao.list();
}

@Override
public Address get(String Addid) {
		return addressdao.get(Addid);
}

@Override
public void saveOrUpdate(Address address) {
	 addressdao.saveOrUpdate(address);
	
}

@Override
public void delete(String Addid) {
	addressdao.delete(Addid);
	
}

}
