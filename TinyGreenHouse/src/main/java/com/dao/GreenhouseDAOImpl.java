package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.divo.domain.Greenhouse;

@Repository("greenhouseDAO")
public class GreenhouseDAOImpl implements GreenhouseDAO {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	@Override
	public void addGreenhouse(Greenhouse gh) {

		Session session = this.sessionFactory.getCurrentSession();
		
		session.persist(gh);
	}

	@Override
	public void updateGreenhouse(Greenhouse gh) {
		
		Session session = this.sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(gh);
	}

	@Override
	public List<Greenhouse> listGreenhouses() {

		Session session = this.sessionFactory.getCurrentSession();
		
		List<Greenhouse> ghList = session.createQuery("from Greenhouse").list();
		
		ghList.stream()
				.forEach(System.out::println);
		return ghList;
	}

	@Override
	public Greenhouse getGreenhouseById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		
		Greenhouse gh = (Greenhouse) session.load(Greenhouse.class, new Integer(id));
		return gh;
	}

	@Override
	public void removeGreenhouse(int id) {

		Session session = this.sessionFactory.getCurrentSession();
		Greenhouse gh = (Greenhouse) session.load(Greenhouse.class, new Integer(id));
		if(gh != null)
			session.delete(gh);
	}

}
