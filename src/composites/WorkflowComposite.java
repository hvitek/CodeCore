package composites;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Query;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;

import DbManager.DbManager;
import application.ConnectionBuilder;
import model.Wf;
import widgets.ButtonEntities;

public class WorkflowComposite extends DbManager{
   
private static Composite pnlBody;

public WorkflowComposite()
{
	

}
private Composite parentOriginal = null;

    public static void loadStates(Composite parent,Wf wf)
    {
    	
    	
        
        GridData gridPaent = new GridData(SWT.RIGHT, SWT.FILL, true, true);
        gridPaent.widthHint = 150;
        parent.setLayoutData(gridPaent);
        GridLayout gl_pnlParent = new GridLayout(1, false);
		gl_pnlParent.verticalSpacing = 0;
		gl_pnlParent.horizontalSpacing = 0;
		gl_pnlParent.marginHeight = 0;
		gl_pnlParent.marginWidth = 0;
		parent.setLayout(gl_pnlParent);

        {
			pnlBody = new Composite(parent,SWT.NONE);
			GridData gd_pnlBody = new GridData(SWT.FILL, SWT.FILL, true, true,1,1);
			pnlBody.setLayoutData(gd_pnlBody);
			GridLayout gl_pnlBody = new GridLayout(1, false);
			gl_pnlBody.marginTop = 0;
			gl_pnlBody.marginBottom = 0;
			gl_pnlBody.marginRight = 0;
			gl_pnlBody.marginHeight = 0;
			gl_pnlBody.marginWidth = 0;
			pnlBody.setLayout(gl_pnlBody);
			
			{
				Label labelWorkflow = new Label(pnlBody, SWT.NONE);
				labelWorkflow.setText("WorkFlow");
			}
			{
				Button buttonActiveState = new Button(pnlBody, SWT.PUSH);
				buttonActiveState.setText(wf.getNazev());
				buttonActiveState.setEnabled(false);
				buttonActiveState.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		        GridData gd_buttonActiveState = new GridData(SWT.FILL, SWT.FILL, true, true);
		        gd_buttonActiveState.widthHint = 143;
			}

			List<String> listPotentionalStatesNames = Arrays.asList(wf.getDostupneStavy().split("\\s*,\\s*"));
			for(int i=0;i<listPotentionalStatesNames.size();i++)
		    	{
						Query buttonText = getConn().createNativeQuery("SELECT nazev FROM wf WHERE stav='"+listPotentionalStatesNames.get(i)+"'");
						Query id = getConn().createNativeQuery("SELECT id FROM wf WHERE stav='"+listPotentionalStatesNames.get(i)+"'");
						String strButtonText = buttonText.getSingleResult().toString();
						Integer intId = Integer.parseInt(id.getSingleResult().toString());
						
						ButtonEntities buttonPotentionalStates = new ButtonEntities(pnlBody, SWT.NONE);
						buttonPotentionalStates.setButtonClass(Wf.class);
						buttonPotentionalStates.setButtonId(intId);
						buttonPotentionalStates.setText("-->"+strButtonText);
						buttonPotentionalStates.addListener(SWT.Selection, new Listener()
						{
						    @Override
						    public void handleEvent(Event event)
						    {
						        System.out.println(buttonPotentionalStates.getButtonId());
						        System.out.println(buttonPotentionalStates.getButtonClass().getSimpleName());
						        //TODO checkIfWasChanges
						        //and ask if to save. IF not, cancel, else continue to:
						        Wf wfNew = getWf(buttonPotentionalStates.getButtonId());
						        
						        
						        
						        
						        Control[] children = pnlBody.getChildren();
						        for (int i = 0 ; i < children.length; i++) {
						            children[i].dispose();
						        }
						        
						       
						        loadStates(parent, wfNew);
						        pnlBody.getShell().layout();
						       
						        
						    }
						});
		    	}
		
	    }
        
        }
		

    
 
   
}
