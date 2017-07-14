package com.classmiss.ClassyMissyBackend.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.classmiss.ClassyMissyBackend.model.UserDetails;

@Repository("userDetailsDAO")
public class UserDetailsDAO {
	
	
		@Autowired
		SessionFactory sessionFactory;
		
		public UserDetailsDAO(SessionFactory sessionFactory)
		{
			this.sessionFactory=sessionFactory;
		}
		
		@Transactional
		public void insertUpdateUserDetails(UserDetails userDetails) {
			Session session=sessionFactory.getCurrentSession();
			session.saveOrUpdate(userDetails);
			
		}

		public  UserDetails getUserDetails(int id)
		{
			Session session=sessionFactory.openSession();
			UserDetails userDetails=(UserDetails)session.get(UserDetails.class,id);
			session.close();
			return userDetails;
		}
		@Transactional
		public void deleteUserDetails(UserDetails userDetails)
		{
			sessionFactory.getCurrentSession().delete(userDetails);
		}
		
		public List<UserDetails> getUserDetails()
		{
			Session session=sessionFactory.openSession();
			Query query=session.createQuery("from UserDetails");
			List<UserDetails> list=query.list();
			session.close();
			return list;
		}

		
}

