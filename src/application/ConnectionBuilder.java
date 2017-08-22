package application;

import java.sql.Connection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ConnectionBuilder{
	
	public static EntityManager getConn()
	{
		EntityManagerFactory emfactory = Persistence.
				createEntityManagerFactory( "CodeCore" );
		EntityManager entitymanager = emfactory.
				createEntityManager( );
		
		return entitymanager;
	}
	
	
}