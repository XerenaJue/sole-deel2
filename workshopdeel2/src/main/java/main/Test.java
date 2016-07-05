package main;


import java.sql.SQLException;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import POJO.*;

public class Test {
	
	public static void main(String[] args) throws SQLException {
		Configuration config = new Configuration();
		
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
	}

}
