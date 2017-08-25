package composites;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class WorkflowComposite {

    public static void addFourButtons(Composite parent)
    {
        parent.setLayout(new GridLayout(1, true));
        parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        for(int i = 0; i < 4; i++)
        {
            Button button = new Button(parent, SWT.PUSH);
            button.setText("Button " + i);
            button.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        }
    }

    public static void addThreeLabels(Composite parent,String name)
    {
    	
        parent.setLayout(new GridLayout(1, true));
        parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        for(int i = 0; i < 3; i++)
        {
            Label label = new Label(parent, SWT.PUSH);
            label.setText(getClearName(name));
            label.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        }
    }
    
    private static String getClearName(String str ) {
    	
    	//TODO udelat naopak
        return str.substring(str.indexOf("WindowMethodsContainer"));
   }
   
}
