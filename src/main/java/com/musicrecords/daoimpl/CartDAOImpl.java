package com.musicrecords.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.musicrecords.dao.CartDAO;
import com.musicrecords.model.Cart;

@Repository
public class CartDAOImpl implements CartDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public CartDAOImpl() {
	
	}
	
	public CartDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory =sessionFactory;
	}

	@Override
	@Transactional
	public List<Cart> list() {
		@SuppressWarnings("unchecked")
		List <Cart> listCart = (List<Cart>) sessionFactory.getCurrentSession()
				.createCriteria(Cart.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		return listCart;
	}

	@Override
	@Transactional
	public Cart get(int cartId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void saveOrUpdate(Cart cart) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void delete(int cartId) {
		// TODO Auto-generated method stub
		
	}

}
