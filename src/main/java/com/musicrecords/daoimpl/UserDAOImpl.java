package com.musicrecords.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.musicrecords.dao.UserDAO;
import com.musicrecords.model.User;

@Repository
public class UserDAOImpl implements UserDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public UserDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	@Transactional
	public List<User> list() {
		@SuppressWarnings("unchecked")
		List <User> listUser = (List<User>) sessionFactory.getCurrentSession()
				.createCriteria(User.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		return listUser;
	}

	@Override
	@Transactional
	public User get(String usrId) {
		String hql = "from User where id='" + usrId +"'";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
         
        @SuppressWarnings("unchecked")
        List <User> listUser = (List<User>)query.list();
         
        if (listUser != null && !listUser.isEmpty()) {
            return listUser.get(0);
        }
         
        return null;
	}

	@Override
	@Transactional
	public void saveOrUpdate(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
		
		
	}

	@Override
	@Transactional
	public void delete(String usrId) {
		User toDelete = new User();
		toDelete.setUsrId(usrId);;
	    sessionFactory.getCurrentSession().delete(toDelete);
		
	}

}
