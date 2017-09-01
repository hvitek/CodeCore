package DbManager;
//#GENERATE_IMPORTS_START

import application.ConnectionBuilder;
import model.Prava;
import model.Skupinaprav;
import model.Uzivatel;
import model.Wf;

//#GENERATE_IMPORTS_END
public class DbManager extends ConnectionBuilder {

	
	
	
		//#GENERATE_GET_START
	public static Prava getPrava(int id)
	{	
		try
		{
			Prava prava = getConn().find(Prava.class, id);
			return prava;
		}
		catch (Exception e)
		{
			System.out.println(e);
			return null;
		}			
	}
	
	public static Uzivatel getUzivatel(int id)
	{	
		try
		{
			Uzivatel uzivatel = getConn().find(Uzivatel.class, id);
			return uzivatel;
		}
		catch (Exception e)
		{
			System.out.println(e);
			return null;
		}			
	}
	
	public static Skupinaprav getSkupinaprav(int id)
	{	
		try
		{
			Skupinaprav skupinaprav = getConn().find(Skupinaprav.class, id);
			return skupinaprav;
		}
		catch (Exception e)
		{
			System.out.println(e);
			return null;
		}			
	}
	
	public static Wf getWf(int id)
	{	
		try
		{
			Wf wf = getConn().find(Wf.class, id);
			return wf;
		}
		catch (Exception e)
		{
			System.out.println(e);
			return null;
		}			
	}
	//#GENERATE_GET_END
	
	
	
	//#GENERATE_SET_START
	public static void setPrava(Prava prava)
	{
		try
		{
			getConn().merge(prava);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}		
	}
	//#GENERATE_SET_END
		
	
	
	
	//#GENERATE_FIND_START
	public static void searchFunctionBy(Class<?> _class, int id)
	{
				switch (_class.getSimpleName()) {
			    case "Prava":  
			    	getPrava(id);
			             break;
			    case "Uzivatel":  
			    	getUzivatel(id);
			             break;
			    case "Skupinaprav":  
			    	getSkupinaprav(id);
			             break;
			    case "Wf":  
			    	getWf(id);
			             break;
			   
			}	
	}

}
