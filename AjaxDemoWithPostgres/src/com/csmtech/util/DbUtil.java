package com.csmtech.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.csmtech.entity.Cities;
import com.csmtech.entity.Countries;
import com.csmtech.entity.States;





public class DbUtil {
	
	
	private static Configuration cfg;
	private static SessionFactory sessionfactory;
	
	public  static SessionFactory getSessionFactory() {
		
		if(sessionfactory==null) {
		
		 cfg=new Configuration();
		 cfg.addAnnotatedClass(Countries.class);
		 cfg.addAnnotatedClass(States.class);
		 cfg.addAnnotatedClass(Cities.class);
		 
		 sessionfactory=cfg.buildSessionFactory();
		}
		return sessionfactory;
	}
	

}
