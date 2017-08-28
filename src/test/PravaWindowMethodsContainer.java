package test;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import composites.WorkflowComposite;
import model.Prava;
import model.Wf;

public class PravaWindowMethodsContainer extends PravaWindowDesigner {
	
	Wf m_wf = null;
	
	public PravaWindowMethodsContainer (Prava prava) throws Exception{		
		
		super(prava);
		

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
			m_prava.setNazev(textZko.getText());
	    }
		
	    // zobrazime data
		
		textZko.setText(m_prava.getNazev());
		
		
		
		
		
		
		
		PravaObject pravaObject = new PravaObject(m_prava);
		
		this.m_prava = pravaObject.getInstance();
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
	
	protected void loadWf(Composite parent)
	{
		WorkflowComposite.loadStates(new Composite(parent, SWT.NONE),m_prava.getWfBean());
	}
}
