package dbFunctions;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaXmlEditor {

	protected EntityManager getEntityManager(String driver, String url, String username, String password) {
	    EntityManager em = null;
	    EntityManagerFactory emf = null;
	    

		Map properties = new HashMap();
	    properties.put("javax.persistence.jdbc.driver", driver);
	    properties.put("javax.persistence.jdbc.url", url);
	    properties.put("javax.persistence.jdbc.user", username);
	    properties.put("javax.persistence.jdbc.password", password);
	    try {
	    	
	        emf = Persistence.createEntityManagerFactory("dynamicJPA", properties);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return em = (EntityManager) emf.createEntityManager();
	}
}
