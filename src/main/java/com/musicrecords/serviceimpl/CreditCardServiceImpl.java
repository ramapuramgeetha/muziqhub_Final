package com.musicrecords.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musicrecords.dao.CreditCardDAO;
import com.musicrecords.model.CreditCard;
import com.musicrecords.service.CreditCardService;

@Service
public class CreditCardServiceImpl implements CreditCardService {

	@Autowired
	private CreditCardDAO creditCardDAO;
	
	public CreditCardServiceImpl() {
	
	}

	@Override
	public List<CreditCard> list() {
		return creditCardDAO.list();
	}

	@Override
	public CreditCard get(long crCdNo) {
		return creditCardDAO.get(crCdNo);
	}

	@Override
	public void saveOrUpdate(CreditCard CrCard) {
		creditCardDAO.saveOrUpdate(CrCard);
		
	}

	@Override
	public void delete(long crCdNo) {
		creditCardDAO.delete(crCdNo);
		
	}

}
