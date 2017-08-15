package application;

import java.io.IOException;
import java.net.SocketException;
import org.springframework.jdbc.core.JdbcTemplate;
import ftp.FtpConnect;

public class ApplicationRunner {
	private static JdbcTemplate con = null;
	
	public static void main(String[] args) throws SocketException, IOException {
		dbStart();
		
	}
	
	
	private static void dbStart() throws SocketException, IOException
	{
		con = ConnectionBuilder.getJdbcTemplate();
		
		System.out.println("DbTest");
		System.out.println(con.toString());
		FtpConnect ftpConnect = new FtpConnect();
		ftpConnect.connectToFtp();
	}
	

}
