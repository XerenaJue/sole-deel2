package main;


import java.sql.SQLException;
import java.util.List;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import DAO.AccountDaoHibernate;
import DAO.AdresDao;
import DAO.ArtikelDaoHibernate;
import DAO.KlantDaoHibernate;
import POJO.*;
import Service.KlantService;

public class Test {
	
	public static void main(String[] args) throws SQLException {
		
		KlantService klantService = new KlantService();
		Klant klant = new Klant();
		klant.setKlant_id(5);
		klant.setVoornaam("G");
		klant.setAchternaam("Maar");
		klant.setTussenvoegsel("de");
		klant.setEmail("gmaar@gmail.com");
		
		klantService.save(klant);
		
		List<Klant> klanten = klantService.findAll();
		
		for (Klant k : klanten) {
			System.out.println(k);
		}
		System.out.println(klantService.findById(2));
		
		Artikel artikel = new Artikel();
		artikel.setArtikel_id(6);
		artikel.setArtikel_nummer();
		artikel.setArtikel_omschrijving("Tafel");
		artikel.setArtikel_prijs(259.95);
		ArtikelDaoHibernate artikelDao = new ArtikelDaoHibernate();
		artikelDao.update(artikel);
		Artikel artikel2 = new Artikel();
		artikel2.setArtikel_nummer();
		artikel2.setArtikel_omschrijving("Bed");
		artikel2.setArtikel_prijs(399.00);
		artikelDao.save(artikel2);
		
		List<Artikel> artikelen = artikelDao.findAll();
		for (Artikel a : artikelen) {
			System.out.println(a);
		}
		System.out.println(artikelDao.findByID(2));
		
		Account account = new Account();
		account.setAccount_id(1);
		account.setAccount_naam("bleh");
		account.setCreate_datum();
		account.setKlant(klant);
		AccountDaoHibernate accountDao = new AccountDaoHibernate();
		accountDao.update(account);
	}

}
