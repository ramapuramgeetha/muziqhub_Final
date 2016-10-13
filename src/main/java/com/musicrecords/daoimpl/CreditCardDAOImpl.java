package com.musicrecords.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.musicrecords.dao.CreditCardDAO;
import com.musicrecords.model.CreditCard;

@Repository
public class CreditCardDAOImpl implements CreditCardDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public CreditCardDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	@Transactional
	public List<CreditCard> list() {
		@SuppressWarnings("unchecked")
		List <CreditCard> listCrCard = (List<CreditCard>) sessionFactory.getCurrentSession()
				.createCriteria(CreditCard.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		return listCrCard;
	}

	@Override
	@Transactional
	public CreditCard get(long crCdNo) {
		String hql = "from CreditCard where id=" + crCdNo ;
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
         
        @SuppressWarnings("unchecked")
        List <CreditCard> listCrCard = (List<CreditCard>)query.list();
         
        if (listCrCard != null && !listCrCard.isEmpty()) {
            return listCrCard.get(0);
        }
         
        return null;
	}

	@Override
	@Transactional
	public void saveOrUpdate(CreditCard CrCard) {
		sessionFactory.getCurrentSession().saveOrUpdate(CrCard);
		
	}

	@Override
	@Transactional
	public void delete(long crCdNo) {
		CreditCard toDelete = new CreditCard();
		toDelete.setCrCdNo(crCdNo);
	    sessionFactory.getCurrentSession().delete(toDelete);
		
	}

	
}
