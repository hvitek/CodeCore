package test;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import composites.WorkflowComposite;
import model.Prava;

import org.eclipse.swt.widgets.Label;

public abstract class PravaWindowDesigner {

	protected Shell shell;
	protected Composite pnlContent;
	protected Text textZko;
	protected Display display;
	private Composite pnlBody;
	private Label labelWorkflow;
	Prava m_prava = null;
	
	public PravaWindowDesigner(Prava prava){
		PravaObject pravaObject = new PravaObject(prava);		
		this.m_prava = pravaObject.getInstance();		
		
		
		
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
		GridLayout gl_shell = new GridLayout(1, false);
		gl_shell.verticalSpacing = 0;
		gl_shell.marginWidth = 0;
		gl_shell.marginHeight = 0;
		gl_shell.horizontalSpacing = 0;
		shell.setLayout(gl_shell);
		shell.setText("Content Simplier");
				pnlContent = new Composite(shell,SWT.NONE);
				pnlContent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false,1,1));
				GridLayout gl_pnlContent = new GridLayout(2, false);
				gl_pnlContent.verticalSpacing = 0;
				gl_pnlContent.horizontalSpacing = 0;
				gl_pnlContent.marginHeight = 0;
				gl_pnlContent.marginWidth = 0;
				pnlContent.setLayout(gl_pnlContent);
				{
					pnlBody = new Composite(pnlContent,SWT.NONE);
					GridData gd_pnlBody = new GridData(SWT.FILL, SWT.FILL, true, true,1,1);
					gd_pnlBody.widthHint = 595;
					pnlBody.setLayoutData(gd_pnlBody);
					GridLayout gl_pnlBody = new GridLayout(2, false);
					gl_pnlBody.marginTop = 5;
					gl_pnlBody.marginBottom = 5;
					gl_pnlBody.marginRight = 5;
					gl_pnlBody.marginHeight = 0;
					pnlBody.setLayout(gl_pnlBody);
					{
						textZko = new Text(pnlBody, SWT.BORDER);
						textZko.setBounds(92, 61, 76, 21);
					}
					new Label(pnlBody, SWT.NONE);
					
				}
				{

					this.loadWf(pnlContent);
					
				}
			
				
			}
	
protected abstract void loadWf(Composite pnlContent);
	
}
