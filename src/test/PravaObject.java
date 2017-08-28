package test;

import application.ConnectionBuilder;
import model.Prava;



public class PravaObject{
	private  Prava prava;

	public PravaObject(Prava prava){
		if(prava==null)
			//TODO
			// zde by melo byt volani default
			setInstance(1);
		else
			setInstance(prava.getId());
	}
	public void setInstance(int id)
	{
		//napln prava
		this.prava = ConnectionBuilder.getConn().find(Prava.class, id);
		//TODO
		//nahraj workflow
	}
	public Prava getInstance(){return prava;}
	

	
	public void save()
	{
		//TODO
//		if(default)
//			create new
	}
	public void reset(){ConnectionBuilder.getConn().find(Prava.class, 1);}

}
