package test;

import application.ConnectionBuilder;
import model.tblPrava;



public class Prava {
	ConnectionBuilder connBuilder;
	tblPrava prava;
	
	public Prava (tblPrava tblPrava){
		
		connBuilder = new ConnectionBuilder();
		
		if(tblPrava.equals(null))
			prava = connBuilder.getConn().find(tblPrava.class, 1);
		else
			prava = connBuilder.getConn().find(tblPrava.class, tblPrava.getId());	
	}

}
