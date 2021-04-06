package uy.baitx.HibernateConnection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SaveClients {

	public static void main(String[] args) {
		
		SessionFactory miFactory =new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Clients.class).buildSessionFactory() ;  
		Session miSesion = miFactory.openSession();  
		
		
		try {
			Clients cliente1=new Clients("Juan", "Diaz", "Gran Via");
			
			miSesion.beginTransaction();
			miSesion.save(cliente1);
			miSesion.getTransaction().commit();
			System.out.println("Registro bien en base de datos");
			
			miSesion.close();
		}finally {
			
			miFactory.close();
		}
		

	}

}