package application;

import java.io.IOException;
import java.net.SocketException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.jdbc.core.JdbcTemplate;
import ftp.FtpConnect;

public class ApplicationRunner {
	private static TestRunner con = null;
	
	public static void main(String[] args) throws SocketException, IOException {
		dbStart();	
	}
	
	
	private static void dbStart() throws SocketException, IOException
	{
		//con = ConnectionBuilder.getJdbcTemplate();
		
		con.getConn().createNativeQuery("SELECT * FROM PRAVA");
		System.out.println("DbTest");
		System.out.println(con.toString());
		FtpConnect ftpConnect = new FtpConnect();
		ftpConnect.connectToFtp();
	}


}
