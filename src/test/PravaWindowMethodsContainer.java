package test;

import model.Prava;

public class PravaWindowMethodsContainer extends PravaWindowDesigner {
	
	Prava m_prava = null;
	
	public PravaWindowMethodsContainer (Prava prava) throws Exception{		
		
		PravaObject pravaObject = new PravaObject(prava);		
		this.m_prava = pravaObject.getInstance();
		this.updateData(false);
		holdShell();
		
		
	}


	
	/**
	 * Uklada nebo zobrazuje data.
	 * @param save true ... Ulozit a zobrazit, false ... Zobrazit
	 * @exception Exception
	 */
	public void updateData(boolean save) throws Exception
	{
		if (save){
			// ulozime data
			
	    }
		
	    // zobrazime data
		textZko.setText(m_prava.getNazev());
		
	}
	   
	   
	/**
	 * Povoluje / zakazuje ovladaci prvky
	 * @exception Exception
	 */
	public void enableControls() throws Exception
	{
		// enable
		// visible
	}
}
