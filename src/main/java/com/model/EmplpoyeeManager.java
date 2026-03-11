package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmplpoyeeManager 
{
	public String insertData(Employee e1)
	{
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session se=sf.openSession();
		se.getTransaction().begin();
		se.persist(e1);
		se.getTransaction().commit();
		sf.close();
		se.close();
		return "Data inserted Successfully";
		
	}

}
