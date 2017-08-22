package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import application.ConnectionBuilder;
import model.tblPrava;

public class TestRunner extends ConnectionBuilder {

	EntityManager em = null;
	CriteriaBuilder criteriaBuilder = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Window window= new Window();
		window.open();
	}
	
	public List<String> listOfTables()
	{
		Query sqlQuery = getConn().createNativeQuery("SELECT table_name FROM public.dbtables");
		List<String> values = sqlQuery.getResultList();
		return values;
	}
	
	public void test1(tblPrava pravaoOtevirana)
	{
		
		 tblPrava prava = getConn().find(tblPrava.class, pravaoOtevirana.getId());
		 String nazev = prava.getNazev();
	}

}
