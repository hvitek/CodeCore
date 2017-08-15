package ftp;
import org.apache.commons.net.ftp.FTPClient;
import java.io.IOException;
import java.net.SocketException;


public class FtpConnect {
	
	public void connectToFtp() throws SocketException, IOException
	{
		FTPClient client = new FTPClient();
	
	    client.connect("localhost");
	    boolean login = client.login("contentSimplier", "heslo123");
	
	    if (login) {
	      System.out.println("Login success...");
	      boolean logout = client.logout();
	      if (logout) {
	        System.out.println("Logout from FTP server...");
	      }
	    } else {
	      System.out.println("Login fail...");
	    }
	    client.disconnect();
	}
}
