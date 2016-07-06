package DAO;

import java.util.List;

import Helper.HibernateUtil;

public class BestelArtikelDaoHibernate {
	
	HibernateUtil util = new HibernateUtil();
	
	public void save(BestelArtikelDaoHibernate bestelArtikel) {
		util.openCurrentSession();
		util.getCurrentSession().save(bestelArtikel);
		util.closeCurrentSession();
		
	}

	public void update(BestelArtikelDaoHibernate bestelArtikel) {
		util.openCurrentSession();
		util.getCurrentSession().update(bestelArtikel);
		util.closeCurrentSession();
		
	}

	public List<BestelArtikelDaoHibernate> findAll() {
		util.openCurrentSession();
		List<BestelArtikelDaoHibernate> bestelArtikelen = (List<BestelArtikelDaoHibernate>)util.getCurrentSession().createQuery("FROM " + 
				BestelArtikelDaoHibernate.class.getSimpleName()).list();
		util.closeCurrentSession();
		return bestelArtikelen;
	}

	public BestelArtikelDaoHibernate findByID(long id) {
		util.openCurrentSession();
		BestelArtikelDaoHibernate adres = util.getCurrentSession().get(BestelArtikelDaoHibernate.class, id);
		util.closeCurrentSession();
		return adres;
	}

	public void delete(BestelArtikelDaoHibernate bestelArtikel) {
		util.openCurrentSession();
		util.getCurrentSession().delete(bestelArtikel);
		util.closeCurrentSession();
		
	}

}
