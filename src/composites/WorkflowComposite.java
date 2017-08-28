package composites;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class WorkflowComposite {

   

    public static void loadStates(Composite parent,String name)
    {
        parent.setLayout(new GridLayout(1, true));
        parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        //TODO natáhnout dostupné stavy z Db pro aktuální objekt, dle stringu Name
            for(int i = 0; i < 4; i++)
            {
                Button button = new Button(parent, SWT.PUSH);
                button.setText(getClearName(name));
                button.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
            }
    }
    
    private static String getClearName(String str ) {
    	
        return str.replace("WindowMethodsContainer","");
   }
   
}
