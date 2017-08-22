package test;

public class PravaWindowMethodsContainer extends PravaWindowDesigner {
	
	Prava m_prava;
	
	public PravaWindowMethodsContainer (Prava entity) throws Exception{
		
			
		this.m_prava = entity;
		this.updateData(false);
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
		textZko.setText(m_prava.prava.getNazev());
	
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
