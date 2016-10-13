package com.musicrecords.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.musicrecords.dao.RoleDAO;
import com.musicrecords.model.Role;

@Repository
public class RoleDAOImpl implements RoleDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public RoleDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	@Transactional
	public List<Role> list() {
		@SuppressWarnings("unchecked")
		List <Role> listRole = (List<Role>) sessionFactory.getCurrentSession()
				.createCriteria(Role.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		return listRole;
	}

	@Override
	@Transactional
	public Role get(String userName) {
		String hql = "from Role where id='" + userName +"'";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
         
        @SuppressWarnings("unchecked")
        List <Role> listRole = (List<Role>)query.list();
         
        if (listRole != null && !listRole.isEmpty()) {
            return listRole.get(0);
        }
         
        return null;
	}

	@Override
	@Transactional
	public void saveOrUpdate(Role role) {
		sessionFactory.getCurrentSession().saveOrUpdate(role);
		
	}

	@Override
	@Transactional
	public void delete(String userName) {
		Role toDelete = new Role();
		toDelete.setUserName(userName);
	    sessionFactory.getCurrentSession().delete(toDelete);
		
	}

}
