package composites;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import application.ConnectionBuilder;
import model.Wf;

public class WorkflowComposite extends ConnectionBuilder{

   

    public static void loadStates(Composite parent,Wf wf)
    {
        parent.setLayout(new GridLayout(1, true));
        GridData gridPaent = new GridData(SWT.RIGHT, SWT.FILL, true, true);
        gridPaent.widthHint = 143;
        parent.setLayoutData(gridPaent);
        
        
        
        
        Label labelWorkflow = new Label(parent, SWT.NONE);
		labelWorkflow.setText("WorkFlow");
      //  String dostupneStavy = getConn().find(Wf.class, arg1)
            for(int i = 0; i < 4; i++)
            {
                Button button = new Button(parent, SWT.PUSH);
                button.setText("dsadasdasd");
                button.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
                GridData gd_textZko = new GridData(SWT.FILL, SWT.FILL, true, true);
				gd_textZko.widthHint = 143;
            }
    }
    
 
   
}
