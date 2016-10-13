package com.musicrecords.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.musicrecords.dao.LoginDAO;
import com.musicrecords.model.Login;
import com.musicrecords.model.LoginPK;

@Repository
public class LoginDAOImpl implements LoginDAO{
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public LoginDAOImpl()  {
		// TODO Auto-generated constructor stub
	}

	@Override
	@Transactional
	public List<Login> list() {
		@SuppressWarnings("unchecked")
		List <Login> listLogin = (List<Login>) sessionFactory.getCurrentSession()
				.createCriteria(Login.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		return listLogin;
	}

	@Override
	@Transactional
	public Login get(LoginPK logId) {
		String hql = "from Login where usrName='" + logId.getUsrName() +"'and usrRole='"+logId.getUsrRole()+"'" ;
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
         
        @SuppressWarnings("unchecked")
        List <Login> listLogin = (List<Login>)query.list();
         
        if (listLogin != null && !listLogin.isEmpty()) {
            return listLogin.get(0);
        }
         
        return null;
	}

	@Override
	@Transactional
	public void saveOrUpdate(Login login) {
		sessionFactory.getCurrentSession().saveOrUpdate(login);
		
	}

	@Override
	@Transactional
	public void delete(LoginPK logId) {
		Login toDelete = new Login();
		toDelete.setLogId(logId);
	    sessionFactory.getCurrentSession().delete(toDelete);
		
	}

}
