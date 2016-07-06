package DAO;

import java.util.List;

import Helper.HibernateUtil;

public class AdresTypeDaoHibernate {
	HibernateUtil util = new HibernateUtil();
	
	public void save(AdresTypeDaoHibernate adresType) {
		util.openCurrentSession();
		util.getCurrentSession().save(adresType);
		util.closeCurrentSession();
		
	}

	public void update(AdresTypeDaoHibernate adresType) {
		util.openCurrentSession();
		util.getCurrentSession().update(adresType);
		util.closeCurrentSession();
		
	}

	public List<AdresTypeDaoHibernate> findAll() {
		util.openCurrentSession();
		List<AdresTypeDaoHibernate> adresTypes = (List<AdresTypeDaoHibernate>)util.getCurrentSession().createQuery("FROM " + AdresTypeDaoHibernate.class.getSimpleName()).list();
		util.closeCurrentSession();
		return adresTypes;
	}

	public AdresTypeDaoHibernate findByID(long id) {
		util.openCurrentSession();
		AdresTypeDaoHibernate adresType = util.getCurrentSession().get(AdresTypeDaoHibernate.class, id);
		util.closeCurrentSession();
		return adresType;
	}

	public void delete(AdresTypeDaoHibernate adresType) {
		util.openCurrentSession();
		util.getCurrentSession().delete(adresType);
		util.closeCurrentSession();
		
	}

}
