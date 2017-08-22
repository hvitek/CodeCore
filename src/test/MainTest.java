package test;

import java.util.List;

import javax.persistence.Query;

import application.ConnectionBuilder;
import gui.MainWindowViewBase;

public class MainTest extends ConnectionBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(listOfTables());
		//listOfTables();
	}
	public static List<String> listOfTables()
	{
		Query sqlQuery = getConn().createNativeQuery("SELECT table_name FROM information_schema.tables WHERE table_schema='public'");
		List<String> values = sqlQuery.getResultList();
		return values;
	}
}
