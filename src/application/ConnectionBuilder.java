package application;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
import org.springframework.jdbc.core.JdbcTemplate;

public class ConnectionBuilder{
	
	
	public static JdbcTemplate getJdbcTemplate(){
		try {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");  
	    	return (JdbcTemplate)ctx.getBean("jdbcTemplate");  		
		}
        catch(BeansException ex) {
        	System.out.println("Driver not found."); 
        	ex.printStackTrace();
        	System.exit(-1);
        	return null;
    	}
	}
}	
 
    
/*    private static String url = "jdbc:postgresql://127.0.0.1:5432/contentSimplierDb";    
    private static String driverName = "org.postgresql.Driver";   
    private static String username = "admin";   
    private static String password = "admin123";
    private static Connection conInternal;

    
    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
            	conInternal = DriverManager.getConnection(url, username, password);
            	} 
            catch (SQLException ex) 
            	{
                System.out.println("Failed to create the database connection."); 
            	}
            System.out.println("Pripojeno");
        	} 
        catch(ClassNotFoundException ex) 
        	{
            System.out.println("Driver not found."); 
        	}
        return conInternal;
    }
}*/