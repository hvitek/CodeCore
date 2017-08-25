package test;

import java.util.List;

import javax.persistence.Query;

import application.ConnectionBuilder;
import model.Prava;

public class TestRunner extends ConnectionBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(listOfTables());
		try {

			PravaWindowMethodsContainer prava = new PravaWindowMethodsContainer(null);
			//Prava prava = ConnectionBuilder.getConn().find(Prava.class, 1);
			//System.out.println(prava.m_prava.getNazev());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static List<String> listOfTables()
	{
		Query sqlQuery = getConn().createNativeQuery("SELECT table_name FROM information_schema.tables WHERE table_schema='public'");
		List<String> values = sqlQuery.getResultList();
		return values;
	}
}
