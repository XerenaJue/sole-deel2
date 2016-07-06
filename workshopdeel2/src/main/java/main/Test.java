package main;


import java.sql.SQLException;
import java.util.List;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import DAO.KlantDaoHibernate;
import POJO.*;
import Service.KlantService;

public class Test {
	
	public static void main(String[] args) throws SQLException {
		/*Configuration config = new Configuration();
		
		config.addAnnotatedClass(Klant.class);
		config.addAnnotatedClass(Account.class);
		config.addAnnotatedClass(Adres.class);
		config.addAnnotatedClass(AdresType.class);
		config.addAnnotatedClass(Artikel.class);
		config.addAnnotatedClass(BestelArtikel.class);
		config.addAnnotatedClass(Bestelling.class);
		config.addAnnotatedClass(Betaalwijze.class);
		config.addAnnotatedClass(Betaling.class);
		config.addAnnotatedClass(Factuur.class);
		config.addAnnotatedClass(KlantHasAdres.class);
		
		config.configure("hibernate.cfg.xml");
		new SchemaExport(config).create(true, true);
		*/
		
		Klant klant = new Klant();
		klant.setVoornaam("B");
		klant.setAchternaam("Jong");
		klant.setEmail("b_Jong@gmail.com");
		
		KlantService klantService = new KlantService();
		List<Klant> klanten = klantService.findAll();
		
		for (Klant k : klanten) {
			System.out.println(k);
		}
		Artikel artikel1 = new Artikel();
		artikel1.setArtikel_nummer();
		artikel1.setArtikel_omschrijving("Stoel");
		artikel1.setArtikel_prijs(95.00);
		
		Artikel artikel2 = new Artikel();
		artikel2.setArtikel_nummer();
		artikel2.setArtikel_omschrijving("Bank");
		artikel2.setArtikel_prijs(449.95);
	}

}
