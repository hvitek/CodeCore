package test;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import composites.WorkflowComposite;

public abstract class PravaWindowDesigner {

	protected Shell shell;
	protected Composite pnlContent;
	protected Text textZko;
	protected Display display;
	private Composite pnlBody;
	
	public PravaWindowDesigner(){
		
		display = Display.getDefault();
		initialize();
		shell.open();
		
			
		
		
	}
	

	public void holdShell()
	{
		while (!shell.isDisposed()) 
		{
			if (!display.readAndDispatch()) 
				{
					display.sleep();
				}
		}
	}
	
	protected void initialize(){
		
		
		shell = new Shell();
		shell.setSize(800, 600);
		shell.setLayout(new GridLayout(1, false));
		shell.setText("Content Simplier");
				pnlContent = new Composite(shell,SWT.NONE);
				pnlContent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false,1,1));
				pnlContent.setLayout(new GridLayout(2, false));
				{
					pnlBody = new Composite(pnlContent,SWT.NONE);
					pnlBody.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true,1,1));
					pnlBody.setLayout(new GridLayout(2, false));
					{
						textZko = new Text(pnlBody, SWT.BORDER);
						textZko.setBounds(92, 61, 76, 21);
					}
				}
				{
					
					WorkflowComposite.loadStates(new Composite(pnlContent, SWT.NONE),this.getClass().getSimpleName());
					
				}
			
				
			}
	

	
}
