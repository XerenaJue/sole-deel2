package DAO;

import java.util.List;

import Helper.HibernateUtil;

public class ArtikelDaoHibernate {
	
	HibernateUtil util = new HibernateUtil();

	public void save(ArtikelDaoHibernate artikelen) {
		util.openCurrentSession();
		util.getCurrentSession().save(artikelen);
		util.closeCurrentSession();
		
	}

	public void update(ArtikelDaoHibernate artikelen) {
		util.openCurrentSession();
		util.getCurrentSession().update(artikelen);
		util.closeCurrentSession();
		
	}

	public List<ArtikelDaoHibernate> findAll() {
		util.openCurrentSession();
		List<ArtikelDaoHibernate> artikelen = (List<ArtikelDaoHibernate>)util.getCurrentSession().createQuery("FROM " + ArtikelDaoHibernate.class.getSimpleName()).list();
		util.closeCurrentSession();
		return artikelen;
	}

	public ArtikelDaoHibernate findByID(long id) {
		util.openCurrentSession();
		ArtikelDaoHibernate artikel = util.getCurrentSession().get(ArtikelDaoHibernate.class, id);
		util.closeCurrentSession();
		return artikel;
	}

	public void delete(ArtikelDaoHibernate artikelen) {
		util.openCurrentSession();
		util.getCurrentSession().delete(artikelen);
		util.closeCurrentSession();
		
	}
}
