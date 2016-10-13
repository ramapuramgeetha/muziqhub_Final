package com.musicrecords.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.musicrecords.dao.AddressDAO;
import com.musicrecords.model.Address;




@Repository
public class AddressDAOImpl implements AddressDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public AddressDAOImpl() {
	
	}
	public AddressDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory =sessionFactory;
	}

	@Override
	@Transactional
	public List<Address> list() {
		@SuppressWarnings("unchecked")
		List <Address> listAdd = (List<Address>) sessionFactory.getCurrentSession()
				.createCriteria(Address.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		return listAdd;
	}

	@Override
	@Transactional
	public Address get(String Addid) {
		String hql = "from Address where id='" + Addid + "'";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
         
        @SuppressWarnings("unchecked")
        List <Address> listAdd = (List<Address>)query.list();
         
        if (listAdd != null && !listAdd.isEmpty()) {
            return listAdd.get(0);
        }
         
        return null;
	}

	@Override
	@Transactional
	public void saveOrUpdate(Address address) {
		sessionFactory.getCurrentSession().saveOrUpdate(address);
		
	}

	@Override
	public void delete(String Addid) {
		Address addToDelete = new Address();
		addToDelete.setAddid(Addid);
	    sessionFactory.getCurrentSession().delete(addToDelete);
		
	}

}
