package DAO;

import java.util.List;

import Helper.HibernateUtil;
import POJO.Factuur;

public class FactuurDaoHibernate {
	
	HibernateUtil util = new HibernateUtil();

	public void save(Factuur factuur) {
		util.openCurrentSession();
		util.getCurrentSession().save(factuur);
		util.closeCurrentSession();
		
	}

	public void update(Factuur factuur) {
		util.openSessionWithTransaction();
		util.getCurrentSession().update(factuur);
		util.closeSessionWithTransaction();
		
	}

	public List<Factuur> findAll() {
		util.openCurrentSession();
		List<Factuur> facturen = (List<Factuur>)util.getCurrentSession().createQuery("FROM " + Factuur.class.getSimpleName()).list();
		util.closeCurrentSession();
		return facturen;
	}

	public Factuur findByID(long id) {
		util.openCurrentSession();
		Factuur factuur = util.getCurrentSession().get(Factuur.class, id);
		util.closeCurrentSession();
		return factuur;
	}

	public void delete(Factuur factuur) {
		util.openSessionWithTransaction();
		util.getCurrentSession().delete(factuur);
		util.closeSessionWithTransaction();
		
	}

}
