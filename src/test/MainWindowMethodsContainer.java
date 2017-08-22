package test;


public class MainWindowMethodsContainer extends MainWindowDesigner {
	
	MainWindow entity;
	
	public MainWindowMethodsContainer (MainWindow entity){
		this.entity = entity;		
	}

	
	/**
	 * Uklada nebo zobrazuje data.
	 * @param save true ... Ulozit a zobrazit, false ... Zobrazit
	 * @exception Exception
	 */
	@Override
	public void updateData(boolean save) throws Exception
	{
		if (save){
			// ulozime data
	    }
	    // zobrazime data
	}
	   
	   
	/**
	 * Povoluje / zakazuje ovladaci prvky
	 * @exception Exception
	 */
	@Override
	public void enableControls() throws Exception
	{
		// enable
		// visible
	}
}
